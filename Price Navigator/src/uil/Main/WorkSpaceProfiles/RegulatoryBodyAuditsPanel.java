/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uil.Main.WorkSpaceProfiles;

import java.util.ArrayList;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.RegulatoryBody.RegulatoryBodyProfile;
import model.Supplier.Supplier;

/**
 *
 * @author divyansjemni
 */
public class RegulatoryBodyAuditsPanel extends javax.swing.JPanel {

     JPanel CardSequencePanel;
     Business business;
     RegulatoryBodyProfile pa;
     Supplier selectedsupplier;
     
    /**
     * Creates new form RegularatoryBodyAuditsPanel
     */
    public RegulatoryBodyAuditsPanel(Business b, RegulatoryBodyProfile paa, JPanel jp) {
        initComponents();
         this.CardSequencePanel = jp;
         business = b;
         pa = paa;
         populateNutritionalContentComboBox();
         populatePercentageComboBox();
         initializeTable();

    }


// Populate the nutritional content dropdown
private void populateNutritionalContentComboBox() {
    perAttributes.removeAllItems();
    perAttributes.addItem("");
    perAttributes.addItem("sugarPercentage");
    perAttributes.addItem("transfatPercentage");
    perAttributes.addItem("sodiumPercentage");
    perAttributes.addItem("cholesterolPercentage");
}

// Populate the percentage dropdown
private void populatePercentageComboBox() {
    perDropDown.removeAllItems();
    perDropDown.addItem("");
    perDropDown.addItem(">15%");
    perDropDown.addItem(">25%");
    perDropDown.addItem(">50%");
    perDropDown.addItem(">90%");
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
            
            comboBoxSupplier.addItem(s.toString());
            comboBoxSupplier.setSelectedIndex(0);
            String suppliername = (String) comboBoxSupplier.getSelectedItem();
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
                row[1] = pt.getSugarPercentage();
                row[2] = pt.getTransfatPercentage();
                row[3] = pt.getSodiumPercentage();
                row[4] = pt.getCholesterolPercentage();

                ((DefaultTableModel) SupplierCatalogTable.getModel()).addRow(row);
            }

        }
       
    }

    public void cleanUpCombobox() {
        //Clean the combobox for supplier choices

        comboBoxSupplier.removeAllItems();

    }

    public void cleanUpTable() {

        //Clean the product catalog table
        int rc = SupplierCatalogTable.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) SupplierCatalogTable.getModel()).removeRow(i);
        }
    }
    
    public void refreshSupplierProductCatalogTable() {

DefaultTableModel model = (DefaultTableModel) SupplierCatalogTable.getModel();
    model.setRowCount(0); // Clear existing rows

    String supplierName = (String) comboBoxSupplier.getSelectedItem();
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
        Object[] row = new Object[5]; // Adjust based on the columns
                row[0] = pt;
                row[1] = pt.getSugarPercentage();
                row[2] = pt.getTransfatPercentage();
                row[3] = pt.getSodiumPercentage();
                row[4] = pt.getCholesterolPercentage();
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

        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboBoxSupplier = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        SupplierCatalogTable = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnReportFindings = new javax.swing.JButton();
        perAttributes = new javax.swing.JComboBox<>();
        perDropDown = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Audits");

        Back.setBackground(new java.awt.Color(0, 204, 255));
        Back.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("Supplier");

        comboBoxSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSupplierActionPerformed(evt);
            }
        });

        SupplierCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Sugar %", "Transfat %", "Sodium %", "Cholesterol %"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        btnSearch.setBackground(new java.awt.Color(0, 204, 255));
        btnSearch.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnReportFindings.setBackground(new java.awt.Color(0, 204, 255));
        btnReportFindings.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnReportFindings.setForeground(new java.awt.Color(255, 255, 255));
        btnReportFindings.setText("REPORT FINDINGS");
        btnReportFindings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportFindingsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("Nutritional Content");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setText("Percentage");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setText("Products Table");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Back)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)))
                        .addGap(0, 829, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReportFindings, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(comboBoxSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(136, 136, 136)
                                    .addComponent(perAttributes, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(perDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(208, 208, 208)
                                    .addComponent(jLabel3)
                                    .addGap(73, 73, 73)
                                    .addComponent(jLabel4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(155, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(perAttributes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(btnReportFindings, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(Back)
                .addGap(202, 202, 202))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(370, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_BackActionPerformed

    private void SupplierCatalogTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierCatalogTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierCatalogTableMouseEntered

    private void SupplierCatalogTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierCatalogTableMousePressed

    }//GEN-LAST:event_SupplierCatalogTableMousePressed

    private void comboBoxSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSupplierActionPerformed
        // TODO add your handling code here:
        
        refreshSupplierProductCatalogTable();
    }//GEN-LAST:event_comboBoxSupplierActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
            // Get the selected criteria from combo boxes
    String nutritionalAttribute = (String) perAttributes.getSelectedItem();
    String percentageString = (String) perDropDown.getSelectedItem();

    // Extract the numeric value of the percentage
    int percentage = 0;
    if (percentageString != null && !percentageString.isEmpty()) {
        percentage = Integer.parseInt(percentageString.replaceAll("[^0-9]", ""));
    }

    // Refresh the table based on the selected criteria
    refreshTableWithCriteria(nutritionalAttribute, percentage);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnReportFindingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportFindingsActionPerformed
        // TODO add your handling code here:
try {
        int selectedRowIndex = SupplierCatalogTable.getSelectedRow();
        
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select a product from the table to report findings.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Check if nutritional content or percentage filters are applied
        boolean filtersApplied = perAttributes.getSelectedIndex() > 0 || perDropDown.getSelectedIndex() > 0;
    
        Product selectedProduct = null;
        Supplier supplier = null;
        
        if (filtersApplied) {
            // Code path for when filters are applied
            String productName = (String)SupplierCatalogTable.getValueAt(selectedRowIndex, 0);
            for (Supplier s : business.getSupplierDirectory().getSuplierList()) {
                selectedProduct = s.getProductCatalog().findProductByName(productName);
                if (selectedProduct != null) {
                    supplier = s;
                    break;
                }
            }
            if (selectedProduct == null) {
                JOptionPane.showMessageDialog(null, "Product not found.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else {
            // Code path for when no filters are applied
            selectedProduct = (Product)SupplierCatalogTable.getValueAt(selectedRowIndex, 0);
            Optional<Supplier> supplierOptional = business.getSupplierDirectory().findSupplierByProduct(selectedProduct);
            if (!supplierOptional.isPresent()) {
                JOptionPane.showMessageDialog(null, "No supplier found for the selected product.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            supplier = supplierOptional.get();
        }
    
        // At this point, you have selectedProduct and supplier for both scenarios
        // Proceed to navigate to the notification panel
        RegulatoryBodySendNotificationPanel rbsnp = new RegulatoryBodySendNotificationPanel(business, pa, selectedProduct, supplier, CardSequencePanel);
        CardSequencePanel.add("RegulatoryBodyNotification", rbsnp);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    } catch (Exception e) {
        // Log the exception or handle it as you deem appropriate
        // For now, we are just printing the stack trace to the console
        e.printStackTrace();
    }
    
    }//GEN-LAST:event_btnReportFindingsActionPerformed


// Method to refresh the table with criteria
private void refreshTableWithCriteria(String attribute, int threshold) {
    DefaultTableModel model = (DefaultTableModel) SupplierCatalogTable.getModel();
    model.setRowCount(0);

    Supplier selectedSupplier = business.getSupplierDirectory().findSupplier((String) comboBoxSupplier.getSelectedItem());
    if (selectedSupplier == null) {
        return; // Exit if no supplier is found
    }

    // Loop through each product in the selected supplier's catalog
    for (Product product : selectedSupplier.getProductCatalog().getProductList()) {
        // Get the value of the nutritional content based on the attribute
        double value = getNutritionalValue(product, attribute);

        // If the product's nutritional value is greater than the threshold, add it to the table
        if (value > threshold) {
            model.addRow(new Object[]{
                product.getName(),
                product.getSugarPercentage(),
                product.getTransfatPercentage(),
                product.getSodiumPercentage(),
                product.getCholesterolPercentage()
            });
        }
    }
}

// Helper method to get nutritional content value from product based on attribute
private double getNutritionalValue(Product product, String attribute) {
    switch (attribute) {
        case "sugarPercentage":
            return product.getSugarPercentage();
        case "transfatPercentage":
            return product.getTransfatPercentage();
        case "sodiumPercentage":
            return product.getSodiumPercentage();
        case "cholesterolPercentage":
            return product.getCholesterolPercentage();
        default:
            return 0;
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTable SupplierCatalogTable;
    private javax.swing.JButton btnReportFindings;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> comboBoxSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> perAttributes;
    private javax.swing.JComboBox<String> perDropDown;
    // End of variables declaration//GEN-END:variables
}
