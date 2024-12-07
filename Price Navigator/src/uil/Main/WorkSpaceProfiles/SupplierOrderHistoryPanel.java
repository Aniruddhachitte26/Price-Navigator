/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uil.Main.WorkSpaceProfiles;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.Supplier.Supplier;
import model.Supplier.SupplierProfile;

/**
 *
 * @author divyansjemni
 */
public class SupplierOrderHistoryPanel extends javax.swing.JPanel {
    
    JPanel CardSequencePanel;
    Business business;
    SupplierProfile sup;

    /**
     * Creates new form SupplierOrderHistoryPanel
     */
    public SupplierOrderHistoryPanel(Business b,SupplierProfile sp, JPanel jp) {
        
        business = b;
        CardSequencePanel = jp;
        sup = sp;
        initComponents();
        
        populateSupplierOrderHistory(sup.getSupplier());
    }
    
    private void populateSupplierOrderHistory(Supplier supplier) {
        
        DefaultTableModel model = (DefaultTableModel) supplierOrderHistory.getModel();
        model.setRowCount(0); // Clear existing data
        
 MasterOrderList masterOrderList = business.getMasterOrderList();
 // A set to track which orders have already been added
    Set<Integer> addedOrderIds = new HashSet<>();

    // Iterate through all orders
    for (Order order : masterOrderList.getOrders()) {
        boolean hasItemsFromSupplier = order.getOrderItems().stream()
            .anyMatch(orderItem -> {
                Optional<Supplier> orderItemSupplier = business.getSupplierDirectory().findSupplierByProduct(orderItem.getSelectedProduct());
                return orderItemSupplier.isPresent() && orderItemSupplier.get().equals(supplier);
            });

        // Check if we have already added this order or if it has items from the supplier
        if (hasItemsFromSupplier && !addedOrderIds.contains(order.getOrderId())) {
            Object[] row = new Object[5];
            row[0] = order.getOrderId();
            row[1] = order.getCustomer() != null ? order.getCustomer().getPerson().getName() : "N/A"; // Or however you get the buyer's name
            row[2] = order.getSalesperson() != null ? order.getSalesperson().getPerson().getName() : "N/A"; // Or however you get the operator's name
            row[3] = order.getOrderTotal();
            row[4] = order.getStatus();

            model.addRow(row);
            // Mark this order ID as added to prevent duplication
            addedOrderIds.add(order.getOrderId());
        }
    }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        supplierOrderHistory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnViewOrderDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        supplierOrderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Bought By", "Operated By", "Total Value", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierOrderHistory);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order History");

        btnBack.setBackground(new java.awt.Color(0, 204, 255));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewOrderDetails.setBackground(new java.awt.Color(0, 204, 255));
        btnViewOrderDetails.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnViewOrderDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnViewOrderDetails.setText("VIEW ORDER DETAILS");
        btnViewOrderDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnViewOrderDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(128, 128, 128))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnViewOrderDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewOrderDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderDetailsActionPerformed
        // TODO add your handling code here:
// Get the selected row index from the table that lists the orders
    int selectedRowIndex = supplierOrderHistory.getSelectedRow();

    if (selectedRowIndex < 0) {
        // No selection made, show error message or do nothing
        JOptionPane.showMessageDialog(null, "Please select an order to view details.");
        return;
    }

    // Assuming the order ID is in the first column of your table
    int orderId = Integer.parseInt(supplierOrderHistory.getValueAt(selectedRowIndex, 0).toString());

    // Find the selected order from the master order list using the order ID
    Order selectedOrder = business.getMasterOrderList().findOrderById(orderId);

    if (selectedOrder == null) {
        // Order not found, show error message
        JOptionPane.showMessageDialog(null, "Selected order not found in the master order list.");
        return;
    }

        
     SupplierOrderDetailsPanel sodp = new SupplierOrderDetailsPanel(business,selectedOrder, CardSequencePanel);
     CardSequencePanel.add("SupplierOrderDetailsPanel", sodp);
     ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        
        
    }//GEN-LAST:event_btnViewOrderDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewOrderDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable supplierOrderHistory;
    // End of variables declaration//GEN-END:variables
}
