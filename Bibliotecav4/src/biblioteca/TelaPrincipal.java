package biblioteca;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }
   TelaCadastroLivro TelaCadL = new TelaCadastroLivro();
   TelaCadastroCliente TelaCadC = new TelaCadastroCliente();
   BuscarCliente BuscaCli = new BuscarCliente();
   BuscaAcervo BuscaAcer = new BuscaAcervo();
   TelaEmprestimo TelaEmpr = new TelaEmprestimo();
   BaixaEmprestimo BaixaEmp = new BaixaEmprestimo();
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        cadastroLivroButton = new javax.swing.JButton();
        acervoButton = new javax.swing.JButton();
        adicionarClienteButton = new javax.swing.JButton();
        buscarClienteButton = new javax.swing.JButton();
        baixaButton = new javax.swing.JButton();
        emprestimoButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        cadastroLivroButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cadastrar_livro.png"))); // NOI18N
        cadastroLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroLivroButtonActionPerformed(evt);
            }
        });

        acervoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/acervo.png"))); // NOI18N
        acervoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acervoButtonActionPerformed(evt);
            }
        });

        adicionarClienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cadastrar_cliente.png"))); // NOI18N
        adicionarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarClienteButtonActionPerformed(evt);
            }
        });

        buscarClienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/buscar_cliente.png"))); // NOI18N
        buscarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteButtonActionPerformed(evt);
            }
        });

        baixaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/baixa.png"))); // NOI18N
        baixaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baixaButtonActionPerformed(evt);
            }
        });

        emprestimoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/empréstimo.png"))); // NOI18N
        emprestimoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprestimoButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Cadastrar Livro");

        jLabel3.setText("Nosso Acervo");

        jLabel4.setText("Cadastrar Cliente");

        jLabel5.setText("Buscar Cliente");

        jLabel6.setText("Realizar Empréstimo");

        jLabel7.setText("Baixa no Empréstimo");

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel1.setText("SISTEMA GERENCIADOR DE BIBLIOTECAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(cadastroLivroButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(acervoButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel3)))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adicionarClienteButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel4)))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarClienteButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel5)))))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(emprestimoButton)
                .addGap(92, 92, 92)
                .addComponent(baixaButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acervoButton)
                    .addComponent(adicionarClienteButton)
                    .addComponent(cadastroLivroButton)
                    .addComponent(buscarClienteButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(baixaButton)
                    .addComponent(emprestimoButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroLivroButtonActionPerformed
        TelaCadL.show();
    }//GEN-LAST:event_cadastroLivroButtonActionPerformed

    private void acervoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acervoButtonActionPerformed
        BuscaAcer.show();
        BuscaAcer.buscaLivro(".", 1);
    }//GEN-LAST:event_acervoButtonActionPerformed

    private void adicionarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarClienteButtonActionPerformed
        TelaCadC.show();
    }//GEN-LAST:event_adicionarClienteButtonActionPerformed

    private void buscarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteButtonActionPerformed
        BuscaCli.show();
        BuscaCli.buscaCliente(".", 2);
    }//GEN-LAST:event_buscarClienteButtonActionPerformed

    private void emprestimoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestimoButtonActionPerformed
        TelaEmpr.show();
    }//GEN-LAST:event_emprestimoButtonActionPerformed

    private void baixaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baixaButtonActionPerformed
        BaixaEmp.show();
        BaixaEmp.buscaLocaNome(1, 1);
    }//GEN-LAST:event_baixaButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acervoButton;
    private javax.swing.JButton adicionarClienteButton;
    private javax.swing.JButton baixaButton;
    private javax.swing.JButton buscarClienteButton;
    private javax.swing.JButton cadastroLivroButton;
    private javax.swing.JButton emprestimoButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

}
