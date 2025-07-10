package dados;

import dados.Departamento;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class SistemaDao {

    public static Connection conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_empresa", "root", "965673702@ray");
        return conectado;
    }

    public static ResultSet fazerLogin(String usuario, String senha) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stEntrar = conectado.prepareStatement("SELECT * FROM usuarios WHERE nm_usuario = ? AND sn_usuario = ?");
        stEntrar.setString(1, usuario);
        stEntrar.setString(2, senha);
        ResultSet resultado = stEntrar.executeQuery();
        return resultado;
    }

    public static void salvarDepartamento(Departamento departamento) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stSalvar = conectado.prepareStatement("INSERT INTO departamentos VALUES(?,?,?,?)");
        stSalvar.setString(1, departamento.getCodigo());
        stSalvar.setString(2, departamento.getNome());
        stSalvar.setString(3, departamento.getCidade());
        stSalvar.setString(4, departamento.getTelefone());
        stSalvar.executeUpdate();
    }

    public static void excluirDepartamento(String cod) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stExcluir = conectado.prepareStatement("DELETE FROM departamentos WHERE cod_departamento = ?");
        stExcluir.setString(1, cod);
        stExcluir.executeUpdate();
    }  
    
    //--------------------------------------------------------------------------------------------------------------------------------------------
    
    public static void alterarDepartamento(String codigo, String nome, String cidade, String telefone) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stAlterar = conectado.prepareStatement("UPDATE departamentos SET nm_departamento = ? , cid_departamento = ? , telefone = ? WHERE cod_departamento = ?");

        //Completa o comando SQL UPDATE preparado na linha anterior
        stAlterar.setString(1, nome);
        stAlterar.setString(2, cidade);
        stAlterar.setString(3, telefone);
        stAlterar.setString(4, codigo);

        //Executa o comando UPDATE e insere os dados digitados na tabela departamento do banco de dados
        stAlterar.executeUpdate();

    }

    public static ResultSet consultarDepartamento(String codigo, String nome, String cidade, String telefone) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM departamentos WHERE cod_departamento = ?");
        stConsultar.setString(1, codigo);
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }

    public static ResultSet pequisarDepartamentoPorNome(String nome) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM departamentos WHERE nm_departamento LIKE ?");
        stConsultar.setString(1, "%" + nome + "%");
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet pesquisarDepartamentoPorCid(String cidade) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM departamentos WHERE cid_departamento = ?");
        stConsultar.setString(1, cidade);
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet pesquisarDepartamentoPorCod(String codigo) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM departamentos WHERE cod_departamento = ?");
        stConsultar.setString(1, codigo);
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    
    }
    
    public static ResultSet listarDepartamentos() throws ClassNotFoundException, SQLException {
         Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM departamentos");
        ResultSet resultado = stConsultar.executeQuery();
         return resultado;
    }
   
 //--------------------------------------------------------------------------------------------------------------------------------------------
    
    public static void salvarUsuario(String usuario, String senha, String cargo) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stSalvar = conectado.prepareStatement("INSERT INTO usuarios VALUES(?,?,?)");
       
        //Completa o comando SQL INSERT preparado na linha anterior
        stSalvar.setString(1, usuario);
        stSalvar.setString(2, senha);
        stSalvar.setString(3, cargo);
        stSalvar.executeUpdate();
    }
    
    public static void excluirUsuario(String nome)throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        PreparedStatement stExcluir = conectado.prepareStatement("DELETE FROM usuarios WHERE nm_usuario = ?");
        stExcluir.setString(1, nome);
        stExcluir.executeUpdate();
    }
    
    public static void alterarUsuario(String nome, String senha, String cargo) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stAlterar = conectado.prepareStatement("UPDATE usuarios SET sn_usuario = ? , cgo_usuario = ? WHERE nm_usuario = ?");
        stAlterar.setString(1, senha);
        stAlterar.setString(2, cargo);
        stAlterar.setString(3, nome);
        stAlterar.executeUpdate();
    }
    
    public static ResultSet consultarUsuario(String nome, String senha, String cargo) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM usuarios WHERE nm_usuario = ?");
        stConsultar.setString(1, nome);
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet listarUsuarios() throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM usuarios");
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet pesquisarUsuarioPorCargo(String cargo)throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM usuarios WHERE cgo_usuario = ?");
        stConsultar.setString(1, cargo);
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;    
    }
    
    public static ResultSet pesquisarUsuarioPorSenha(String senha)throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM usuarios WHERE sn_usuario = ?");
        stConsultar.setString(1, senha);
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet pesquisarUsuarioPorNome(String nome)throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM usuarios WHERE nm_usuario LIKE ?");
        stConsultar.setString(1, "%" + nome + "%");
        ResultSet resultado = stConsultar.executeQuery();
        return resultado; 
    
    }
    
    //--------------------------------------------------------------------------------------------------------------------------------------------
    
    public static void salvarFuncionario(String matricula, String nome, String cargo, String salario) throws ClassNotFoundException, SQLException {
         Connection conectado = conectar();
        //Prepara um comando SQL INSERT incompleto
        PreparedStatement stSalvar = conectado.prepareStatement("INSERT INTO funcionarios VALUES(?,?,?,?)");
        //Completa o comando SQL INSERT preparado na linha anterior
        stSalvar.setString(1, matricula);
        stSalvar.setString(2, nome);
        stSalvar.setString(3, cargo);
        stSalvar.setString(4, salario);
        //Executa o comand INSERT e insere os dados digitados na tabela departamento do banco de dados
        stSalvar.executeUpdate();
    }
    
    public static void excluirFuncionario(String matricula)throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        //Prepara um comando SQL DELETE incompleto
        PreparedStatement stExcluir = conectado.prepareStatement("DELETE FROM funcionarios WHERE matricula = ?");

        //Completa o comando SQL DELETE preparado na linha anterior
        stExcluir.setString(1, matricula);

        //Executa o comando DELETE e insere os dados digitados na tabela departamento do banco de dados
        stExcluir.executeUpdate(); 
    }
    
    public static void alterarFuncionario(String matricula, String nome, String cargo, String salario) throws ClassNotFoundException, SQLException {
       Connection conectado = conectar();
        //Prepara um comando SQL UPDATE incompleto
        PreparedStatement stAlterar = conectado.prepareStatement("UPDATE funcionarios SET nome = ? , cargo = ? , salario = ? WHERE matricula = ?");

        //Completa o comando SQL UPDATE preparado na linha anterior
        stAlterar.setString(1, nome);
        stAlterar.setString(2, cargo);
        stAlterar.setString(3, salario);
        stAlterar.setString(4, matricula);

        //Executa o comando UPDATE e insere os dados digitados na tabela departamento do banco de dados
        stAlterar.executeUpdate();
    }
    
    public static ResultSet consultarFuncionario(String matricula, String nome, String cargo, String salario) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        //Define o comando SELECT incompleto (?) a ser executado na busca do departmento
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM funcionarios WHERE matricula = ?");

        //Indica qual valor será colocado no ? do comando SELECT
        stConsultar.setString(1, matricula);

        //Executa o comando SELECT criado e armazena o departamento trazido da tabela na variável resultado
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet listarFuncionarios() throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM funcionarios");
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet pesquisarFuncionarioPorMatricula(String matricula) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM funcionarios WHERE matricula = ?");
        stConsultar.setString(1, matricula);
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet pesquisarFuncionarioPorCargo(String cargo) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM funcionarios WHERE cargo = ?");
        stConsultar.setString(1, cargo);
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet pesquisarFuncionarioPorNome(String nome) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM funcionarios WHERE nome LIKE ?");
            stConsultar.setString(1, "%" + nome + "%" );
            ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet pesquisarFuncionarioPorSalario(String salario) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM funcionarios WHERE salario = ?");
        stConsultar.setString(1, salario);
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
       
}
