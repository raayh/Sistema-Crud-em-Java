package telas;

import dados.SistemaDao;
//Guarda na memória a conexão feita com o banco de dados
import java.sql.Connection;
//Indica o que deve ser feito se você errar as informações do bnco de dados
import java.sql.SQLException;
//Executar comandos da linguagem SQL (INSERT, SELECT, DELETE e UPDATE)
import java.sql.PreparedStatement;
//Guardar o que um comando SELECT retorna do banco de dados
import java.sql.ResultSet;
//Serve para exibir caixas de diálogo de mensagens 
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        ckbVisualizarSenha = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso ao sistema");
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 204));
        lblUsuario.setText("Usuário:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(20, 30, 80, 30);

        txtUsuario.setBackground(new java.awt.Color(238, 226, 226));
        txtUsuario.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(100, 30, 230, 40);

        lblSenha.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(0, 0, 204));
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(20, 90, 80, 30);

        txtSenha.setBackground(new java.awt.Color(238, 226, 226));
        txtSenha.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(txtSenha);
        txtSenha.setBounds(100, 90, 230, 40);

        btnEntrar.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(0, 0, 204));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(20, 180, 140, 50);

        ckbVisualizarSenha.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        ckbVisualizarSenha.setForeground(new java.awt.Color(0, 0, 204));
        ckbVisualizarSenha.setText("Visualizar a senha");
        getContentPane().add(ckbVisualizarSenha);
        ckbVisualizarSenha.setBounds(100, 140, 150, 26);

        setSize(new java.awt.Dimension(396, 301));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try {
            ResultSet resultado = SistemaDao.fazerLogin(txtUsuario.getText(),txtSenha.getText());
            
            if (resultado.next()) { //Se encontrou os dados do usuário
                String usuario, cargo;
                usuario = resultado.getString("nm_usuario");
                cargo = resultado.getString("cgo_usuario");
                dispose(); //Fecha a tela de login
                new TelaMenu(usuario, cargo).setVisible(true); //abre a tela de menu
            } else { //Se não encontrou o dados do usuário
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos");
                txtUsuario.requestFocus();
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JCheckBox ckbVisualizarSenha;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
