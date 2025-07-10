package telas;

import dados.Departamento;

import dados.SistemaDao;
import javax.swing.JOptionPane;
import java.sql.Connection; //Conectar ao Banco de dados
import java.sql.SQLException; //Para mostrar erros relacionados ao Banco de dados
import java.sql.PreparedStatement; //Para inserir os dados no banco de dados usando o comado SQL INSERT
import java.sql.DriverManager; //Para informar o nome do Banco de dados, a senha etc.
import java.sql.ResultSet; //Guardar o resultado da consulta feita pelo código do departamento

public class ControleDepartamentos extends javax.swing.JFrame {

    public ControleDepartamentos(String op) {
        initComponents();
        if (op.equalsIgnoreCase("cadastrar")) {
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnLimpar.setVisible(false);
            btnConsultar.setVisible(false);
        } else if (op.equalsIgnoreCase("consultar") || op.equalsIgnoreCase("excluir") || op.equalsIgnoreCase("alterar")) {
            btnSalvar.setVisible(false);
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnLimpar.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setTitle("Controle de Departamentos");
        getContentPane().setLayout(null);

        lblCodigo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblCodigo.setText("Código");
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(20, 20, 100, 40);

        txtCodigo.setBackground(new java.awt.Color(208, 195, 195));
        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(120, 20, 210, 40);

        lblNome.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(20, 80, 100, 40);

        txtNome.setBackground(new java.awt.Color(208, 195, 195));
        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNome);
        txtNome.setBounds(120, 80, 300, 40);

        lblCidade.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblCidade.setText("Cidade");
        getContentPane().add(lblCidade);
        lblCidade.setBounds(20, 140, 100, 40);

        txtCidade.setBackground(new java.awt.Color(208, 195, 195));
        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtCidade);
        txtCidade.setBounds(120, 140, 240, 40);

        lblTelefone.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblTelefone.setText("Telefone");
        getContentPane().add(lblTelefone);
        lblTelefone.setBounds(20, 200, 100, 40);

        txtTelefone.setBackground(new java.awt.Color(208, 195, 195));
        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(120, 200, 210, 40);

        btnSalvar.setBackground(new java.awt.Color(173, 186, 200));
        btnSalvar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 51, 153));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(440, 210, 130, 40);

        btnConsultar.setBackground(new java.awt.Color(194, 212, 231));
        btnConsultar.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(0, 51, 204));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(440, 210, 130, 40);

        btnLimpar.setBackground(new java.awt.Color(194, 212, 231));
        btnLimpar.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(0, 51, 204));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar);
        btnLimpar.setBounds(440, 160, 130, 40);

        btnExcluir.setBackground(new java.awt.Color(194, 212, 231));
        btnExcluir.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 51, 204));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(440, 60, 130, 40);

        btnAlterar.setBackground(new java.awt.Color(194, 212, 231));
        btnAlterar.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(0, 51, 204));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(440, 110, 130, 40);

        setSize(new java.awt.Dimension(608, 357));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O código é obrigatório");
            txtCodigo.requestFocus();
            return; // para a execução do programa
        }

        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O nome é obrigatório");
            txtNome.requestFocus();
            return; // para a execução do programa
        }

        Departamento departamento = new Departamento();
            departamento.setCodigo(txtCodigo.getText());
            departamento.setNome(txtNome.getText());
            departamento.setCidade(txtCidade.getText());
            departamento.setTelefone(txtTelefone.getText());
        
        try {
            SistemaDao.salvarDepartamento(departamento);
            
            //Mostra a mensagem de confirmação da inclusão do registro na tabela do banco de dados
            JOptionPane.showMessageDialog(null, "Departamento cadastrado com sucesso");
            
            //Limpar os campos na tela
            limparTela();
            
        } catch (ClassNotFoundException ex) {
            //Se a classe do driver JDBC não estiver na Library do projeto, mostra a mensagem de erro abaixo
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            //Se você errou alguma informação do banco de dados mostra a mensagem abaixo
            if (ex.getMessage().contains("Duplicate entry")) {
                JOptionPane.showMessageDialog(null, "Este departamento de código " + txtCodigo.getText() + " já está cadastrado");
                txtCodigo.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            ResultSet resultado = SistemaDao.consultarDepartamento(txtCodigo.getText(), txtNome.getText(), txtCidade.getText(), txtTelefone.getText());
            
            if (resultado.next()) { //Se encontrou os dados do departamento
                //Carregar os dados do departamento nos campos do formulário
                txtNome.setText(resultado.getString("nm_departamento"));
                txtCidade.setText(resultado.getString("cid_departamento"));
                txtTelefone.setText(resultado.getString("telefone"));
                
                btnExcluir.setVisible(true);
                btnAlterar.setVisible(true);
                btnLimpar.setVisible(true);
            } else { //Se não encontrou o dados do departamento
                //Mostra uma mensagem indicando que o departamento não foi encontrado
                JOptionPane.showMessageDialog(null, "Departamento não encontrado");
                //Posiciona o cursor no campo txtCodigo
                txtCodigo.requestFocus();
            }
        } catch (ClassNotFoundException ex) {
            //Se der erro na linha do comndo Class.Forname, exibe esta mensagem
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            //Se você digitou alguma coisa do banco de dados incorretamente (nome do banco, nome da tabela, senha)
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparTela();
      
        btnExcluir.setVisible(false);
        btnAlterar.setVisible(false);
        btnLimpar.setVisible(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O código é obrigatório");
            txtCodigo.requestFocus();
            return; // para a execução do programa
        }
        try {
            SistemaDao.excluirDepartamento(txtCodigo.getText());
            
            //Mostra a mensagem de confirmação da exclusao do registro na tabela do banco de dados
            JOptionPane.showMessageDialog(null, "Departamento excluído com sucesso");
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnLimpar.setVisible(false);
            //Limpar os campos na tela
            limparTela();
        } catch (ClassNotFoundException ex) {
            //Se a classe do driver JDBC não estiver na Library do projeto, mostra a mensagem de erro abaixo
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O código é obrigatório");
            txtCodigo.requestFocus();
            return; // para a execução do programa
        }
        try {
            SistemaDao.alterarDepartamento(txtCodigo.getText(), txtNome.getText(), txtCidade.getText(), txtTelefone.getText());
           
            //Mostra a mensagem de confirmação da alteração do registro na tabela do banco de dados
            JOptionPane.showMessageDialog(null, "Departamento alterado com sucesso");
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnLimpar.setVisible(false);
            
            //Limpar os campos na tela
            limparTela();
            
        } catch (ClassNotFoundException ex) {
            //Se a classe do driver JDBC não estiver na Library do projeto, mostra a mensagem de erro abaixo
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void limparTela(){
        txtCodigo.setText("");
        txtNome.setText("");
        txtCidade.setText("");
        txtTelefone.setText("");  
        txtCodigo.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
