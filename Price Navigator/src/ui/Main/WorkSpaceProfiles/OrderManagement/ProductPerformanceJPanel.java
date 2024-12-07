/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Main.WorkSpaceProfiles.OrderManagement;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.OrderManagement.OrderItem;
import model.ProductManagement.Product;
import javax.swing.table.DefaultTableModel;
import model.SuperMarketManagement.SuperMarketProfile;
import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductReport;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccount;
import uil.Main.WorkSpaceProfiles.DistributorPersonWorkAreaJPanel;


/**
 *
 * @author Aniruddha
 */
public class ProductPerformanceJPanel extends javax.swing.JPanel {
    
    javax.swing.JPanel CardSequencePanel;
    private Business business;
    private SupplierDirectory supplierDirectory;
    private OrderItem orderitem;
    private STRPriceChangeRequestJPanel targetpricechangerequest;
    private DefaultTableModel model; // Added model variable
    private ProductReport productReport;
    private SuperMarketProfile p;
    UserAccount ua;
    //CardSequencePanel csp;

    /**
     * Creates new form ProductPerformanceJPanel
     */
    
    public ProductPerformanceJPanel(Business business,SuperMarketProfile pp,JPanel clp) {
        initComponents();
        this.business = business; // Initialize your Business object here
        this.supplierDirectory = business.getSupplierDirectory();
        this.orderitem = orderitem;
        CardSequencePanel=clp;
        p=pp;
    
        this.targetpricechangerequest = targetpricechangerequest;
       this.productReport = new ProductReport();
       
        txtsupermarket.setText(p.getCustomerId());
        model = (DefaultTableModel) tblProductReport.getModel(); // Initialize model

        populateTable(model,business);
    }

    
       
private double calculateMarginUsingFloorAsCost(double sellingPrice, double floorPrice) {
    // Simplified margin calculation using floor price as a minimal cost proxy
    return ((sellingPrice - floorPrice) / sellingPrice) * 100;
   
   
}








public void populateTable(DefaultTableModel model, Business business) {
    model.setRowCount(0);

    if (business == null || business.getSupplierDirectory() == null) {
        System.err.println("Business data is not initialized properly.");
        return;
    }

    SupplierDirectory supplierDirectory = business.getSupplierDirectory();
    if (supplierDirectory.getSuplierList() == null || supplierDirectory.getSuplierList().isEmpty()) {
        System.err.println("No suppliers found.");
        return;
    }

    for (Supplier supplier : supplierDirectory.getSuplierList()) {
        for (Product product : supplier.getProductCatalog().getProductList()) {
            double bestImprovedMargin = -1; // Initialize to an invalid margin value
            double bestImprovedTargetPrice = product.getTargetPrice(); // Default to current target price
            double bestImprovementPercentage = 0; // Track the best improvement percentage
            
            double currentMargin = calculateMargin(product.getTargetPrice(), product.getNumberOfProductSalesAboveTarget());
            double[] improvementPercentages = {0.2, 0.5, 0.7};  // Target improvements

            // Iterate through improvement percentages to find the best margin
            for (double improvementPercentage : improvementPercentages) {
                double improvedTargetPrice = product.getTargetPrice() * (1 + improvementPercentage);
                double improvedMargin = calculateMargin(improvedTargetPrice, product.getNumberOfProductSalesBelowTarget());

                // Update the best values if this scenario has a better margin
                if (improvedMargin > bestImprovedMargin) {
                    bestImprovedMargin = improvedMargin;
                    bestImprovedTargetPrice = improvedTargetPrice;
                    bestImprovementPercentage = improvementPercentage;
                }
            }

            // Add only the best improvement scenario for each product
            model.addRow(new Object[]{
                supplier.getName(),
                product.getName(),
                product.getTargetPrice(),
                currentMargin,
                bestImprovedTargetPrice,
                bestImprovedMargin
            });
        }
    }
}

private double calculateMargin(double sellingPrice, double costPrice) {
    if (sellingPrice <= costPrice) return 0;  // Avoid division by zero or negative margins
    return ((sellingPrice - costPrice) / sellingPrice) * 100;
}

    private List<OrderItem> fetchOrderItemsForProduct(Product product) {
    // This method should return a list of OrderItems for the given product.
    // For demonstration, it returns an empty list.
    return new ArrayList<>();
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
        tblProductReport = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtsupermarket = new javax.swing.JTextField();
        lblsupermarket = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblProductReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Supplier Name", "Product Name", "Strategic Price", "Previous Margin", "New STR Price", "Current Margin"
            }
        ));
        jScrollPane1.setViewportView(tblProductReport);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product Performance Report");

        btnBack.setBackground(new java.awt.Color(0, 204, 255));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtsupermarket.setEnabled(false);

        lblsupermarket.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblsupermarket.setForeground(new java.awt.Color(0, 204, 255));
        lblsupermarket.setText("Supermarket :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(141, 141, 141)
                                .addComponent(lblsupermarket, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtsupermarket, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsupermarket)
                    .addComponent(txtsupermarket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblsupermarket;
    private javax.swing.JTable tblProductReport;
    private javax.swing.JTextField txtsupermarket;
    // End of variables declaration//GEN-END:variables
}

