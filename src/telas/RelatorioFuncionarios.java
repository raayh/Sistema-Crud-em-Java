package telas;
import dados.SistemaDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatorioFuncionarios extends javax.swing.JFrame {

       public RelatorioFuncionarios() {
        initComponents();
        try {
            ResultSet resultado = SistemaDao.listarFuncionarios();
            
            //Tira um molde d tabela
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblFuncionarios.getModel();
            //Limpa a tabela
            modeloTabela.setRowCount(0);
            //fazer enquanto tiver departamento na variável resultado
            while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("matricula"),
                resultado.getString("nome"),
                resultado.getString("cargo"),
                resultado.getString("salário")                
              };
              modeloTabela.addRow(dep);
              cmbMatricula.addItem(resultado.getString("matricula"));
              cmbCargo.addItem(resultado.getString("cargo"));
              cmbSalario.addItem(resultado.getString("salario"));
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
        tblFuncionarios = new javax.swing.JTable();
        lblMatricula = new javax.swing.JLabel();
        cmbMatricula = new javax.swing.JComboBox<>();
        lblCargo = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        lblSalario = new javax.swing.JLabel();
        cmbSalario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "Cargo", "Salário"
            }
        ));
        jScrollPane1.setViewportView(tblFuncionarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 740, 240);

        lblMatricula.setText("Matricula");
        getContentPane().add(lblMatricula);
        lblMatricula.setBounds(20, 20, 50, 40);

        cmbMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbMatricula);
        cmbMatricula.setBounds(70, 20, 100, 40);

        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(200, 20, 40, 40);

        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(240, 20, 110, 40);

        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(540, 20, 40, 40);
        getContentPane().add(txtNome);
        txtNome.setBounds(580, 20, 110, 40);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(710, 20, 100, 40);

        lblSalario.setText("Salário");
        getContentPane().add(lblSalario);
        lblSalario.setBounds(370, 20, 40, 40);

        cmbSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSalarioActionPerformed(evt);
            }
        });
        getContentPane().add(cmbSalario);
        cmbSalario.setBounds(410, 20, 110, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMatriculaActionPerformed
        try {
            ResultSet resultado = SistemaDao.pesquisarFuncionarioPorMatricula(cmbMatricula.getSelectedItem().toString());
            
            //Tira um molde d tabela
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblFuncionarios.getModel();
            //Limpa a tabela
            modeloTabela.setRowCount(0);
            //fazer enquanto tiver departamento na variável resultado
            while (resultado.next()) {
                Object dep[] = {
                    resultado.getString("matricula"),
                    resultado.getString("nome"),
                    resultado.getString("cargo"),
                    resultado.getString("salario")
                };
                modeloTabela.addRow(dep);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbMatriculaActionPerformed

    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
        try {
            ResultSet resultado = SistemaDao.pesquisarFuncionarioPorMatricula(cmbCargo.getSelectedItem().toString());
            
            //Tira um molde d tabela
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblFuncionarios.getModel();
            //Limpa a tabela
            modeloTabela.setRowCount(0);
            //fazer enquanto tiver departamento na variável resultado
           while (resultado.next()) {
                Object dep[] = {
                    resultado.getString("matricula"),
                    resultado.getString("nome"),
                    resultado.getString("cargo"),
                    resultado.getString("salario")
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
            ResultSet resultado = SistemaDao.pesquisarFuncionarioPorMatricula(txtNome.getText());
            
            //Tira um molde d tabela
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblFuncionarios.getModel();
            //Limpa a tabela
            modeloTabela.setRowCount(0);
            //fazer enquanto tiver departamento na variável resultado
           while (resultado.next()) {
                Object dep[] = {
                    resultado.getString("matricula"),
                    resultado.getString("nome"),
                    resultado.getString("cargo"),
                    resultado.getString("salario")
                };
                modeloTabela.addRow(dep);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void cmbSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSalarioActionPerformed
        try {
            ResultSet resultado = SistemaDao.pesquisarFuncionarioPorMatricula(cmbSalario.getSelectedItem().toString());
            
            //Tira um molde d tabela
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblFuncionarios.getModel();
            //Limpa a tabela
            modeloTabela.setRowCount(0);
            //fazer enquanto tiver departamento na variável resultado
           while (resultado.next()) {
                Object dep[] = {
                    resultado.getString("matricula"),
                    resultado.getString("nome"),
                    resultado.getString("cargo"),
                    resultado.getString("salario")
                };
                modeloTabela.addRow(dep);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbSalarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JComboBox<String> cmbMatricula;
    private javax.swing.JComboBox<String> cmbSalario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
