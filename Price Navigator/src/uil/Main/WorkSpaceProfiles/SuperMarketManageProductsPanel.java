/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uil.Main.WorkSpaceProfiles;


import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.SuperMarketManagement.SuperMarketProfile;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;


/**
 *
 * @author divyansjemni
 */
public class SuperMarketManageProductsPanel extends javax.swing.JPanel {
    
     JPanel CardSequencePanel;
     Business business;
     SuperMarketProfile cpl;

    /**
     * Creates new form SuperMarketManageProductsPanel
     */
    public SuperMarketManageProductsPanel(Business b,SuperMarketProfile cp, JPanel jp) {
         
        this.CardSequencePanel = jp;
         business = b;
         cpl = cp;     
        initComponents();
        populateCustomerOrders(cpl);
    }

    private void populateCustomerOrders(SuperMarketProfile customerProfile) {
    DefaultTableModel model = (DefaultTableModel) ProductsTable.getModel();
    model.setRowCount(0); // Clear existing rows
    
    // Iterate through the orders of the specific customer
    for (Order order : customerProfile.getOrders()) {
        for (OrderItem orderItem : order.getOrderItems()) {
            // Add row to table
            Object[] row = new Object[3];
            row[0] = orderItem.getSelectedProduct().getName();
            row[1] = (int) Math.ceil(orderItem.getActualPrice() * 1.10);
            row[2] = orderItem.getQuantity();
            
            model.addRow(row);
        }
    }}
    
    private void populateCustomerOrders1(SuperMarketProfile customerProfile, String searchKeyword) {
    DefaultTableModel model = (DefaultTableModel) ProductsTable.getModel();
    model.setRowCount(0); // Clear existing rows

    // Iterate through the orders of the specific customer
    for (Order order : customerProfile.getOrders()) {
        for (OrderItem orderItem : order.getOrderItems()) {
            String productName = orderItem.getSelectedProduct().getName();

            // Add rows to the table only if the product name contains the search keyword
            if (productName.toLowerCase().contains(searchKeyword.toLowerCase())) {
                Object[] row = new Object[3];
                row[0] = productName;
                row[1] = (int) Math.ceil(orderItem.getActualPrice() * 1.10);
                row[2] = orderItem.getQuantity();
                
                model.addRow(row);
            }
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
        ProductsTable = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        ProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Price", "Available Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProductsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProductsTableMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ProductsTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(ProductsTable);

        btnDelete.setBackground(new java.awt.Color(0, 204, 255));
        btnDelete.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("Product Catalog");

        btnUpdate.setBackground(new java.awt.Color(0, 204, 255));
        btnUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
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

        btnRefresh.setBackground(new java.awt.Color(0, 204, 255));
        btnRefresh.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("REFRESH DATA");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnsearch.setBackground(new java.awt.Color(0, 204, 255));
        btnsearch.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("SEARCH PRODCT");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefresh)
                .addGap(32, 32, 32)
                .addComponent(btnUpdate)
                .addGap(43, 43, 43)
                .addComponent(btnDelete)
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnsearch))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsearch))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnRefresh))
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ProductsTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductsTableMouseEntered

    private void ProductsTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsTableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductsTableMousePressed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
            // Get the selected row index
            
     DefaultTableModel model = (DefaultTableModel) ProductsTable.getModel();
    int selectedRow = ProductsTable.getSelectedRow();

    // Check if a row is actually selected
    if (selectedRow >= 0) {
        // Optional: Confirm with the user if they want to delete the row
        int response = JOptionPane.showConfirmDialog(null, "Do you want to delete the selected product?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (response == JOptionPane.YES_OPTION) {
            // Remove the order item from the customer profile's orders
            OrderItem itemToRemove = findOrderItemByProductName((String) model.getValueAt(selectedRow, 0));
            if (itemToRemove != null) {
                removeOrderItemFromCustomerOrders(itemToRemove);
            }

            // Remove the row from the table model
            model.removeRow(selectedRow);

            // Update the backend if necessary
            // e.g., save the changes to a database or a file
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please select a product to delete.");
    }
    
    }//GEN-LAST:event_btnDeleteActionPerformed
// Helper method to find an OrderItem by product name
private OrderItem findOrderItemByProductName(String productName) {
    for (Order order : cpl.getOrders()) {
        for (OrderItem orderItem : order.getOrderItems()) {
            if (orderItem.getSelectedProduct().getName().equals(productName)) {
                return orderItem;
            }
        }
    }
    return null;
}

// Helper method to remove an OrderItem from SuperMarketProfile's orders
private void removeOrderItemFromCustomerOrders(OrderItem itemToRemove) {
    for (Order order : cpl.getOrders()) {
        order.getOrderItems().remove(itemToRemove);
    }
}

public OrderItem getSelectedOrderItem() {
    int selectedRow = ProductsTable.getSelectedRow();
    if (selectedRow >= 0) {
        String productName = (String) ProductsTable.getValueAt(selectedRow, 0);
        return findOrderItemByProductName(productName);
    } else {
        JOptionPane.showMessageDialog(null, "Please select a product to update.");
        return null;
    }
}


        
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    OrderItem selectedOrderItem = getSelectedOrderItem();
    if (selectedOrderItem != null) {
        SupermarketProductUpdatePanel updatePanel = new SupermarketProductUpdatePanel(business, selectedOrderItem, CardSequencePanel);
        CardSequencePanel.add("SupermarketProductUpdatePanel", updatePanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
      populateCustomerOrders(cpl);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
          String searchKeyword = txtsearch.getText().trim();

    // Check if the search keyword is not empty
    if (!searchKeyword.isEmpty()) {
        // Call populateCustomerOrders with the current customer profile and the search keyword
        populateCustomerOrders1(cpl, searchKeyword);
    } else {
        // If search keyword is empty, you might want to refresh the table to show all records
        populateCustomerOrders1(cpl, "");
    }  
        
        
    }//GEN-LAST:event_btnsearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProductsTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
