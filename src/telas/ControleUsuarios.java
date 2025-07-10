package telas;

import dados.SistemaDao;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class ControleUsuarios extends javax.swing.JFrame {

    public ControleUsuarios(String op) {
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

        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();

        setTitle("Cadastro de Usuários");
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(20, 20, 100, 40);

        txtUsuario.setBackground(new java.awt.Color(208, 195, 195));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(120, 20, 210, 40);

        lblSenha.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(20, 80, 100, 40);

        txtSenha.setBackground(new java.awt.Color(208, 195, 195));
        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtSenha);
        txtSenha.setBounds(120, 80, 210, 40);

        lblCargo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(20, 140, 100, 40);

        txtCargo.setBackground(new java.awt.Color(208, 195, 195));
        txtCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtCargo);
        txtCargo.setBounds(120, 140, 210, 40);

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(360, 200, 120, 40);

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
        btnLimpar.setBounds(360, 140, 130, 40);

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
        btnExcluir.setBounds(360, 20, 130, 40);

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
        btnAlterar.setBounds(360, 80, 130, 40);

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
        btnConsultar.setBounds(360, 200, 130, 40);

        setSize(new java.awt.Dimension(524, 306));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(null,"O usuário é obrigatório");
            txtUsuario.requestFocus();
            return; // para a execução do programa
        }
        
        if(txtSenha.getText().equals("")){
            JOptionPane.showMessageDialog(null,"A senha é obrigatória");
            txtSenha.requestFocus();
            return; // para a execução do programa
        }

        try {
            SistemaDao.salvarUsuario(txtUsuario.getText(), txtSenha.getText(), txtCargo.getText());
            //Executa o comand INSERT e insere os dados digitados na tabela departamento do banco de dados
            
            //Mostra a mensagem de confirmação da inclusão do registro na tabela do banco de dados
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
            //Limpar os campos na tela
            limparTela();
            
        } catch (ClassNotFoundException ex) {
            //Se a classe do driver JDBC não estiver na Library do projeto, mostra a mensagem de erro abaixo
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            //Se você errou alguma informação do banco de dados mostra a mensagem abaixo
            if(ex.getMessage().contains("Duplicate entry")){
               JOptionPane.showMessageDialog(null,"Este usuário " + txtUsuario.getText() + " já está cadastrado");
               txtUsuario.requestFocus();
            } else {           
               JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } 
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparTela();

        btnExcluir.setVisible(false);
        btnAlterar.setVisible(false);
        btnLimpar.setVisible(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         if(txtUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(null,"O usuário é obrigatório");
            txtUsuario.requestFocus();
            return; // para a execução do programa
        }
        
        if(txtSenha.getText().equals("")){
            JOptionPane.showMessageDialog(null,"A senha é obrigatória");
            txtSenha.requestFocus();
            return; // para a execução do programa
        }
        
        try {
            SistemaDao.excluirUsuario(txtUsuario.getText());
            
            //Mostra a mensagem de confirmação da exclusao do registro na tabela do banco de dados
            JOptionPane.showMessageDialog(null, "Usuario excluído com sucesso");
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
        if(txtUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(null,"O usuário é obrigatório");
            txtUsuario.requestFocus();
            return; // para a execução do programa
        }
        
        if(txtSenha.getText().equals("")){
            JOptionPane.showMessageDialog(null,"A senha é obrigatória");
            txtSenha.requestFocus();
            return; // para a execução do programa
        }
        
        try {
            SistemaDao.alterarUsuario(txtUsuario.getText(), txtSenha.getText(), txtCargo.getText());

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

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            ResultSet resultado = SistemaDao.consultarUsuario(txtUsuario.getText(), txtSenha.getText(), txtCargo.getText());
            
            if (resultado.next()) { //Se encontrou os dados do departamento
                //Carregar os dados do departamento nos campos do formulário
                txtUsuario.setText(resultado.getString("nm_usuario"));
                txtSenha.setText(resultado.getString("sn_usuario"));
                txtCargo.setText(resultado.getString("cgo_usuario"));
                
                btnExcluir.setVisible(true);
                btnAlterar.setVisible(true);
                btnLimpar.setVisible(true);
            } else { //Se não encontrou o dados do departamento
                //Mostra uma mensagem indicando que o departamento não foi encontrado
                JOptionPane.showMessageDialog(null, "Departamento não encontrado");
                //Posiciona o cursor no campo txtCodigo
                txtUsuario.requestFocus();
            }
        } catch (ClassNotFoundException ex) {
            //Se der erro na linha do comndo Class.Forname, exibe esta mensagem
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            //Se você digitou alguma coisa do banco de dados incorretamente (nome do banco, nome da tabela, senha)
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void limparTela(){
        txtUsuario.setText("");
        txtSenha.setText("");
        txtCargo.setText("");
        txtUsuario.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
