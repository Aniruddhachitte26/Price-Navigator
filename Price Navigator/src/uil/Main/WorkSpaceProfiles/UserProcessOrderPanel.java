/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uil.Main.WorkSpaceProfiles;


import java.awt.CardLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.SuperMarketManagement.SuperMarketProfile;
import model.SuperMarketManagement.SuperMarketProfile.ProductInfo;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.ProductManagement.Product;
import model.RegularUser.RegularUserProfile;
import static utility.Email.SmtpEmail.sendEmailMessage;

/**
 *
 * @author divyansjemni
 */
public class UserProcessOrderPanel extends javax.swing.JPanel {
    
    
    JPanel CardSequencePanel;
    Business business;
    RegularUserProfile ru;
    Order currentOrder;

    /**
     * Creates new form regularUserProcessOrderPanel
     */
    public UserProcessOrderPanel(Business b ,RegularUserProfile rup, JPanel jp) {
        
        CardSequencePanel = jp;
        this.business = b;
        ru = rup;
        initComponents();
        populateDistanceDropdown();
        SupermarketComboBox.setEnabled(false); // Disable by default
        
       txtNutritionContent.setOpaque(true);
       txtNutritionContent.setBackground(Color.black); // Set the background color
       txtNutritionContent.setForeground(Color.WHITE); // Set the text color
    }
    
    private void populateDistanceDropdown() {
    distanceComboBox1.addItem("Select Distance");
    distanceComboBox1.addItem("< 25");
    distanceComboBox1.addItem("> 25");
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        SuperMarketProductTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        OrderItemsTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        SupermarketComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        btnRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        distanceComboBox1 = new javax.swing.JComboBox<>();
        txtNutritionContent = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnSubmit.setBackground(new java.awt.Color(0, 204, 255));
        btnSubmit.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        SuperMarketProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Actual Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SuperMarketProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SuperMarketProductTableMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SuperMarketProductTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(SuperMarketProductTable);

        jScrollPane2.setViewportView(jScrollPane1);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Prepare Order");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8.setText("Products Table");

        OrderItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Actual price", "Quanity", "Item total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OrderItemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OrderItemsTableMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OrderItemsTableMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(OrderItemsTable);

        jScrollPane3.setViewportView(jScrollPane4);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 255));
        jLabel9.setText("Order Items / Cart");

        btnadd.setBackground(new java.awt.Color(0, 204, 255));
        btnadd.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("ADD TO CART");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddAddProductItemActionPerformed(evt);
            }
        });

        SupermarketComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupermarketComboBoxActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel13.setText("Quantity");

        btnRemove.setBackground(new java.awt.Color(0, 204, 255));
        btnRemove.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("REMOVE");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveAddProductItemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("SuperMarket");

        Back.setBackground(new java.awt.Color(0, 204, 255));
        Back.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("Distance");

        distanceComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distanceComboBox1ActionPerformed(evt);
            }
        });

        txtNutritionContent.setBackground(new java.awt.Color(0, 0, 0));
        txtNutritionContent.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txtNutritionContent.setText("Nutrition Content will display here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNutritionContent, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(Back)
                                    .addGap(57, 57, 57))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(distanceComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(SupermarketComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 75, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SupermarketComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distanceComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addComponent(txtNutritionContent, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Back))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

    String selectedCustomerId = (String) SupermarketComboBox.getSelectedItem();
    SuperMarketProfile selectedSupermarketProfile = business.getCustomerDirectory().findCustomer(selectedCustomerId);

    if (selectedSupermarketProfile == null) {
        JOptionPane.showMessageDialog(this, "No valid supermarket selected.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String supermarketName = selectedCustomerId;
    
    // Create a new order for the regular user
    if (currentOrder == null) {
        currentOrder = new Order(ru);  // Assuming 'ru' is your RegularUserProfile instance
        currentOrder.setSupermarketName(supermarketName);
    }

    DefaultTableModel model = (DefaultTableModel) OrderItemsTable.getModel();
    for (int i = 0; i < model.getRowCount(); i++) {
        String productName = model.getValueAt(i, 0).toString();
        Product product = findProductByProductName(selectedSupermarketProfile, productName);

        if (product == null) {
            JOptionPane.showMessageDialog(this, "Product not found: " + productName, "Data Error", JOptionPane.ERROR_MESSAGE);
            continue;
        }

        try {
            int price = Integer.parseInt(model.getValueAt(i, 1).toString());
            int quantity = Integer.parseInt(model.getValueAt(i, 2).toString());
            currentOrder.newOrderItem(product, price, quantity);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid price or quantity.", "Data Error", JOptionPane.ERROR_MESSAGE);
            continue;
        }
    }
    
    MasterOrderList masterOrderList = business.getMasterOrderList();
    masterOrderList.addOrder(currentOrder);

    // Clear the order table and prepare for new orders
    model.setRowCount(0);
    JOptionPane.showMessageDialog(this, "Order placed successfully.", "Order Status", JOptionPane.INFORMATION_MESSAGE);
     
    String emailSubject = "Order Confirmation - Order ID: " + currentOrder.getOrderId();
    String username = ru.getPerson().getName();
    String email= ru.getPerson().getEmail();
    StringBuilder emailBody = new StringBuilder();
emailBody.append("<p>Hi ").append(username).append(",</p>")
         .append("<p>Greetings of the day!</p>")
         .append("<p>Thank you for your order! Below are the details of your purchase:</p>")
         .append("<table style='border-collapse: collapse; width: 100%;' border='1'>")
         .append("<tr style='background-color: #4CAF50; color: white;'>")
         .append("<th>Product Name</th><th>Quantity</th><th>Unit Price</th><th>Total Price</th></tr>");

for (OrderItem item : currentOrder.getOrderItems()) {
    emailBody.append("<tr>")
             .append("<td>").append(item.getSelectedProduct().getName()).append("</td>")
             .append("<td>").append(item.getQuantity()).append("</td>")
             .append("<td>$").append(String.format("%.2f", (double) item.getActualPrice())).append("</td>")
             .append("<td>$").append(String.format("%.2f", (double) item.getOrderItemTotal())).append("</td>")
             .append("</tr>");
}

emailBody.append("</table>")
         .append("<br>")
         .append(txtNutritionContent.getText().replace("cart", "order"))
         .append("<br><h5>Happy Shopping!!!!</h5><br>")
         .append("Team,<br>")
         .append("Price Navigator.<br>");
    
     sendEmailMessage(email, emailSubject, emailBody.toString());
    
    currentOrder = null;
    CardSequencePanel.remove(this);
    ((CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    
    }
    
    
    private Product findProductByProductName(SuperMarketProfile supermarketProfile, String productName) {
    if (supermarketProfile == null || productName == null || productName.isEmpty()) {
        return null;
    }

    // Assuming SuperMarketProfile has a method to get all available products
    List<SuperMarketProfile.ProductInfo> availableProducts = supermarketProfile.getAvailableProducts();

    for (SuperMarketProfile.ProductInfo productInfo : availableProducts) {
        if (productInfo.getProduct().getName().equalsIgnoreCase(productName)) {
            return productInfo.getProduct();
        }
    }

    return null; // Return null if product is not found

    
   
    
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void SuperMarketProductTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuperMarketProductTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SuperMarketProductTableMouseEntered

    private void SuperMarketProductTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuperMarketProductTableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SuperMarketProductTableMousePressed

    private void OrderItemsTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderItemsTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderItemsTableMouseEntered

    private void OrderItemsTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderItemsTableMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_OrderItemsTableMousePressed

    private void btnaddAddProductItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddAddProductItemActionPerformed
        // TODO add your handling code here:
        
       // Get the selected row index from the SuperMarketProductTable.
    int selectedRowIndex = SuperMarketProductTable.getSelectedRow();
    
    if (selectedRowIndex < 0) {
        JOptionPane.showMessageDialog(null, "Please select a product.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Assuming that the quantity column is at index 2 in the SuperMarketProductTable.
    int availableQuantity = Integer.parseInt(SuperMarketProductTable.getValueAt(selectedRowIndex, 2).toString());
    
    // Get the quantity the user wants to add to the cart.
    int requestedQuantity;
    try {
        requestedQuantity = Integer.parseInt(txtquantity.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter a valid quantity.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    if (requestedQuantity <= 0 || requestedQuantity > availableQuantity) {
        JOptionPane.showMessageDialog(null, "Invalid quantity entered.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Decrease the available quantity in the Product table.
    int newQuantity = availableQuantity - requestedQuantity;
    SuperMarketProductTable.setValueAt(newQuantity, selectedRowIndex, 2); // Update the table model directly.

    // Assuming the actual price column is at index 1 in the SuperMarketProductTable.
    int actualPrice = Integer.parseInt(SuperMarketProductTable.getValueAt(selectedRowIndex, 1).toString());
    
    // Assuming the name column is at index 0 in the SuperMarketProductTable.
    String productName = SuperMarketProductTable.getValueAt(selectedRowIndex, 0).toString();
    
    // Calculate the total price for the order item.
    int itemTotal = actualPrice * requestedQuantity;
    
    // Add the selected product with the specified quantity to the OrderItemsTable.
    DefaultTableModel cartModel = (DefaultTableModel) OrderItemsTable.getModel();
    cartModel.addRow(new Object[]{productName, actualPrice, requestedQuantity, itemTotal});
    
    // Optionally, you can clear the quantity text field after adding to the cart.
    txtquantity.setText("");
    
    SupermarketComboBox.setEnabled(false);
    
   updateNutritionContentMessage();

    }//GEN-LAST:event_btnaddAddProductItemActionPerformed

    private void SupermarketComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupermarketComboBoxActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) SuperMarketProductTable.getModel();
model.setRowCount(0);

// Get the selected supermarket's name
String selectedSupermarketName = (String) SupermarketComboBox.getSelectedItem();

// Find the customer profile corresponding to the selected supermarket
SuperMarketProfile selectedSupermarketProfile = business.getCustomerDirectory().findCustomer(selectedSupermarketName);

// If the selected supermarket profile is found, populate the table
if (selectedSupermarketProfile != null) {
    List<ProductInfo> availableProducts = selectedSupermarketProfile.getAvailableProducts();
    for (ProductInfo productInfo : availableProducts) {
        Object[] row = new Object[3];
        row[0] = productInfo.getProduct().getName();
        row[1] = productInfo.getActualPrice();
        row[2] = productInfo.getQuantity();
        model.addRow(row); // Add the row to the table
    }
} else {
    // Handle case where selected supermarket profile is not found
}


    }//GEN-LAST:event_SupermarketComboBoxActionPerformed



    private void btnRemoveAddProductItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveAddProductItemActionPerformed
        // TODO add your handling code here:
  // Get the selected row index from the OrderItemsTable.
  

    
    int selectedRowIndex = OrderItemsTable.getSelectedRow();
    
    if (selectedRowIndex < 0) {
        JOptionPane.showMessageDialog(null, "Please select an order item to remove.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Get the product name and quantity to be removed from the OrderItemsTable.
    String productNameToRemove = OrderItemsTable.getValueAt(selectedRowIndex, 0).toString();
    int quantityToRemove = Integer.parseInt(OrderItemsTable.getValueAt(selectedRowIndex, 2).toString());
    
    // Remove the selected row from the OrderItemsTable.
    DefaultTableModel orderItemsModel = (DefaultTableModel) OrderItemsTable.getModel();
    orderItemsModel.removeRow(selectedRowIndex);
    
    // Find the matching row in the SuperMarketProductTable and update the quantity.
    DefaultTableModel superMarketProductModel = (DefaultTableModel) SuperMarketProductTable.getModel();
    for (int i = 0; i < superMarketProductModel.getRowCount(); i++) {
        String productName = superMarketProductModel.getValueAt(i, 0).toString();
        if (productName.equals(productNameToRemove)) {
            int currentQuantity = Integer.parseInt(superMarketProductModel.getValueAt(i, 2).toString());
            int newQuantity = currentQuantity + quantityToRemove; // Increase the quantity back to the original count.
            superMarketProductModel.setValueAt(newQuantity, i, 2);
            break; // Assuming unique product names, we can break after finding the match.
        }
    }
    
    JOptionPane.showMessageDialog(null, "The selected order item has been removed.", "Item Removed", JOptionPane.INFORMATION_MESSAGE);


    if (OrderItemsTable.getRowCount() == 0) {
    // Re-enable the supermarket dropdown only if the selected distance is valid
    String selectedDistance = (String) distanceComboBox1.getSelectedItem();
    SupermarketComboBox.setEnabled(!"Select Distance".equals(selectedDistance));
    }
    
    // Update the nutritional content message.
    updateNutritionContentMessage();
    
    }//GEN-LAST:event_btnRemoveAddProductItemActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        //       ((java.awt.CardLayout)CardSequencePanel.getLayout()).show(CardSequencePanel, "IdentifyEventTypes");
    }//GEN-LAST:event_BackActionPerformed

    private void distanceComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distanceComboBox1ActionPerformed
        // TODO add your handling code here:
    SupermarketComboBox.removeAllItems(); // Clear previous items
    String selectedDistance = (String) distanceComboBox1.getSelectedItem();
    
    // Based on selection, populate the SupermarketComboBox
    if ("< 25".equals(selectedDistance)) {
        List<SuperMarketProfile> supermarkets = business.getSupermarketsWithinDistance(25);
        for (SuperMarketProfile supermarket : supermarkets) {
            SupermarketComboBox.addItem(supermarket.getPerson().getPersonId());
        }
    } else if ("> 25".equals(selectedDistance)) {
        List<SuperMarketProfile> supermarkets = business.getSupermarketsBeyondDistance(25);
        for (SuperMarketProfile supermarket : supermarkets) {
            SupermarketComboBox.addItem(supermarket.getPerson().getPersonId());
        }
    }
    SupermarketComboBox.setEnabled(true); // Enable the supermarket combo box
 
    }//GEN-LAST:event_distanceComboBox1ActionPerformed

private String calculateAverageNutritionContentForTable(DefaultTableModel tableModel) {
    double totalSugar = 0.0;
    double totalTransfat = 0.0;
    double totalSodium = 0.0;
    double totalCholesterol = 0.0;
    int totalQuantity = 0;
    
    for (int i = 0; i < tableModel.getRowCount(); i++) {
        Product product = findProductByProductName(business.getCustomerDirectory().findCustomer((String) SupermarketComboBox.getSelectedItem()), (String) tableModel.getValueAt(i, 0));
        
        if (product != null) {
            int quantity = (Integer) tableModel.getValueAt(i, 2);

            totalSugar += product.getSugarPercentage() * quantity;
            totalTransfat += product.getTransfatPercentage() * quantity;
            totalSodium += product.getSodiumPercentage() * quantity;
            totalCholesterol += product.getCholesterolPercentage() * quantity;
            totalQuantity += quantity;
        }
    }

    if (totalQuantity == 0) {
        return "No products in the cart.";
    }

    // Calculate averages
    double avgSugar = totalSugar / totalQuantity;
    double avgTransfat = totalTransfat / totalQuantity;
    double avgSodium = totalSodium / totalQuantity;
    double avgCholesterol = totalCholesterol / totalQuantity;
    
    // Calculate overall average percentage
    double overallAverage = (avgSugar + avgTransfat + avgSodium + avgCholesterol) / 4;

    // Categorize the overall nutritional content
    String message;
    if (overallAverage < 20) {
        message = "<html><span style='font-size:20px;color:red;font-weight:bold'>\"Great picks! These choices are harmonizing well with your health goals.\"</span></html>";
    } else if (overallAverage <= 55) {
        message = "<html><span style='font-size:14px;color:orange;font-weight:bold'>\"Perfect harmony! Your cart is tuned to the ideal nutrient balance.\"</span></html>";
    } else {
        message = "<html><span style='font-size:14px;color:green;font-weight:bold'>\"Nutrient crescendo! Time to fine-tune your selections for better harmony.\"</span></html>";
    }

    return message;
}

 // Helper method to update the nutrition content message
private void updateNutritionContentMessage() {
    String nutritionMessage = calculateAverageNutritionContentForTable((DefaultTableModel) OrderItemsTable.getModel());
    txtNutritionContent.setText(nutritionMessage);
}   



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTable OrderItemsTable;
    private javax.swing.JTable SuperMarketProductTable;
    private javax.swing.JComboBox<String> SupermarketComboBox;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnadd;
    private javax.swing.JComboBox<String> distanceComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel txtNutritionContent;
    private javax.swing.JTextField txtquantity;
    // End of variables declaration//GEN-END:variables
}
