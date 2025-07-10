package telas;
import dados.SistemaDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatorioUsuario extends javax.swing.JFrame {

    public RelatorioUsuario() {
        initComponents();
        try {
            ResultSet resultado = SistemaDao.listarUsuarios();
            //Tira um molde d tabela
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblUsuarios.getModel();
            //Limpa a tabela
            modeloTabela.setRowCount(0);
            //fazer enquanto tiver departamento na variável resultado
            while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("nm_usuario"),
                resultado.getString("sn_senha"),
                resultado.getString("cgo_usuario")         
              };
              modeloTabela.addRow(dep);
              cmbCargo.addItem(resultado.getString("cgo_usuario"));
              
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        lblCodigo = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        lblCargo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        lblSenha = new javax.swing.JLabel();
        cmbSenha = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Senha", "Cargo"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 660, 220);

        lblCodigo.setText("Nome");
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(60, 20, 40, 40);

        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(550, 20, 100, 40);

        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(500, 20, 50, 40);
        getContentPane().add(txtNome);
        txtNome.setBounds(110, 20, 110, 40);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(700, 20, 100, 40);

        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(280, 20, 50, 40);

        cmbSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbSenha);
        cmbSenha.setBounds(330, 20, 100, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
        try {
            ResultSet resultado = SistemaDao.pesquisarDepartamentoPorCod(cmbCargo.getSelectedItem().toString());
            //Tira um molde d tabela
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblUsuarios.getModel();
            //Limpa a tabela
            modeloTabela.setRowCount(0);
            //fazer enquanto tiver departamento na variável resultado
            while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("nm_usuario"),
                resultado.getString("sn_senha"),
                resultado.getString("cgo_usuario")         
              };
                modeloTabela.addRow(dep);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbCargoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            ResultSet resultado = SistemaDao.pesquisarDepartamentoPorCod(txtNome.getText());
            //Tira um molde d tabela
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblUsuarios.getModel();
            //Limpa a tabela
            modeloTabela.setRowCount(0);
            //fazer enquanto tiver departamento na variável resultado
           while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("nm_usuario"),
                resultado.getString("sn_senha"),
                resultado.getString("cgo_usuario")         
              };
                modeloTabela.addRow(dep);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void cmbSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSenhaActionPerformed
        try {
            ResultSet resultado = SistemaDao.pesquisarDepartamentoPorCod(cmbSenha.getSelectedItem().toString());

            //Tira um molde d tabela
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblUsuarios.getModel();
            //Limpa a tabela
            modeloTabela.setRowCount(0);
            //fazer enquanto tiver departamento na variável resultado
            while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("nm_usuario"),
                resultado.getString("sn_senha"),
                resultado.getString("cgo_usuario")         
              };
                modeloTabela.addRow(dep);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbSenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JComboBox<String> cmbSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
