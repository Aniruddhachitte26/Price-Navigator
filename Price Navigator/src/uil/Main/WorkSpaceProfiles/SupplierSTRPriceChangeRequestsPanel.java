/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uil.Main.WorkSpaceProfiles;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.ProductManagement.PriceChangeRequest;
import model.ProductManagement.Product;
import model.Supplier.SupplierProfile;

/**
 *
 * @author divyansjemni
 */
public class SupplierSTRPriceChangeRequestsPanel extends javax.swing.JPanel {
    
    JPanel CardSequencePanel;
    SupplierProfile spp;
    Business business;
    /**
     * Creates new form SupplierSTRPriceChangeRequestsPanel
     */
    public SupplierSTRPriceChangeRequestsPanel(Business b,SupplierProfile sp, JPanel jp) {
        
        CardSequencePanel = jp;
        business = b;
        spp = sp;
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        strPriceRequestsTable = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Strategic Price Change Requests");

        strPriceRequestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Min Price", "Max Price", "Strategic Price", "Avg of 4 Fat contents", "Requested By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        strPriceRequestsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                strPriceRequestsTableMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                strPriceRequestsTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(strPriceRequestsTable);

        btnRefresh.setBackground(new java.awt.Color(0, 204, 255));
        btnRefresh.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("REFRESH DATA");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnApprove.setBackground(new java.awt.Color(0, 204, 255));
        btnApprove.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("APPROVE");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 204, 255));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(0, 204, 255));
        btnReject.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("REJECT");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(470, 470, 470)
                                .addComponent(btnRefresh)
                                .addGap(33, 33, 33)
                                .addComponent(btnApprove)
                                .addGap(18, 18, 18)
                                .addComponent(btnReject))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnRefresh)
                    .addComponent(btnReject))
                .addGap(41, 41, 41)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void strPriceRequestsTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strPriceRequestsTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_strPriceRequestsTableMouseEntered

    private void strPriceRequestsTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strPriceRequestsTableMousePressed

    }//GEN-LAST:event_strPriceRequestsTableMousePressed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        
     DefaultTableModel model = (DefaultTableModel) strPriceRequestsTable.getModel();
    
    // Clear the existing rows
    model.setRowCount(0);
    
    // Loop through all unapproved price change requests from the supplier
    for (PriceChangeRequest request : spp.getSupplier().getUnapprovedPriceChangeRequests()) {
        Object[] row = new Object[6];
        row[0] = request.getProductName(); // Assuming you have a getProductName method in PriceChangeRequest
        // Find the product to get its min and max price
        Product product = spp.getSupplier().getProductCatalog().findProductByName(request.getProductName());
        if(product != null){
            row[1] = product.getFloorPrice(); // Assuming getMinPrice method exists
            row[2] = product.getCeilingPrice(); // Assuming getMaxPrice method exists
        }
        row[3] = request.getNewTargetPrice(); // Assuming getNewTargetPrice method exists
        row[4] = ( product.getCholesterolPercentage() + product.getSodiumPercentage() + product.getSugarPercentage() + product.getTransfatPercentage() ) /4 ; // If you have an average of 4 fat contents, you can calculate and set here
        row[5] = request.getSalesPersonName(); 
        
        // Add the row to the model
        model.addRow(row);
    }
        

    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed

    int selectedRow = strPriceRequestsTable.getSelectedRow();
    if(selectedRow >= 0){
        String productName = (String) strPriceRequestsTable.getValueAt(selectedRow, 0);
        PriceChangeRequest requestToApprove = spp.getSupplier().findPriceChangeRequestByProductName(productName);
        if(requestToApprove != null){
            spp.getSupplier().approvePriceChangeRequest(requestToApprove);
            JOptionPane.showMessageDialog(null, "Price change request approved.", "Approval Successful", JOptionPane.INFORMATION_MESSAGE);
            btnRefreshActionPerformed(null); // Refresh the data in the table
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please select a request to approve.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
    int selectedRow = strPriceRequestsTable.getSelectedRow();
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(null, "Please select a request to reject.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Assuming the PriceChangeRequest object has a unique identifier such as an ID
    // Retrieve the product name and the salesperson name from the table to identify the request
    String productName = (String) strPriceRequestsTable.getValueAt(selectedRow, 0);
    String salesPersonName = (String) strPriceRequestsTable.getValueAt(selectedRow, 5);

    // Find the matching PriceChangeRequest from the supplier's list of price change requests
    PriceChangeRequest requestToReject = null;
    for (PriceChangeRequest request : spp.getSupplier().getPriceChangeRequests()) {
        if (request.getProductName().equals(productName) && request.getSalesPersonName().equals(salesPersonName) && !request.isIsApproved()) {
            requestToReject = request;
            break;
        }
    }

    if (requestToReject == null) {
        JOptionPane.showMessageDialog(null, "Request not found or already processed.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Remove the request from the list without updating the product's target price
    spp.getSupplier().getPriceChangeRequests().remove(requestToReject);

    // Update the table model to remove the rejected request
    ((DefaultTableModel) strPriceRequestsTable.getModel()).removeRow(selectedRow);

    JOptionPane.showMessageDialog(null, "Price change request rejected.", "Rejected", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable strPriceRequestsTable;
    // End of variables declaration//GEN-END:variables
}
