package telas;

public class TelaMenu extends javax.swing.JFrame {
    //Construtor da classe TelaMenu
    public TelaMenu(String usuario, String cargo) {
        initComponents();
        lblSaudacao.setText("Bem-vindo " + usuario + " (" + cargo + ")");
        if(!(cargo.equalsIgnoreCase("Gerente") || cargo.equalsIgnoreCase("Presidente")) ){
            mnuUsuarios.setVisible(false);
            itmCadastrarDepartamentos.setEnabled(false);
            itmAlterarDepartamentos.setEnabled(false);
            itmExcluirDepartamentos.setEnabled(false);
            itmConsultarDepartamentos.setEnabled(false);
            itmCadastrarFuncionarios.setEnabled(false);
            itmAlterarFuncionarios.setEnabled(false);
            itmExcluirFuncionarios.setEnabled(false);
            itmConsultarFuncionarios.setEnabled(false);
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblSaudacao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuDepartamentos = new javax.swing.JMenu();
        itmCadastrarDepartamentos = new javax.swing.JMenuItem();
        itmConsultarDepartamentos = new javax.swing.JMenuItem();
        itmAlterarDepartamentos = new javax.swing.JMenuItem();
        itmExcluirDepartamentos = new javax.swing.JMenuItem();
        mnuRelatoriosDepartamentos = new javax.swing.JMenu();
        itmRelatorioGeralDepartamentos = new javax.swing.JMenuItem();
        itmRelatorioPorCidadeDepartamentos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmSair = new javax.swing.JMenuItem();
        mnuFuncionarios = new javax.swing.JMenu();
        itmCadastrarFuncionarios = new javax.swing.JMenuItem();
        itmAlterarFuncionarios = new javax.swing.JMenuItem();
        itmConsultarFuncionarios = new javax.swing.JMenuItem();
        itmExcluirFuncionarios = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itmRelatoriosFuncionario = new javax.swing.JMenuItem();
        mnuUsuarios = new javax.swing.JMenu();
        itmCadatrarUsuario = new javax.swing.JMenuItem();
        itmAlterarUsuario = new javax.swing.JMenuItem();
        itmConsultarUsuario = new javax.swing.JMenuItem();
        itmExcluirUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itmRelatoriosUsuario = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        itmManualUsuarioAjuda = new javax.swing.JMenuItem();
        itmSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu do sitema");
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 51, 102));
        jButton1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("Destaque");
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 200, 150, 50);

        lblSaudacao.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(210, 0, 310, 50);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-40, -20, 570, 310);

        mnuDepartamentos.setText("Departamentos");

        itmCadastrarDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarDepartamentos.setText("Cadastrar");
        itmCadastrarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmCadastrarDepartamentos);

        itmConsultarDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmConsultarDepartamentos.setText("Consultar");
        itmConsultarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultarDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmConsultarDepartamentos);

        itmAlterarDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarDepartamentos.setText("Alterar");
        itmAlterarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmAlterarDepartamentos);

        itmExcluirDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirDepartamentos.setText("Excluir");
        itmExcluirDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmExcluirDepartamentos);

        mnuRelatoriosDepartamentos.setText("Relatórios");

        itmRelatorioGeralDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatorioGeralDepartamentos.setText("Geral");
        itmRelatorioGeralDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatorioGeralDepartamentosActionPerformed(evt);
            }
        });
        mnuRelatoriosDepartamentos.add(itmRelatorioGeralDepartamentos);

        itmRelatorioPorCidadeDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatorioPorCidadeDepartamentos.setText("Por Cidade");
        mnuRelatoriosDepartamentos.add(itmRelatorioPorCidadeDepartamentos);

        mnuDepartamentos.add(mnuRelatoriosDepartamentos);
        mnuDepartamentos.add(jSeparator1);

        itmSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmSair.setText("Sair");
        mnuDepartamentos.add(itmSair);

        jMenuBar1.add(mnuDepartamentos);

        mnuFuncionarios.setText("Funcionários");

        itmCadastrarFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmCadastrarFuncionarios.setText("Cadastrar");
        itmCadastrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmCadastrarFuncionarios);

        itmAlterarFuncionarios.setText("Alterar");
        itmAlterarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmAlterarFuncionarios);

        itmConsultarFuncionarios.setText("Consultar");
        itmConsultarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmConsultarFuncionarios);

        itmExcluirFuncionarios.setText("Excluir");
        itmExcluirFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmExcluirFuncionarios);
        mnuFuncionarios.add(jSeparator3);

        itmRelatoriosFuncionario.setText("Relatorios");
        itmRelatoriosFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatoriosFuncionarioActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmRelatoriosFuncionario);

        jMenuBar1.add(mnuFuncionarios);

        mnuUsuarios.setText("Usuários");

        itmCadatrarUsuario.setText("Cadastrar");
        itmCadatrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadatrarUsuarioActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmCadatrarUsuario);

        itmAlterarUsuario.setText("Alterar");
        itmAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarUsuarioActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmAlterarUsuario);

        itmConsultarUsuario.setText("Consultar");
        itmConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultarUsuarioActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmConsultarUsuario);

        itmExcluirUsuario.setText("Excluir");
        itmExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirUsuarioActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmExcluirUsuario);
        mnuUsuarios.add(jSeparator2);

        itmRelatoriosUsuario.setText("Relatórios");
        itmRelatoriosUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatoriosUsuarioActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmRelatoriosUsuario);

        jMenuBar1.add(mnuUsuarios);

        mnuAjuda.setText("Ajuda");

        itmManualUsuarioAjuda.setText("Manual do Usuário");
        mnuAjuda.add(itmManualUsuarioAjuda);

        itmSobre.setText("Sobre");
        mnuAjuda.add(itmSobre);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(541, 327));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmCadastrarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarDepartamentosActionPerformed
        new ControleDepartamentos("cadastrar").setVisible(true);
    }//GEN-LAST:event_itmCadastrarDepartamentosActionPerformed

    private void itmCadatrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadatrarUsuarioActionPerformed
        new ControleUsuarios("cadastrar").setVisible(true);
    }//GEN-LAST:event_itmCadatrarUsuarioActionPerformed

    private void itmConsultarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultarDepartamentosActionPerformed
        new ControleDepartamentos("consultar").setVisible(true);
    }//GEN-LAST:event_itmConsultarDepartamentosActionPerformed

    private void itmExcluirDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirDepartamentosActionPerformed
        new ControleDepartamentos("excluir").setVisible(true);
    }//GEN-LAST:event_itmExcluirDepartamentosActionPerformed

    private void itmAlterarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarDepartamentosActionPerformed
        new ControleDepartamentos("alterar").setVisible(true);
    }//GEN-LAST:event_itmAlterarDepartamentosActionPerformed

    private void itmRelatorioGeralDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatorioGeralDepartamentosActionPerformed
       new RelatorioDepartamentos().setVisible(true);
    }//GEN-LAST:event_itmRelatorioGeralDepartamentosActionPerformed

    private void itmConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultarUsuarioActionPerformed
        new ControleUsuarios("consultar").setVisible(true);
    }//GEN-LAST:event_itmConsultarUsuarioActionPerformed

    private void itmAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarUsuarioActionPerformed
        new ControleUsuarios("alterar").setVisible(true);
    }//GEN-LAST:event_itmAlterarUsuarioActionPerformed

    private void itmExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirUsuarioActionPerformed
        new ControleUsuarios("excluir").setVisible(true);
    }//GEN-LAST:event_itmExcluirUsuarioActionPerformed

    private void itmRelatoriosUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatoriosUsuarioActionPerformed
        new RelatorioUsuario().setVisible(true);
    }//GEN-LAST:event_itmRelatoriosUsuarioActionPerformed

    private void itmRelatoriosFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatoriosFuncionarioActionPerformed
        new RelatorioFuncionarios().setVisible(true);
    }//GEN-LAST:event_itmRelatoriosFuncionarioActionPerformed

    private void itmAlterarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarFuncionariosActionPerformed
        new ControleFuncionario("alterar").setVisible(true);
    }//GEN-LAST:event_itmAlterarFuncionariosActionPerformed

    private void itmConsultarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultarFuncionariosActionPerformed
        new ControleFuncionario("consultar").setVisible(true);
    }//GEN-LAST:event_itmConsultarFuncionariosActionPerformed

    private void itmExcluirFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirFuncionariosActionPerformed
        new ControleFuncionario("excluir").setVisible(true);
    }//GEN-LAST:event_itmExcluirFuncionariosActionPerformed

    private void itmCadastrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarFuncionariosActionPerformed
        new ControleFuncionario("cadastrar").setVisible(true);
    }//GEN-LAST:event_itmCadastrarFuncionariosActionPerformed
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAlterarDepartamentos;
    private javax.swing.JMenuItem itmAlterarFuncionarios;
    private javax.swing.JMenuItem itmAlterarUsuario;
    private javax.swing.JMenuItem itmCadastrarDepartamentos;
    private javax.swing.JMenuItem itmCadastrarFuncionarios;
    private javax.swing.JMenuItem itmCadatrarUsuario;
    private javax.swing.JMenuItem itmConsultarDepartamentos;
    private javax.swing.JMenuItem itmConsultarFuncionarios;
    private javax.swing.JMenuItem itmConsultarUsuario;
    private javax.swing.JMenuItem itmExcluirDepartamentos;
    private javax.swing.JMenuItem itmExcluirFuncionarios;
    private javax.swing.JMenuItem itmExcluirUsuario;
    private javax.swing.JMenuItem itmManualUsuarioAjuda;
    private javax.swing.JMenuItem itmRelatorioGeralDepartamentos;
    private javax.swing.JMenuItem itmRelatorioPorCidadeDepartamentos;
    private javax.swing.JMenuItem itmRelatoriosFuncionario;
    private javax.swing.JMenuItem itmRelatoriosUsuario;
    private javax.swing.JMenuItem itmSair;
    private javax.swing.JMenuItem itmSobre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuDepartamentos;
    private javax.swing.JMenu mnuFuncionarios;
    private javax.swing.JMenu mnuRelatoriosDepartamentos;
    private javax.swing.JMenu mnuUsuarios;
    // End of variables declaration//GEN-END:variables
}
