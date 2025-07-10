package telas;

import dados.SistemaDao;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class ControleFuncionario extends javax.swing.JFrame {

    public ControleFuncionario(String op) {
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

        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        lblSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();

        setName("Controle Funcionarios"); // NOI18N
        getContentPane().setLayout(null);

        lblMatricula.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblMatricula.setText("Matricula");
        getContentPane().add(lblMatricula);
        lblMatricula.setBounds(20, 20, 100, 40);

        txtMatricula.setBackground(new java.awt.Color(208, 195, 195));
        txtMatricula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtMatricula);
        txtMatricula.setBounds(120, 20, 210, 40);

        lblNome.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(20, 80, 100, 40);

        txtNome.setBackground(new java.awt.Color(208, 195, 195));
        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNome);
        txtNome.setBounds(120, 80, 210, 40);

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
        btnSalvar.setBounds(380, 210, 130, 40);

        lblSalario.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblSalario.setText("Salário");
        getContentPane().add(lblSalario);
        lblSalario.setBounds(20, 200, 100, 40);

        txtSalario.setBackground(new java.awt.Color(208, 195, 195));
        txtSalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtSalario);
        txtSalario.setBounds(120, 200, 210, 40);

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
        btnLimpar.setBounds(380, 140, 130, 40);

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
        btnExcluir.setBounds(380, 20, 130, 40);

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
        btnAlterar.setBounds(380, 80, 130, 40);

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
        btnConsultar.setBounds(380, 210, 130, 40);

        setSize(new java.awt.Dimension(554, 363));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtMatricula.getText().equals("")){
            JOptionPane.showMessageDialog(null,"O usuário é obrigatório");
            txtMatricula.requestFocus();
            return; // para a execução do programa
        }

        if(txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(null,"A senha é obrigatória");
            txtNome.requestFocus();
            return; // para a execução do programa
        }
        
        if(txtCargo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"O cargo é obrigatório");
            txtCargo.requestFocus();
            return; // para a execução do programa
        }
        
        if(txtSalario.getText().equals("")){
            JOptionPane.showMessageDialog(null,"O cargo é obrigatório");
            txtSalario.requestFocus();
            return; // para a execução do programa
        }

        try {
            SistemaDao.salvarFuncionario(txtMatricula.getText(), txtNome.getText(), txtCargo.getText(), txtSalario.getText());
            
            //Mostra a mensagem de confirmação da inclusão do registro na tabela do banco de dados
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
            //Limpar os campos na tela
            txtMatricula.setText("");
            txtNome.setText("");
            txtCargo.setText("");
            txtSalario.setText("");
            //Colocar o cursor no campo Matricula
            txtMatricula.requestFocus();
        } catch (ClassNotFoundException ex) {
            //Se a classe do driver JDBC não estiver na Library do projeto, mostra a mensagem de erro abaixo
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            //Se você errou alguma informação do banco de dados mostra a mensagem abaixo
            if(ex.getMessage().contains("Duplicate entry")){
                JOptionPane.showMessageDialog(null,"Este funcionário " + txtNome.getText() + " já está cadastrado");
                txtNome.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtMatricula.setText("");
        txtNome.setText("");
        txtCargo.setText("");
        txtSalario.setText("");
        
        txtMatricula.requestFocus();
        
        btnExcluir.setVisible(false);
        btnAlterar.setVisible(false);
        btnLimpar.setVisible(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (txtMatricula.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O código é obrigatório");
            txtMatricula.requestFocus();
            return; // para a execução do programa
        }
        try {
            SistemaDao.excluirFuncionario(txtMatricula.getText());
            
            //Mostra a mensagem de confirmação da exclusao do registro na tabela do banco de dados
            JOptionPane.showMessageDialog(null, "Funcionario excluído com sucesso");
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnLimpar.setVisible(false);
            
            //Limpar os campos na tela
            txtMatricula.setText("");
            txtNome.setText("");
            txtCargo.setText("");
            txtSalario.setText("");
            
            //Colocar o cursor no campo código
            txtMatricula.requestFocus();
        } catch (ClassNotFoundException ex) {
            //Se a classe do driver JDBC não estiver na Library do projeto, mostra a mensagem de erro abaixo
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (txtMatricula.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O código é obrigatório");
            txtMatricula.requestFocus();
            return; // para a execução do programa
        }
        try {
            SistemaDao.alterarFuncionario(txtMatricula.getText(), txtNome.getText(), txtCargo.getText(), txtSalario.getText());
            
            //Mostra a mensagem de confirmação da alteração do registro na tabela do banco de dados
            JOptionPane.showMessageDialog(null, "Departamento alterado com sucesso");
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnLimpar.setVisible(false);
            
            //Limpar os campos na tela
            txtMatricula.setText("");
            txtNome.setText("");
            txtCargo.setText("");
            txtSalario.setText("");
            
            //Colocar o cursor no campo código
            txtMatricula.requestFocus();
            
        } catch (ClassNotFoundException ex) {
            //Se a classe do driver JDBC não estiver na Library do projeto, mostra a mensagem de erro abaixo
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            ResultSet resultado = SistemaDao.consultarFuncionario(txtMatricula.getText(), txtNome.getText(),txtCargo.getText(),txtSalario.getText());;
            
            if (resultado.next()) { //Se encontrou os dados do departamento
                //Carregar os dados do departamento nos campos do formulário
                txtMatricula.setText(resultado.getString("matricula"));
                txtNome.setText(resultado.getString("nome"));
                txtCargo.setText(resultado.getString("cargo"));
                txtSalario.setText(resultado.getString("salario"));
                
                btnExcluir.setVisible(true);
                btnAlterar.setVisible(true);
                btnLimpar.setVisible(true);
            } else { //Se não encontrou o dados do departamento
                //Mostra uma mensagem indicando que o departamento não foi encontrado
                JOptionPane.showMessageDialog(null, "Departamento não encontrado");
                //Posiciona o cursor no campo txtCodigo
                txtMatricula.requestFocus();
            }
        } catch (ClassNotFoundException ex) {
            //Se der erro na linha do comndo Class.Forname, exibe esta mensagem
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            //Se você digitou alguma coisa do banco de dados incorretamente (nome do banco, nome da tabela, senha)
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
