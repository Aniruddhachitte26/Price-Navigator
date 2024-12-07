/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uil.Main.WorkSpaceProfiles;

import javax.swing.JPanel;
import model.Business.Business;
import model.Supplier.SupplierProfile;

/**
 *
 * @author divyansjemni
 */
public class SupplierPersonWorkAreaJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;
    SupplierProfile sp;
   
    public SupplierPersonWorkAreaJPanel(Business b, SupplierProfile spp, JPanel clp) {
        
        business = b;
        this.CardSequencePanel = clp;
        sp =spp;
        initComponents();
           txtname.setText(sp.getPerson().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAddProducts = new javax.swing.JButton();
        btnViewProducts = new javax.swing.JButton();
        btnViewProducts1 = new javax.swing.JButton();
        btnViewProducts2 = new javax.swing.JButton();
        btnViewProducts3 = new javax.swing.JButton();
        btnChangeRequest = new javax.swing.JButton();
        btnOrderHistory = new javax.swing.JButton();
        lblsupermarket = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Supplier Work Area");

        btnAddProducts.setBackground(new java.awt.Color(0, 204, 255));
        btnAddProducts.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnAddProducts.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProducts.setText("ADD PRODUCTS");
        btnAddProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductsActionPerformed(evt);
            }
        });

        btnViewProducts.setBackground(new java.awt.Color(0, 204, 255));
        btnViewProducts.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnViewProducts.setForeground(new java.awt.Color(255, 255, 255));
        btnViewProducts.setText("Manage Products");
        btnViewProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProductsActionPerformed(evt);
            }
        });

        btnViewProducts1.setBackground(new java.awt.Color(0, 204, 255));
        btnViewProducts1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnViewProducts1.setForeground(new java.awt.Color(255, 255, 255));
        btnViewProducts1.setText("TOP 3 SELLERS");
        btnViewProducts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProducts1ActionPerformed(evt);
            }
        });

        btnViewProducts2.setBackground(new java.awt.Color(0, 204, 255));
        btnViewProducts2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnViewProducts2.setForeground(new java.awt.Color(255, 255, 255));
        btnViewProducts2.setText("LEAST 3 SELLERS");
        btnViewProducts2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProducts2ActionPerformed(evt);
            }
        });

        btnViewProducts3.setBackground(new java.awt.Color(0, 204, 255));
        btnViewProducts3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnViewProducts3.setForeground(new java.awt.Color(255, 255, 255));
        btnViewProducts3.setText("VIEW PROFILE");
        btnViewProducts3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProducts3ActionPerformed(evt);
            }
        });

        btnChangeRequest.setBackground(new java.awt.Color(0, 204, 255));
        btnChangeRequest.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnChangeRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnChangeRequest.setText("STR PRICE CHANGE REQUESTS");
        btnChangeRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeRequestActionPerformed(evt);
            }
        });

        btnOrderHistory.setBackground(new java.awt.Color(0, 204, 255));
        btnOrderHistory.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnOrderHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderHistory.setText("ORDER HISTORY");
        btnOrderHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderHistoryActionPerformed(evt);
            }
        });

        lblsupermarket.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblsupermarket.setForeground(new java.awt.Color(0, 204, 255));
        lblsupermarket.setText("SUPPLIER NAME:");

        txtname.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(lblsupermarket)
                        .addGap(70, 70, 70)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOrderHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewProducts1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewProducts3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnViewProducts2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewProducts, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChangeRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsupermarket)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewProducts1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewProducts2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewProducts3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangeRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnOrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductsActionPerformed
        // TODO add your handling code here:
        
        SupplierAddProductPanel sapj = new SupplierAddProductPanel(business, sp, CardSequencePanel);
        CardSequencePanel.add(sapj);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnAddProductsActionPerformed

    private void btnViewProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProductsActionPerformed
        // TODO add your handling code here:
        
        ManageProductsJPanel mpjp = new ManageProductsJPanel(business, sp, CardSequencePanel);
        CardSequencePanel.add(mpjp);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnViewProductsActionPerformed

    private void btnViewProducts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProducts1ActionPerformed
        // TODO add your handling code here:
        
        SupplierTop3ProductsPanel stp = new SupplierTop3ProductsPanel(business,sp, CardSequencePanel);
        CardSequencePanel.add("Top3Panel", stp);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        
    }//GEN-LAST:event_btnViewProducts1ActionPerformed

    private void btnViewProducts2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProducts2ActionPerformed
        // TODO add your handling code here:
        
        SupplierLeast3ProductsPanel slp = new SupplierLeast3ProductsPanel(business,sp, CardSequencePanel);
        CardSequencePanel.add("Least3Panel", slp);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnViewProducts2ActionPerformed

    private void btnViewProducts3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProducts3ActionPerformed
        // TODO add your handling code here:
        
         UpdateSupplierProfileJPanel msap = new UpdateSupplierProfileJPanel(business,sp, CardSequencePanel);
        CardSequencePanel.add("ManageVulns", msap);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnViewProducts3ActionPerformed

    private void btnChangeRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeRequestActionPerformed
        // TODO add your handling code here:
        
        SupplierSTRPriceChangeRequestsPanel strp = new SupplierSTRPriceChangeRequestsPanel(business,sp, CardSequencePanel);
        CardSequencePanel.add("STRPanel", strp);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnChangeRequestActionPerformed

    private void btnOrderHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderHistoryActionPerformed
        // TODO add your handling code here:
        
        SupplierOrderHistoryPanel sohp = new SupplierOrderHistoryPanel(business,sp, CardSequencePanel);
        CardSequencePanel.add("SOHP", sohp);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnOrderHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProducts;
    private javax.swing.JButton btnChangeRequest;
    private javax.swing.JButton btnOrderHistory;
    private javax.swing.JButton btnViewProducts;
    private javax.swing.JButton btnViewProducts1;
    private javax.swing.JButton btnViewProducts2;
    private javax.swing.JButton btnViewProducts3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblsupermarket;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}