package biblioteca;

import javax.swing.JOptionPane;
import javax.swing.JRootPane;

public class TelaCadastroCliente extends javax.swing.JFrame {


    public TelaCadastroCliente() {        
        initComponents();
    }
    
    Conexao C = new Conexao();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CpfCliTxt = new javax.swing.JTextField();
        TelefoneCliTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FinalizarButton = new javax.swing.JButton();
        CancelarButton = new javax.swing.JButton();
        NomeCliTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("CADASTRO DE CLIENTE");

        jLabel3.setText("Nome do Cliente");

        jLabel4.setText("Telefone do Cliente");

        FinalizarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar.png"))); // NOI18N
        FinalizarButton.setText("Cadastrar");
        FinalizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarButtonActionPerformed(evt);
            }
        });

        CancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("CPF do Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CpfCliTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeCliTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FinalizarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CancelarButton))
                            .addComponent(TelefoneCliTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NomeCliTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CpfCliTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TelefoneCliTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarButton)
                    .addComponent(FinalizarButton))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        NomeCliTxt.setText("");
        CpfCliTxt.setText("");
        TelefoneCliTxt.setText("");
        
        dispose();
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void FinalizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarButtonActionPerformed
        String nome, cpf, fone;
        
        nome = NomeCliTxt.getText();
        cpf = CpfCliTxt.getText();
        fone = TelefoneCliTxt.getText();
        
        try{
            if(nome.length() == 0 || cpf.length() == 0 || fone.length() == 0){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            }else
            if(validarCPF(cpf) == false){
                JOptionPane.showMessageDialog(null, "Insira um CPF válido (Somente números)");
            }else
            if(fone.length() < 10 || fone.length() > 11){
                JOptionPane.showMessageDialog(null, "Insira um telefone válido (Somente números)");
            }else
            if(C.insere_cliente(nome, cpf, fone) == true){
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                NomeCliTxt.setText("");
                CpfCliTxt.setText("");
                TelefoneCliTxt.setText("");
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Impossivel realizar o cadastro! Tente corrigir os campos.");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "É preciso corrigir os campos!");
        };
    }//GEN-LAST:event_FinalizarButtonActionPerformed

    public static boolean validarCPF(String cpf){
        if (cpf.length() == 11 ){
      
          int d1, d2; 
          int digito1, digito2, resto; 
          int digitoCPF; 
          String  nDigResult; 
          d1 = d2 = 0; 
          digito1 = digito2 = resto = 0; 
          for (int nCount = 1; nCount < cpf.length() -1; nCount++){ 
           
              digitoCPF = Integer.valueOf (cpf.substring(nCount -1, nCount)).intValue(); 
              
              d1 = d1 + ( 11 - nCount ) * digitoCPF; 
 
              d2 = d2 + ( 12 - nCount ) * digitoCPF; 
          } 

          resto = (d1 % 11); 
 
          if (resto < 2){
              digito1 = 0;
              
          }else{ 
              digito1 = 11 - resto; 
          d2 += 2 * digito1; 
 
          resto = (d2 % 11); 
          }
          
          if (resto < 2){ 
              digito2 = 0; 
          }else{
              digito2 = 11 - resto; 
          }
          String nDigVerific = cpf.substring (cpf.length()-2, cpf.length()); 
          
          nDigResult = String.valueOf(digito1) + String.valueOf(digito2); 
          
          return nDigVerific.equals(nDigResult);
          
        }
        return false;
    }
    
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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarButton;
    private javax.swing.JTextField CpfCliTxt;
    private javax.swing.JButton FinalizarButton;
    private javax.swing.JTextField NomeCliTxt;
    private javax.swing.JTextField TelefoneCliTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
