package biblioteca;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscaAcervo extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel(  
        new Object[] {"ID", "Título", "Código"},0){
            boolean[] canEdit = new boolean [] { false, false, false};    
            @Override  
            public boolean isCellEditable(int rowIndex, int columnIndex){  
                return canEdit [columnIndex];  
            }  
        };
    
    public BuscaAcervo() {
        initComponents();
        tabela.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeLivro = new javax.swing.JTextField();
        buscaNome = new javax.swing.JButton();
        buscaTudo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        cancelar = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        buscaCod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("CONSULTA AO ACERVO DE LIVROS");

        jLabel2.setText("Título/Código");

        buscaNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buscaNome.setText("Buscar p/ Titulo");
        buscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaNomeActionPerformed(evt);
            }
        });

        buscaTudo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buscaTudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/acervo2.png"))); // NOI18N
        buscaTudo.setText("Nosso Acervo");
        buscaTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaTudoActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Título", "Código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela);

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        atualizar.setText("Mais Informações");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        buscaCod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buscaCod.setText("Buscar p/ Código");
        buscaCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaCodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atualizar)
                .addGap(94, 94, 94)
                .addComponent(cancelar)
                .addGap(137, 137, 137))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeLivro)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buscaNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buscaCod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscaTudo)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buscaNome)
                        .addComponent(buscaTudo))
                    .addComponent(buscaCod))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(atualizar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void buscaLivro(String nome, int tipo){
        Conexao c = new Conexao();
        TelaCadastroLivro CadLivro = new TelaCadastroLivro();
        
        if(nome.length() > 0 ){
        
        try{
        ResultSet rs = c.BuscarLivro(nome, tipo);
        DefaultTableModel modelo = new DefaultTableModel(  
        new Object[] {"ID", "Título", "Código"},0){
            boolean[] canEdit = new boolean [] { false, false, false};    
            @Override  
            public boolean isCellEditable(int rowIndex, int columnIndex){  
                return canEdit [columnIndex];  
            }  
        };
        tabela.setModel(modelo);
        
        while(rs.next()){
            modelo.addRow(new String[]{rs.getString("id_livro"), rs.getString("titulo"), rs.getString("cod_livro")});
        }
            
        }catch(SQLException e){JOptionPane.showMessageDialog(rootPane, "Erro na busca");}
        
        }
        else{JOptionPane.showMessageDialog(null,"Insira um nome válido"); }
    }
    
    private void buscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaNomeActionPerformed
        buscaLivro(nomeLivro.getText(), 0);
    }//GEN-LAST:event_buscaNomeActionPerformed

    public void buscaTodosLivros(){
        buscaLivro(".", 1);
    }
    
    private void buscaTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaTudoActionPerformed
        buscaTodosLivros();
    }//GEN-LAST:event_buscaTudoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        nomeLivro.setText("");
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        try {
            TelaCadastroLivro CadLivro = new TelaCadastroLivro();
            CadLivro.showLivro(tabela.getValueAt(tabela.getSelectedRow(), 0)+"");
            CadLivro.show();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Impossivel buscar/atualizar os dados no momento!");
        }
        
    }//GEN-LAST:event_atualizarActionPerformed

    private void buscaCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaCodActionPerformed
        buscaLivro(nomeLivro.getText(), 2);
    }//GEN-LAST:event_buscaCodActionPerformed

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
            java.util.logging.Logger.getLogger(BuscaAcervo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaAcervo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaAcervo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaAcervo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaAcervo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizar;
    private javax.swing.JButton buscaCod;
    private javax.swing.JButton buscaNome;
    private javax.swing.JButton buscaTudo;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeLivro;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
