package telas;
import dados.SistemaDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatorioDepartamentos extends javax.swing.JFrame {

    //Construtor da classe
    public RelatorioDepartamentos() {
        initComponents();
        try {
            ResultSet resultado = SistemaDao.listarDepartamentos();
            
            //Tira um molde d tabela
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            //Limpa a tabela
            modeloTabela.setRowCount(0);
            //fazer enquanto tiver departamento na variável resultado
            while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("cod_departamento"),
                resultado.getString("nm_departamento"),
                resultado.getString("cid_departamento"),
                resultado.getString("telefone")                
              };
              modeloTabela.addRow(dep);
              cmbCodigo.addItem(resultado.getString("cod_departamento"));
              cmbCidade.addItem(resultado.getString("cid_departamento"));
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
        tblDepartamentos = new javax.swing.JTable();
        lblCodigo = new javax.swing.JLabel();
        cmbCodigo = new javax.swing.JComboBox<>();
        lblCidade = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        setTitle("Relatório de departamentos");
        getContentPane().setLayout(null);

        tblDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cidade", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tblDepartamentos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 70, 660, 220);

        lblCodigo.setText("Código");
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(30, 20, 80, 40);

        cmbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCodigo);
        cmbCodigo.setBounds(90, 20, 100, 40);

        lblCidade.setText("Cidade");
        getContentPane().add(lblCidade);
        lblCidade.setBounds(210, 20, 80, 40);

        cmbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCidade);
        cmbCidade.setBounds(260, 20, 130, 40);

        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(410, 20, 50, 40);
        getContentPane().add(txtNome);
        txtNome.setBounds(460, 20, 110, 40);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(580, 20, 100, 40);

        setSize(new java.awt.Dimension(723, 343));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoActionPerformed
        try {
            ResultSet resultado = SistemaDao.pesquisarDepartamentoPorCod(cmbCodigo.getSelectedItem().toString());
            
            //Tira um molde d tabela
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            //Limpa a tabela
            modeloTabela.setRowCount(0);
            //fazer enquanto tiver departamento na variável resultado
            while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("cod_departamento"),
                resultado.getString("nm_departamento"),
                resultado.getString("cid_departamento"),
                resultado.getString("telefone")                
              };
              modeloTabela.addRow(dep);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        
    }//GEN-LAST:event_cmbCodigoActionPerformed

    private void cmbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCidadeActionPerformed
        try {
           ResultSet resultado = SistemaDao.pesquisarDepartamentoPorCid(cmbCidade.getSelectedItem().toString());
            
            //Tira um molde d tabela
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            //Limpa a tabela
            modeloTabela.setRowCount(0);
            //fazer enquanto tiver departamento na variável resultado
            while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("cod_departamento"),
                resultado.getString("nm_departamento"),
                resultado.getString("cid_departamento"),
                resultado.getString("telefone")                
              };
              modeloTabela.addRow(dep);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        
    }//GEN-LAST:event_cmbCidadeActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            ResultSet resultado = SistemaDao.pequisarDepartamentoPorNome(txtNome.getText());
            
//Tira um molde d tabela
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            //Limpa a tabela
            modeloTabela.setRowCount(0);
            //fazer enquanto tiver departamento na variável resultado
            while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("cod_departamento"),
                resultado.getString("nm_departamento"),
                resultado.getString("cid_departamento"),
                resultado.getString("telefone")                
              };
              modeloTabela.addRow(dep);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }//GEN-LAST:event_btnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JComboBox<String> cmbCodigo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblDepartamentos;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
