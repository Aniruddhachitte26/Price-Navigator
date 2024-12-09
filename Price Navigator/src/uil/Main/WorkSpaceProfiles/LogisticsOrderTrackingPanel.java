/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uil.Main.WorkSpaceProfiles;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.SuperMarketManagement.SuperMarketProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.Person;
import model.ProductManagement.Product;
import model.RegularUser.RegularUserDirectory;
import model.RegularUser.RegularUserProfile;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.Supplier.SupplierProfile;

/**
 *
 * @author divyansjemni
 */
public class LogisticsOrderTrackingPanel extends javax.swing.JPanel {
    
   
    private JButton updateStatusButton;
    private List<Order> orders; // Orders to be displayed
    private Business business;
    private JPanel CardSequencePanel;
    private SuperMarketProfile cpl;
    private RegularUserProfile ru;
    
    
    

    /**
     * Creates new form LogisticsOrderTrackingPanel
     */
    public LogisticsOrderTrackingPanel(Business b, JPanel jp) {
        
        this.CardSequencePanel = jp;
        this.business = b;  
        initComponents();   
        populateOrdersTable();
        
    }
    
    
  /* private void populateOrdersTable() {
    DefaultTableModel model = (DefaultTableModel) logisticOrders.getModel();
    model.setRowCount(0);
    
    MasterOrderList masterOrderList = business.getMasterOrderList();
    SupplierDirectory supplierDirectory = business.getSupplierDirectory();
    
    for (Order order : masterOrderList.getOrders()) {
        Object[] row = new Object[5];  // Columns: Order ID, Name, Address, Supermarket Name/Supplier Name, Order Status
        row[0] = order.getOrderId();   // Order ID

        if (order.getRegularUser() != null) {
            // If the order is associated with a regular user
            RegularUserProfile regularUser = order.getRegularUser();
            row[1] = regularUser.getPerson().getName();      // Regular User Name
            row[2] = regularUser.getPerson().getAddress();   // Regular User Address
            row[3] = order.getSupermarketName();             // Supermarket Name
        } else {
            // If the order items are not empty, it means the order has products
            // and therefore can be associated with a supplier
            if (!order.getOrderItems().isEmpty()) {
                OrderItem firstOrderItem = order.getOrderItems().get(0);
                Product product = firstOrderItem.getSelectedProduct();
                Optional<Supplier> optionalSupplier = supplierDirectory.findSupplierByProduct(product);

                if (optionalSupplier.isPresent()) {
                    Supplier supplier = optionalSupplier.get();
                    row[1] = "Supplier Order"; // Indicate that this is a supplier order
                    row[2] = "N/A"; // Address not applicable or unknown for supplier order
                    row[3] = supplier.getName(); // Supplier Name
                } else {
                    row[1] = "Unknown Supplier"; // Default text if supplier not found
                    row[2] = "Unknown Address";  // Default text if supplier not found
                    row[3] = "Unknown Source";   // Default text if order source not determined
                }
            } else {
                row[1] = "No Name Available";   // Default text if no name available
                row[2] = "No Address Available"; // Default text if no address available
                row[3] = "Unknown Source";       // Default text if source not determined
            }
        }
        
        row[4] = order.getStatus(); // Order Status

        model.addRow(row);
    }
} 
    
    */
    
    
   private void populateOrdersTable() {
    DefaultTableModel model = (DefaultTableModel) logisticOrders.getModel();
    model.setRowCount(0);
    
    MasterOrderList masterOrderList = business.getMasterOrderList();
    SupplierDirectory supplierDirectory = business.getSupplierDirectory();
    
    for (Order order : masterOrderList.getOrders()) {
        Object[] row = new Object[8];  // Columns: Order ID, Name, Address, Supermarket Name/Supplier Name, Order Status
        row[0] = order.getOrderId();   // Order ID

        if (order.getRegularUser() != null) {
            // If the order is associated with a regular user
            RegularUserProfile regularUser = order.getRegularUser();
            row[1] = regularUser.getPerson().getName();      // Regular User Name
            row[2] = regularUser.getPerson().getAddress();   // Regular User Address
            row[3] = order.getSupermarketName();             // Supermarket Name
        } else {
            // Check if the order is associated with a customer and not a regular user
            if (order.getCustomer() != null && order.getCustomer().getPerson() != null) {
                row[1] = order.getCustomer().getPerson().getName();  // Customer Name
                row[2] = "Vermont"; // Customer Address
            } else {
                row[1] = "No Name Available";   // Default text if no name available
                row[2] = "No Address Available"; // Default text if no address available
            }

            // If the order items are not empty, it means the order has products
            // and therefore can be associated with a supplier
            if (!order.getOrderItems().isEmpty()) {
                OrderItem firstOrderItem = order.getOrderItems().get(0);
                Product product = firstOrderItem.getSelectedProduct();
                Optional<Supplier> optionalSupplier = supplierDirectory.findSupplierByProduct(product);

                if (optionalSupplier.isPresent()) {
                    Supplier supplier = optionalSupplier.get();
                    row[3] = supplier.getName(); // Supplier Name
                } else {
                    row[3] = "Unknown Source";   // Default text if order source not determined
                }
            } else {
                row[3] = "Unknown Source";       // Default text if source not determined
            }
        }
        
        row[4] = order.getStatus(); // Order Status
        row[5] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(order.getTimestamp());
        row[6] = order.getPenalty();

        model.addRow(row);
    }
}
    
    
    
    
 
   
/*
    
    private void populateOrdersTable() {
    DefaultTableModel model = (DefaultTableModel) logisticOrders.getModel();
    model.setRowCount(0);
    
    MasterOrderList masterOrderList = business.getMasterOrderList();
    
    for (Order order : masterOrderList.getOrders()) {
        Object[] row = new Object[5];  // Columns: Order ID, Name, Address, Supermarket Name, Order Status
        row[0] = order.getOrderId();   // Order ID

        if (order.getRegularUser() != null) {
            // If the order is associated with a regular user
            RegularUserProfile regularUser = order.getRegularUser();
            row[1] = regularUser.getPerson().getName();      // Regular User Name
            row[2] = regularUser.getPerson().getAddress();   // Regular User Address
        } else if (order.getCustomer() != null && order.getCustomer().getPerson() != null) {
            // If the order is associated with a customer (not a regular user)
            row[1] = order.getCustomer().getPerson().getName();  // Customer Name
            row[2] = order.getCustomer().getPerson().getAddress(); // Customer Address
        } else {
            row[1] = "No Name Available";   // Default text if no name available
            row[2] = "No Address Available"; // Default text if no address available
        }

        row[3] = order.getSupermarketName();  // Supermarket Name
        row[4] = order.getStatus();           // Order Status

        model.addRow(row);
    }
}*/
    
    

      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateOrderStatus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        logisticOrders = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        updateOrderStatus.setBackground(new java.awt.Color(0, 204, 255));
        updateOrderStatus.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        updateOrderStatus.setForeground(new java.awt.Color(255, 255, 255));
        updateOrderStatus.setText("UPDATE ORDER STATUS");
        updateOrderStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOrderStatusActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        logisticOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Ordered By", "Delivery Address", "Sold By", "Order Status", "Timestamp", "Penalty"
            }
        ));
        jScrollPane2.setViewportView(logisticOrders);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Logistics Order Tracking");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(389, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateOrderStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOrderStatusActionPerformed
        // TODO add your handling code here:
        int selectedRow = logisticOrders.getSelectedRow();
        if (selectedRow >= 0) {
            int orderId = (int) logisticOrders.getValueAt(selectedRow, 0);
            Order orderToUpdate = business.getMasterOrderList().findOrderById(orderId);
            if (orderToUpdate != null) {
                
                Date now = new Date();
                long diff = now.getTime() - orderToUpdate.getTimestamp().getTime();
                long diffSeconds = diff / 1000;
                
                              
   if (diffSeconds > 30) { // More than 5 minutes late
                JOptionPane.showMessageDialog(this, "You will be penalized for the delay in delivery.");
                orderToUpdate.setPenalty("Late Delivery"); // Set penalty as needed
            }

            orderToUpdate.setStatus("Delivered");
            business.getMasterOrderList().notifyOrderStatusChanged(orderToUpdate);
            populateOrdersTable(); // Refresh the table
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select an order to update.");
    }

        
    }//GEN-LAST:event_updateOrderStatusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable logisticOrders;
    private javax.swing.JButton updateOrderStatus;
    // End of variables declaration//GEN-END:variables
}
