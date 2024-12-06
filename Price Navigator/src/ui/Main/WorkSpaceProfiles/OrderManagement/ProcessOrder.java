/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Main.WorkSpaceProfiles.OrderManagement;


import model.Business.Business;
import model.SuperMarketManagement.SuperMarketProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.DistributorManagement.DistributorPersonProfile;
import model.Supplier.Supplier;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static utility.Email.SmtpEmail.sendEmailMessage;

/**
 *
 * @author Aniruddha
 */
public class ProcessOrder extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliersJPanel
     */
    JPanel CardSequencePanel;
    Business business;
    Supplier selectedsupplier;
    Product selectedproduct;
    Order currentOrder;
    SuperMarketProfile customer;
    DistributorPersonProfile salesperson;
    ArrayList<Integer> rowsAnalysed = new ArrayList<>();
     
    public ProcessOrder(Business bz, SuperMarketProfile cp, DistributorPersonProfile spp, JPanel jp) {

        CardSequencePanel = jp;
        this.business = bz;
        initComponents();
        customer = cp;
        salesperson = spp;
        salesPersonTextField.setText(salesperson.getPerson().toString());
        customerTextField.setText(customer.getCustomerId());
        MasterOrderList mol = business.getMasterOrderList();
        currentOrder =  mol.newOrder(customer, salesperson); //no order was made yet
      
        initializeTable();
 

    }
   


    private void initializeTable() {

//clear supplier table
        cleanUpCombobox();
        cleanUpTable();

//load suppliers to the combobox
        ArrayList<Supplier> supplierlist = business.getSupplierDirectory().getSuplierList();

        if (supplierlist.isEmpty()) {
            return;
        }

        for (Supplier s : supplierlist) {
            
            SuppliersComboBox.addItem(s.toString());
            SuppliersComboBox.setSelectedIndex(0);
            String suppliername = (String) SuppliersComboBox.getSelectedItem();
            selectedsupplier = business.getSupplierDirectory().findSupplier(suppliername);
            ProductCatalog pc = selectedsupplier.getProductCatalog();
            for (Product pt : pc.getProductList()) {
/*
           Object[] row = new Object[9];
                row[0] = pt;
                row[1] = pt.getCholesterolPercentage();
                row[2] = pt.getSodiumPercentage();
                row[3] = pt.getSugarPercentage();
                row[4]=pt.getTransfatPercentage();
                row[5] = pt.getFloorPrice();
                row[6] = pt.getCeilingPrice();
                row[7] = pt.getTargetPrice();*/
                    Object[] row = new Object[5];
                row[0] = pt;
                row[1] = pt.getFloorPrice();
                row[2] = pt.getCeilingPrice();
                row[3] = pt.getTargetPrice();

                ((DefaultTableModel) SupplierCatalogTable.getModel()).addRow(row);
            }

        }
       
    }

    public void cleanUpCombobox() {
        //Clean the combobox for supplier choices

        SuppliersComboBox.removeAllItems();

    }

    public void cleanUpTable() {

        //Clean the product catalog table
        int rc = SupplierCatalogTable.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) SupplierCatalogTable.getModel()).removeRow(i);
        }
    }
    public void cleanUpItemsTable() {

        //Clean the product catalog table
        int rc = OrderItemsTable.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) OrderItemsTable.getModel()).removeRow(i);
        }
    }

    public void refreshSupplierProductCatalogTable() {

DefaultTableModel model = (DefaultTableModel) SupplierCatalogTable.getModel();
    model.setRowCount(0); // Clear existing rows

    String supplierName = (String) SuppliersComboBox.getSelectedItem();
    if (supplierName == null) {
        return; // Exit if no supplier is selected
    }

    selectedsupplier = business.getSupplierDirectory().findSupplier(supplierName);
    if (selectedsupplier == null) {
        return; // Exit if no supplier is found
    }

    // Ensure we get the latest product catalog possibly updated elsewhere in the application
    ProductCatalog pc = selectedsupplier.getProductCatalog();
    for (Product pt : pc.getProductList()) {
        Object[] row = new Object[4]; // Adjust based on the columns
        row[0] = pt; // Assuming pt.toString() gives the product name
        row[1] = pt.getFloorPrice();
        row[2] = pt.getCeilingPrice();
        row[3] = pt.getTargetPrice();
        model.addRow(row);
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

        Next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        SuppliersComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        customerTextField = new javax.swing.JTextField();
        salesPersonTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtactprice = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnRecommendation = new javax.swing.JButton();
        btnAnalyse = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        productFrequencyBelowTargetTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        productFrequencyAboveTargetTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        productPricePerformanceTextField = new javax.swing.JTextField();
        productRevenueTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        productNameTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        productFrequencyBelowTargetAfterATextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        productFrequencyAboveTargetAfterATextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        productPricePerformanceAfterATextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        productRevenueAfterATextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SupplierCatalogTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        OrderItemsTable = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnStandardOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Next.setBackground(new java.awt.Color(0, 204, 255));
        Next.setForeground(new java.awt.Color(255, 255, 255));
        Next.setText("SUBMIT");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 170, 30));

        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Suppliers");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Prepare Order");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 870, -1));

        jLabel8.setText("Product");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        jLabel9.setForeground(new java.awt.Color(0, 204, 255));
        jLabel9.setText("Order Items / Cart");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 20));

        btnadd.setBackground(new java.awt.Color(0, 204, 255));
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add to Cart");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductItemActionPerformed(evt);
            }
        });
        add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 170, 30));

        SuppliersComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuppliersComboBoxActionPerformed(evt);
            }
        });
        add(SuppliersComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, -1));

        jLabel10.setForeground(new java.awt.Color(0, 204, 255));
        jLabel10.setText("SuperMarket");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 150, -1));
        add(customerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 160, -1));
        add(salesPersonTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 160, -1));

        jLabel11.setForeground(new java.awt.Color(0, 204, 255));
        jLabel11.setText("Customer");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 150, -1));

        jLabel12.setForeground(new java.awt.Color(0, 204, 255));
        jLabel12.setText("Actual Price");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, -1));
        add(txtactprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 170, 20));

        jLabel13.setText("Quantity");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, -1));
        add(txtquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 170, -1));

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2AddProductItemActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 170, 30));

        btnRecommendation.setBackground(new java.awt.Color(0, 204, 255));
        btnRecommendation.setForeground(new java.awt.Color(255, 255, 255));
        btnRecommendation.setText("View Recommendation");
        btnRecommendation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecommendationActionPerformed(evt);
            }
        });
        add(btnRecommendation, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 170, 30));

        btnAnalyse.setBackground(new java.awt.Color(0, 204, 255));
        btnAnalyse.setForeground(new java.awt.Color(255, 255, 255));
        btnAnalyse.setText("Analyse");
        btnAnalyse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyseActionPerformed(evt);
            }
        });
        add(btnAnalyse, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 170, 30));

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 255));
        jLabel14.setText("*View recommendation before adding to cart");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, -1));

        btnBack.setBackground(new java.awt.Color(0, 204, 255));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText(" BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 170, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Business-wide Product Intelligence", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText("Frequency Below STR Price");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 180, -1));

        productFrequencyBelowTargetTextField.setEnabled(false);
        jPanel1.add(productFrequencyBelowTargetTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 150, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setText("Frequency Above STR Price");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 180, -1));

        productFrequencyAboveTargetTextField.setEnabled(false);
        jPanel1.add(productFrequencyAboveTargetTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 150, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setText("Marign around STR Price");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 160, 20));

        productPricePerformanceTextField.setEnabled(false);
        productPricePerformanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productPricePerformanceTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(productPricePerformanceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 150, 30));

        productRevenueTextField.setEnabled(false);
        productRevenueTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productRevenueTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(productRevenueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 150, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setText("Sales Revenues");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 110, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("Product Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 110, -1));

        productNameTextField.setEnabled(false);
        productNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(productNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, -1));

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 255));
        jLabel15.setText("Before Analysis:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 100, 20));

        productFrequencyBelowTargetAfterATextField.setEnabled(false);
        jPanel1.add(productFrequencyBelowTargetAfterATextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 150, -1));

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 204, 255));
        jLabel16.setText("Frequency Below STR Price");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        productFrequencyAboveTargetAfterATextField.setEnabled(false);
        jPanel1.add(productFrequencyAboveTargetAfterATextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 150, -1));

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 204, 255));
        jLabel17.setText("Frequency Above STR Price");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 180, -1));

        productPricePerformanceAfterATextField.setEnabled(false);
        productPricePerformanceAfterATextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productPricePerformanceAfterATextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(productPricePerformanceAfterATextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 150, 30));

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 204, 255));
        jLabel18.setText("Marign around STR Price");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 170, 20));

        productRevenueAfterATextField.setEnabled(false);
        productRevenueAfterATextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productRevenueAfterATextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(productRevenueAfterATextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 150, -1));

        jLabel19.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 204, 255));
        jLabel19.setText("Sales Revenues");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 110, -1));

        jLabel20.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 204, 255));
        jLabel20.setText("After Analysis:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 100, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 600, 300));

        SupplierCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Min Price", "Max Price", "Strategic Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SupplierCatalogTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SupplierCatalogTableMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SupplierCatalogTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(SupplierCatalogTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 600, 110));

        OrderItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Actual price", "Quanity", "Item total", "Strategic Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
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
        if (OrderItemsTable.getColumnModel().getColumnCount() > 0) {
            OrderItemsTable.getColumnModel().getColumn(0).setResizable(false);
            OrderItemsTable.getColumnModel().getColumn(1).setResizable(false);
            OrderItemsTable.getColumnModel().getColumn(2).setResizable(false);
            OrderItemsTable.getColumnModel().getColumn(3).setResizable(false);
            OrderItemsTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 600, 90));

        btnRefresh.setBackground(new java.awt.Color(0, 204, 255));
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh Data");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 170, 30));

        btnStandardOrder.setBackground(new java.awt.Color(0, 204, 255));
        btnStandardOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnStandardOrder.setText("Standard Order");
        btnStandardOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStandardOrderAddProductItemActionPerformed(evt);
            }
        });
        add(btnStandardOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 170, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
    /*  if (OrderItemsTable.getSelectedRow() != -1) {
    // A row is selected, proceed with the submission.
    currentOrder.Submit(); 
    JOptionPane.showMessageDialog(CardSequencePanel, "Thank you, your deal is closed.", "Submission Successful", JOptionPane.INFORMATION_MESSAGE);

    CardSequencePanel.remove(this);
    ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
} else {
    // No row is selected, show an error message.
    JOptionPane.showMessageDialog(CardSequencePanel, "Please select a deal to close.", "Selection Required", JOptionPane.WARNING_MESSAGE);
}
*/currentOrder.Submit();
    JOptionPane.showMessageDialog(CardSequencePanel, "Thank you, your order has been placed.", "Submission Successful", JOptionPane.INFORMATION_MESSAGE);

    String emailSubject = "Order Confirmation - Order ID: " + currentOrder.getOrderId();
    String supermarketname = customer.getPerson().getName();
    
StringBuilder emailBody = new StringBuilder();
emailBody.append("<p>Hi ").append(supermarketname).append(",</p>");
emailBody.append("<p>Greetings of the day!</p>");
emailBody.append(String.format(
    "<p>Thank you for your order! Below are the details of your purchase placed by %s from the supplier %s:</p>",
    salesperson.getPerson().getName(),
    selectedsupplier.getName()
));

emailBody.append("<table style='border-collapse: collapse; width: 100%;' border='1'>");
emailBody.append("<tr style='background-color: #4CAF50; color: white;'>");
emailBody.append("<th>Product Name</th><th>Quantity</th><th>Unit Price</th><th>Total Price</th></tr>");

for (OrderItem item : currentOrder.getOrderItems()) {
    emailBody.append("<tr>");
    emailBody.append("<td>").append(item.getSelectedProduct().getName()).append("</td>");
    emailBody.append("<td>").append(item.getQuantity()).append("</td>");

    double actualPrice = item.getActualPrice();
    double totalPrice = item.getOrderItemTotal();

    emailBody.append("<td>$").append(String.format("%.2f", actualPrice)).append("</td>");
    emailBody.append("<td>$").append(String.format("%.2f", totalPrice)).append("</td>");
    emailBody.append("</tr>");
}

   emailBody.append("</table>");

   emailBody.append("<br>");
   
   emailBody.append("<h5>Happy Shopping!!!!</h5><br>");
   emailBody.append("Team,<br>");
   emailBody.append("Market Harmonix.<br>");
   
    System.out.println("Number of items in the order: " + currentOrder.getOrderItems().size());
    sendEmailMessage(customer.getPerson().getEmail(), emailSubject, emailBody.toString());
    
    CardSequencePanel.remove(this);
    ((CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);


    }//GEN-LAST:event_NextActionPerformed

    private void AddProductItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductItemActionPerformed
        // TODO add your handling code here:

       int suppliertablesize = SupplierCatalogTable.getRowCount();
       int selectedrow = SupplierCatalogTable.getSelectionModel().getLeadSelectionIndex();

// Check if a row is selected in the SupplierCatalogTable
if (selectedrow < 0 || selectedrow >= suppliertablesize) {
    JOptionPane.showMessageDialog(null, "Please select a product from the supplier catalog.", "Selection Required", JOptionPane.WARNING_MESSAGE);
    return;
}

// Assuming selectedproduct is declared and initialized correctly before this snippet
selectedproduct = (Product) SupplierCatalogTable.getValueAt(selectedrow, 0);
if (selectedproduct == null) {
    JOptionPane.showMessageDialog(null, "Please select a valid product.", "Invalid Product", JOptionPane.WARNING_MESSAGE);
    return;
}

// Validation for actual price
String actualPriceStr = txtactprice.getText().trim();
if (actualPriceStr.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter the actual price.", "Input Required", JOptionPane.WARNING_MESSAGE);
    return;
}
int actualPrice;
try {
    actualPrice = Integer.parseInt(actualPriceStr);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Invalid format for actual price. Please enter a numeric value.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
    return;
}

// Validation for quantity
String quantityStr = txtquantity.getText().trim();
if (quantityStr.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter the quantity.", "Input Required", JOptionPane.WARNING_MESSAGE);
    return;
}
int quantity;
try {
    quantity = Integer.parseInt(quantityStr);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Invalid format for quantity. Please enter a numeric value.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
    return;
}

// Proceed with adding the order item
OrderItem item = currentOrder.newOrderItem(selectedproduct, actualPrice, quantity);
Object[] row = new Object[8];

row[0] = String.valueOf(item.getSelectedProduct());
row[1] = String.valueOf(item.getActualPrice());
row[2] = String.valueOf(item.getQuantity());
row[3] = String.valueOf(item.getOrderItemTotal());

row[4] = String.valueOf(selectedproduct.getTargetPrice());


((DefaultTableModel) OrderItemsTable.getModel()).addRow(row);
 
          txtactprice.setText("");
          txtquantity.setText("");

    }//GEN-LAST:event_AddProductItemActionPerformed

    private void SuppliersComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuppliersComboBoxActionPerformed
        // TODO add your handling code here:
     refreshSupplierProductCatalogTable();
    }//GEN-LAST:event_SuppliersComboBoxActionPerformed

    private void jButton2AddProductItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2AddProductItemActionPerformed
        // TODO add your handling code here:
     
int orderItemsTableSize = OrderItemsTable.getRowCount();
int selectedRowForRemoval = OrderItemsTable.getSelectionModel().getLeadSelectionIndex();

if (selectedRowForRemoval < 0 || selectedRowForRemoval >= orderItemsTableSize) {
    // No row is selected, show an error message.
    JOptionPane.showMessageDialog(null, "Please select an order item to remove.", "Selection Required", JOptionPane.WARNING_MESSAGE);
    return;
}


// Remove the selected row from the OrderItemsTable
((DefaultTableModel) OrderItemsTable.getModel()).removeRow(selectedRowForRemoval);

// Optionally, display a confirmation message after successful removal
JOptionPane.showMessageDialog(null, "The selected order item has been successfully removed.", "Item Removed", JOptionPane.INFORMATION_MESSAGE);

     productRevenueAfterATextField.setText("");
     productPricePerformanceAfterATextField.setText("");
     productFrequencyAboveTargetAfterATextField.setText("");
     productFrequencyBelowTargetAfterATextField.setText("");
  

    }//GEN-LAST:event_jButton2AddProductItemActionPerformed

    private void btnRecommendationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecommendationActionPerformed
        // TODO add your handling code here:
        btnRecommendation.setEnabled(false); // Disable the button at the start to prevent multiple clicks
    try {
        int suppliertablesize = SupplierCatalogTable.getRowCount();
        int selectedRow = SupplierCatalogTable.getSelectedRow(); // Directly get the selected row index

        // Check if a row is selected in the SupplierCatalogTable
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a product from the supplier catalog.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String selectedSupplier = (String) SuppliersComboBox.getSelectedItem();
        String customername = customerTextField.getText();
        String salespersonName = salesPersonTextField.getText();
        String productName = selectedproduct.toString();
        int ceilingPrice = selectedproduct.getCeilingPrice();
        int targetPrice = selectedproduct.getTargetPrice();
        int floorPrice = selectedproduct.getFloorPrice();
        
        int FAT = Integer.parseInt(productFrequencyAboveTargetTextField.getText());
        int FBT = Integer.parseInt(productFrequencyBelowTargetTextField.getText());
        int MAP = Integer.parseInt(productPricePerformanceTextField.getText());
        int salesRevenue = Integer.parseInt(productRevenueTextField.getText());

        // Create and add the recommendation panel to the CardSequencePanel
        RecommendationJPanel rjp = new RecommendationJPanel(CardSequencePanel, business, selectedSupplier, customername, salespersonName, productName, ceilingPrice, floorPrice, targetPrice, FAT, FBT, MAP, salesRevenue);
        String panelKey = "RecommendationPanel"; // Define a key for the panel
        CardSequencePanel.add(panelKey, rjp); // Add the panel with a unique key
        ((CardLayout) CardSequencePanel.getLayout()).show(CardSequencePanel, panelKey); // Navigate directly to the newly added panel using its key
    } finally {
        btnRecommendation.setEnabled(true); // Re-enable the button after the operation completes
    }
    }//GEN-LAST:event_btnRecommendationActionPerformed

    private void btnAnalyseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyseActionPerformed
        // TODO add your handling code here:
        
        
 int selectedRowIndex = OrderItemsTable.getSelectedRow();
    if (selectedRowIndex == -1) {  // -1 indicates no selection
        JOptionPane.showMessageDialog(null, "Please select an item from the table before proceeding.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return; // Exit the method to prevent further execution
    }
    
    if (Integer.parseInt(productRevenueTextField.getText())!=0){

    // Continue with the extraction and processing of data
    DefaultTableModel model = (DefaultTableModel) OrderItemsTable.getModel();
    int orderItemsTableSize = OrderItemsTable.getRowCount();
    if (orderItemsTableSize == 0) {
        JOptionPane.showMessageDialog(null, "No order items are present to analyze.", "Add Order Items", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    // Parsing and validation for fields
    int FAT, FBT, salesRevenue, marginProfit;
    try {
        FAT = Integer.parseInt(productFrequencyAboveTargetTextField.getText());
        FBT = Integer.parseInt(productFrequencyBelowTargetTextField.getText());
        salesRevenue = Integer.parseInt(productRevenueTextField.getText());
        marginProfit = Integer.parseInt(productPricePerformanceTextField.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid number format in one of the fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Define column indices for easier reference
    int actualPriceColumnIndex = 1;
    int targetPriceColumnIndex = 6;
    int quantityIndex = 2;

    for (int i = 0; i < orderItemsTableSize; i++) {
        Object actualPriceObj = model.getValueAt(i, actualPriceColumnIndex);
        Object targetPriceObj = model.getValueAt(i, targetPriceColumnIndex);
        Object quantityObj = model.getValueAt(i, quantityIndex);

        if (actualPriceObj == null || targetPriceObj == null || quantityObj == null) {
            continue; // Skip to the next row if any critical value is missing
        }

        int actualPrice = Integer.parseInt(actualPriceObj.toString());
        int targetPrice = Integer.parseInt(targetPriceObj.toString());
        int quantity = Integer.parseInt(quantityObj.toString());

        int newSalesRevenue = salesRevenue + (actualPrice * quantity);
        int newMarginProfit = marginProfit + ((actualPrice - targetPrice) * quantity);

        productRevenueAfterATextField.setText(Integer.toString(newSalesRevenue));
        productPricePerformanceAfterATextField.setText(Integer.toString(newMarginProfit));

        // Compare and update FBT & FAT
        if (actualPrice < targetPrice) {
            FBT++;
        } else if (actualPrice >= targetPrice) {
            FAT++;
        }
    }

    // Update the UI fields after the loop to reflect the final values
    productNameTextField.setText(model.getValueAt(selectedRowIndex, 0).toString());
    productFrequencyAboveTargetAfterATextField.setText(Integer.toString(FAT));
    productFrequencyBelowTargetAfterATextField.setText(Integer.toString(FBT));
    }
    else{
       JOptionPane.showMessageDialog(null, "The sales revenue is 0 so cannot analyse.", "Sales Value 0", JOptionPane.WARNING_MESSAGE);  
    }
    }//GEN-LAST:event_btnAnalyseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        CardSequencePanel.remove(this);
        CardLayout layout =(CardLayout) CardSequencePanel.getLayout();
        layout.previous(CardSequencePanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void productPricePerformanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productPricePerformanceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productPricePerformanceTextFieldActionPerformed

    private void productRevenueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productRevenueTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productRevenueTextFieldActionPerformed

    private void productNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameTextFieldActionPerformed

    private void productPricePerformanceAfterATextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productPricePerformanceAfterATextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productPricePerformanceAfterATextFieldActionPerformed

    private void productRevenueAfterATextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productRevenueAfterATextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productRevenueAfterATextFieldActionPerformed

    private void SupplierCatalogTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierCatalogTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierCatalogTableMouseEntered

    private void SupplierCatalogTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierCatalogTableMousePressed
        // TODO add your handling code here:
        int suppliertablesize = SupplierCatalogTable.getRowCount();
        int selectedrow = SupplierCatalogTable.getSelectionModel().getLeadSelectionIndex();

        if (selectedrow < 0 || selectedrow > suppliertablesize - 1) {
            return;
        }
        selectedproduct = (Product) SupplierCatalogTable.getValueAt(selectedrow, 0);
        if (selectedproduct == null) {
            return;
        }

        ProductSummary productsummary = new ProductSummary(selectedproduct);

        productNameTextField.setText(selectedproduct.toString());
        String revenues = String.valueOf(productsummary.getSalesRevenues());
        productRevenueTextField.setText(revenues);
        productFrequencyAboveTargetTextField.setText(String.valueOf(productsummary.getNumberAboveTarget()));
        productFrequencyBelowTargetTextField.setText(String.valueOf(productsummary.getNumberBelowTarget()));
        productPricePerformanceTextField.setText(String.valueOf(productsummary.getProductPricePerformance()));
    }//GEN-LAST:event_SupplierCatalogTableMousePressed

    private void OrderItemsTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderItemsTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderItemsTableMouseEntered

    private void OrderItemsTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderItemsTableMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_OrderItemsTableMousePressed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
refreshSupplierProductCatalogTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnStandardOrderAddProductItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStandardOrderAddProductItemActionPerformed
        // TODO add your handling code here:
        loadStandardOrder();
    }//GEN-LAST:event_btnStandardOrderAddProductItemActionPerformed

    
    public void loadStandardOrder() {
    Supplier sweetDelights = business.getSupplierDirectory().findSupplier("Sweet Delights");
    if (sweetDelights == null) {
        JOptionPane.showMessageDialog(null, "Supplier 'Sweet Delights' not found.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    SuperMarketProfile walmart = business.getCustomerDirectory().findCustomer("Walmart");
    if (walmart == null) {
        JOptionPane.showMessageDialog(null, "Customer 'Walmart' not found.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    DistributorPersonProfile salesPerson = salesperson; // Assuming 'salesperson' is correctly available in this context

    // Retrieve last ordered prices
    HashMap<String, Integer> lastOrderedPrices = getLastOrderedPrices(walmart);

    ProductCatalog productCatalog = sweetDelights.getProductCatalog();
    List<Product> products = productCatalog.getProductList();
    int productsAdded = 0;

    // Clear existing selections in the table
    SupplierCatalogTable.clearSelection();
    DefaultTableModel model = (DefaultTableModel) SupplierCatalogTable.getModel();

    for (Product product : products) {
        if (productsAdded >= 3) break; // Limit to adding three products

        int rowIndex = findProductRow(product);
        if (rowIndex != -1) {
            // Use last ordered price if available, otherwise use 110% of target price
            int actualPrice = lastOrderedPrices.getOrDefault(product.getName(), (int) (product.getTargetPrice() * 1.1));
            int quantity = 5; // Default quantity
            
            // Select the product row in the table (visually select the row)
            SupplierCatalogTable.setRowSelectionInterval(rowIndex, rowIndex);
            selectedproduct = product; // This simulates clicking on the product row

            // Adding the product to the current order programmatically
            addProductToOrder(product, actualPrice, quantity);
            productsAdded++;
        }
    }

    if (productsAdded == 0) {
        JOptionPane.showMessageDialog(null, "No products were added. Please ensure the supplier has products listed.", "No Products Added", JOptionPane.INFORMATION_MESSAGE);
    }
}

private int findProductRow(Product product) {
    DefaultTableModel model = (DefaultTableModel) SupplierCatalogTable.getModel();
    for (int i = 0; i < model.getRowCount(); i++) {
        Product tableProduct = (Product) model.getValueAt(i, 0);
        if (product.equals(tableProduct)) {
            return i;
        }
    }
    return -1; // Product not found in table
}

private HashMap<String, Integer> getLastOrderedPrices(SuperMarketProfile customer) {
    HashMap<String, Integer> lastPrices = new HashMap<>();
    for (Order order : business.getMasterOrderList().getOrders()) {
        if (order.getCustomer().equals(customer)) {
            for (OrderItem item : order.getOrderItems()) {
                lastPrices.put(item.getSelectedProduct().getName(), item.getActualPrice());
            }
        }
    }
    return lastPrices;
}

private void addProductToOrder(Product product, int actualPrice, int quantity) {
    // Validate inputs
    if (product == null || actualPrice <= 0 || quantity <= 0) {
        JOptionPane.showMessageDialog(null, "Invalid product details. Cannot add to order.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        return;
    }

    OrderItem item = currentOrder.newOrderItem(product, actualPrice, quantity);
    addRowToOrderItemsTable(item);
}

private void addRowToOrderItemsTable(OrderItem item) {
    DefaultTableModel model = (DefaultTableModel) OrderItemsTable.getModel();
    model.addRow(new Object[]{
        item.getSelectedProduct().getName(),
        item.getActualPrice(),
        item.getQuantity(),
        item.getOrderItemTotal(),
        item.getSelectedProduct().getTargetPrice()
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Next;
    private javax.swing.JTable OrderItemsTable;
    private javax.swing.JTable SupplierCatalogTable;
    private javax.swing.JComboBox<String> SuppliersComboBox;
    private javax.swing.JButton btnAnalyse;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRecommendation;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnStandardOrder;
    private javax.swing.JButton btnadd;
    private javax.swing.JTextField customerTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField productFrequencyAboveTargetAfterATextField;
    private javax.swing.JTextField productFrequencyAboveTargetTextField;
    private javax.swing.JTextField productFrequencyBelowTargetAfterATextField;
    private javax.swing.JTextField productFrequencyBelowTargetTextField;
    private javax.swing.JTextField productNameTextField;
    private javax.swing.JTextField productPricePerformanceAfterATextField;
    private javax.swing.JTextField productPricePerformanceTextField;
    private javax.swing.JTextField productRevenueAfterATextField;
    private javax.swing.JTextField productRevenueTextField;
    private javax.swing.JTextField salesPersonTextField;
    private javax.swing.JTextField txtactprice;
    private javax.swing.JTextField txtquantity;
    // End of variables declaration//GEN-END:variables

}
