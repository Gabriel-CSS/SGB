package biblioteca;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class TelaCadastroLivro extends javax.swing.JFrame {

    public TelaCadastroLivro() {
        initComponents();
        atualizarButton.setVisible(false);
    }
    
    Conexao C = new Conexao();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AnoLivroTxt = new javax.swing.JTextField();
        CodLivroTxt = new javax.swing.JTextField();
        TituloLivroTxt = new javax.swing.JTextField();
        IsbnLivroTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        NomeCatTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        NomeAutorTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        NomeEdiTxt = new javax.swing.JTextField();
        CancelarButton = new javax.swing.JButton();
        FinalizarButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        copiasTxt = new javax.swing.JTextField();
        atualizarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("LIVRO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Código do Livro");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Título do Livro");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("ISBN");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Ano de Publicação");

        AnoLivroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnoLivroTxtActionPerformed(evt);
            }
        });

        CodLivroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodLivroTxtActionPerformed(evt);
            }
        });

        TituloLivroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloLivroTxtActionPerformed(evt);
            }
        });

        IsbnLivroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsbnLivroTxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("CATEGORIA");

        NomeCatTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeCatTxtActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("AUTOR");

        NomeAutorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeAutorTxtActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("EDITORA");

        NomeEdiTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeEdiTxtActionPerformed(evt);
            }
        });

        CancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        CancelarButton.setText("Fechar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });

        FinalizarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar.png"))); // NOI18N
        FinalizarButton.setText("Cadastrar");
        FinalizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Cópias");

        copiasTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiasTxtActionPerformed(evt);
            }
        });

        atualizarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar.png"))); // NOI18N
        atualizarButton.setText("Atualizar");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeCatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnoLivroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TituloLivroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodLivroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IsbnLivroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(copiasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeEdiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeAutorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FinalizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(atualizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CancelarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel1)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CodLivroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TituloLivroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnoLivroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IsbnLivroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copiasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeCatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(FinalizarButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeEdiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(atualizarButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeAutorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(CancelarButton))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnoLivroTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnoLivroTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnoLivroTxtActionPerformed

    private void CodLivroTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodLivroTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodLivroTxtActionPerformed

    private void TituloLivroTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloLivroTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TituloLivroTxtActionPerformed

    private void IsbnLivroTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsbnLivroTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IsbnLivroTxtActionPerformed

    private void NomeCatTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeCatTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeCatTxtActionPerformed

    private void NomeAutorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeAutorTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeAutorTxtActionPerformed

    private void NomeEdiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeEdiTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeEdiTxtActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        CodLivroTxt.setText("");
        TituloLivroTxt.setText("");
        AnoLivroTxt.setText("");
        IsbnLivroTxt.setText("");
        copiasTxt.setText("");
        NomeCatTxt.setText("");
        NomeAutorTxt.setText("");
        NomeEdiTxt.setText("");
        
        dispose();
    }//GEN-LAST:event_CancelarButtonActionPerformed
    
    private void FinalizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarButtonActionPerformed
        int ano, copias;
        String codLivro, titulo, isbn, categoria, autor, editora;
        
        try{
            codLivro = CodLivroTxt.getText();
            titulo = TituloLivroTxt.getText();
            ano = Integer.parseInt(AnoLivroTxt.getText());
            isbn = IsbnLivroTxt.getText();
            copias = Integer.parseInt(copiasTxt.getText());
            categoria = NomeCatTxt.getText();
            autor = NomeAutorTxt.getText();
            editora = NomeEdiTxt.getText();
        
                if(C.insere_livro(codLivro, titulo, ano, isbn, copias, editora, categoria, autor) == true){
                    JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");

                    CodLivroTxt.setText("");
                    TituloLivroTxt.setText("");
                    AnoLivroTxt.setText("");
                    IsbnLivroTxt.setText("");
                    copiasTxt.setText("");
                    NomeCatTxt.setText("");
                    NomeAutorTxt.setText("");
                    NomeEdiTxt.setText("");

                    dispose();

                }else{
                    JOptionPane.showMessageDialog(null, "Impossível cadastrar o livro! Corrija os campos.");

                }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "É preciso corrigir os campos!");
        }
    }//GEN-LAST:event_FinalizarButtonActionPerformed

    private void copiasTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiasTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copiasTxtActionPerformed

    
    public void showLivro(String id){
        Conexao c = new Conexao();
        String codLivro, titulo, isbn, categoria, autor, editora, ano, copias;
        
        try {
            ResultSet rs = c.BuscarLivro(id, 3);
            FinalizarButton.setVisible(false);
            atualizarButton.setVisible(true);
            CodLivroTxt.setEditable(false);
            while(rs.next()){
                codLivro = rs.getString("cod_livro"); titulo = rs.getString("titulo"); ano = rs.getString("ano_publicacao"); isbn = rs.getString("isbn");
                copias = rs.getString("copias"); categoria = rs.getString("categoria"); editora = rs.getString("editora"); autor = rs.getString("autor");
                CodLivroTxt.setText(codLivro);
                TituloLivroTxt.setText(titulo);
                AnoLivroTxt.setText(ano);
                IsbnLivroTxt.setText(isbn);
                copiasTxt.setText(copias);
                NomeCatTxt.setText(categoria);
                NomeAutorTxt.setText(autor);
                NomeEdiTxt.setText(editora);
            }
            
        }catch (Exception e) {
            
        }
        
    }
    
    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        int ano=0, copias=0;
        String codLivro, titulo, isbn, categoria, autor, editora;
        
        codLivro = CodLivroTxt.getText();
        titulo = TituloLivroTxt.getText();
        isbn = IsbnLivroTxt.getText();
        categoria = NomeCatTxt.getText();
        autor = NomeAutorTxt.getText();
        editora = NomeEdiTxt.getText();
        
        if(codLivro.length() != 0){
            
                try{
                    ano = Integer.parseInt(AnoLivroTxt.getText());
                    copias = Integer.parseInt(copiasTxt.getText());
                    if(titulo.length() != 0 && isbn.length() != 0 && categoria.length() != 0 && autor.length() != 0 && editora.length() != 0 && ano != 0 && copias != 0){
                        if(C.atualiza_livro(codLivro, titulo, ano, isbn, copias, editora, categoria, autor) == true){
                            JOptionPane.showMessageDialog(null, "Livro atualizado com sucesso!");

                            CodLivroTxt.setText("");
                            TituloLivroTxt.setText("");
                            AnoLivroTxt.setText("");
                            IsbnLivroTxt.setText("");
                            copiasTxt.setText("");
                            NomeCatTxt.setText("");
                            NomeAutorTxt.setText("");
                            NomeEdiTxt.setText("");

                            dispose();

                        }else{
                            JOptionPane.showMessageDialog(null, "Impossível atualizar o cadastro do livro! Corrija os campos!");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "É preciso corrigir os campos!2");
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "É preciso corrigir os campos!");
                }
          
        }else {
            JOptionPane.showMessageDialog(null, "Informe o código do livro corretamente!");
        }
    }//GEN-LAST:event_atualizarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnoLivroTxt;
    private javax.swing.JButton CancelarButton;
    private javax.swing.JTextField CodLivroTxt;
    private javax.swing.JButton FinalizarButton;
    private javax.swing.JTextField IsbnLivroTxt;
    private javax.swing.JTextField NomeAutorTxt;
    private javax.swing.JTextField NomeCatTxt;
    private javax.swing.JTextField NomeEdiTxt;
    private javax.swing.JTextField TituloLivroTxt;
    private javax.swing.JButton atualizarButton;
    private javax.swing.JTextField copiasTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}
