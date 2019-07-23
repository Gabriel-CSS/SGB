package biblioteca;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscarCliente extends javax.swing.JFrame {
    
    DefaultTableModel modelo = new DefaultTableModel(  
        new Object[] {"ID","Nome","CPF", "Fone"},0){
            boolean[] canEdit = new boolean [] { false, true, true, true};    
            @Override  
            public boolean isCellEditable(int rowIndex, int columnIndex){  
                return canEdit [columnIndex];  
            }  
        };
    
    public BuscarCliente() {
        initComponents();
        tabela.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoBusca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        buscarNome = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        buscaTudo = new javax.swing.JButton();
        buscaCPF = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Fone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabela);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("BUSCA DE CLIENTES");
        jLabel1.setToolTipText("");

        jLabel2.setText("Busca por Nome/CPF");

        campoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscaActionPerformed(evt);
            }
        });

        jLabel4.setText("Resultados da Busca:");

        buscarNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buscarNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/busca_cliente2.png"))); // NOI18N
        buscarNome.setText("Buscar Nome");
        buscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarNomeActionPerformed(evt);
            }
        });

        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        buscaTudo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buscaTudo.setText("Buscar Todos");
        buscaTudo.setToolTipText("");
        buscaTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaTudoActionPerformed(evt);
            }
        });

        buscaCPF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buscaCPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/busca_cliente2.png"))); // NOI18N
        buscaCPF.setText("Buscar CPF");
        buscaCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaCPFActionPerformed(evt);
            }
        });

        atualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        atualizar.setText("Atualizar Dados");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(Cancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(atualizar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(buscarNome)
                                    .addGap(18, 18, 18)
                                    .addComponent(buscaCPF)
                                    .addGap(33, 33, 33)
                                    .addComponent(buscaTudo))))
                        .addGap(89, 89, 89))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarNome)
                    .addComponent(buscaTudo)
                    .addComponent(buscaCPF))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(atualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarNomeActionPerformed
        buscaCliente(campoBusca.getText(), 0);
    }//GEN-LAST:event_buscarNomeActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        campoBusca.setText("");
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

        
    public void buscaCliente(String busca, int tipo){
        Conexao c = new Conexao();
        if(busca.length() > 0 ){
        try{
        ResultSet rs = c.BuscarCliente(busca, tipo);
        
        DefaultTableModel modelo = new DefaultTableModel(  
        new Object[] {"ID","Nome","CPF", "Fone"},0){
            boolean[] canEdit = new boolean [] { false, true, true, true};    
            @Override  
            public boolean isCellEditable(int rowIndex, int columnIndex){  
                return canEdit [columnIndex];  
            }  
        };
        tabela.setModel(modelo);
        
        while(rs.next()){
        modelo.addRow(new String[]{rs.getString("id_cliente"),rs.getString("nome_cliente"),
                rs.getString("cpf_cliente"), rs.getString("fone_cliente") } );
        }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Erro na busca");
        }
        
        }else{
            JOptionPane.showMessageDialog(null,"Insira um nome/CPF válido");
        }
    }

    
    private void buscaTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaTudoActionPerformed
        buscaCliente(".", 2);
        campoBusca.setText("");
    }//GEN-LAST:event_buscaTudoActionPerformed

    private void buscaCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaCPFActionPerformed
        buscaCliente(campoBusca.getText(), 1);
    }//GEN-LAST:event_buscaCPFActionPerformed

    private void campoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscaActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        Conexao C = new Conexao();
        TelaCadastroCliente CadCli = new TelaCadastroCliente();
        String nome, cpf, fone;
        int id;
        try {
            if(tabela.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(null, "Você deve selecionar o cliente!");
            }else{
                id = Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0) + "");
                nome = tabela.getValueAt(tabela.getSelectedRow(),1) + "";
                cpf = tabela.getValueAt(tabela.getSelectedRow(),2) + "";
                fone = tabela.getValueAt(tabela.getSelectedRow(),3) + "";
            
            if(nome.length() == 0 || cpf.length() == 0 || fone.length() == 0){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            }else
            if(CadCli.validarCPF(cpf) == false){
                JOptionPane.showMessageDialog(null, "Insira um CPF válido (Somente números)");
            }else
            if(fone.length() < 10 || fone.length() > 11){
                JOptionPane.showMessageDialog(null, "Insira um telefone válido (Somente números)");
            }else
                if(C.atualiza_cliente(id, nome, cpf, fone) == true){
                    JOptionPane.showMessageDialog(null,"Dados do cliente atualizados!");
                }else{
                    JOptionPane.showMessageDialog(null,"Não foi possível atualizar os dados do cliente!");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Não foi possível atualizar os dados do cliente!");
        }
    }//GEN-LAST:event_atualizarActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton buscaCPF;
    private javax.swing.JButton buscaTudo;
    private javax.swing.JButton buscarNome;
    private javax.swing.JTextField campoBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
