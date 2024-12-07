/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uil.Main.WorkSpaceProfiles;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.Supplier.SupplierProfile;

/**
 *
 * @author divyansjemni
 */
public class ManageProductsJPanel extends javax.swing.JPanel {
    
    JPanel CardSequencePanel;
    Business business;
    SupplierProfile spp;
 

    /**
     * Creates new form ManageProductsJPanel
     */
    public ManageProductsJPanel(Business b, SupplierProfile sp, JPanel clp) {
        
        CardSequencePanel = clp;
        business = b;
        spp = sp;
       
        initComponents();
        
        refreshTable();
    }
    
        public void refreshTable() {
            
        ProductCatalog pc = spp.getSupplier().getProductCatalog();

// Clear the table before adding new rows to avoid duplicating entries.
        DefaultTableModel model = (DefaultTableModel) SupplierCatalogTable.getModel();
        model.setRowCount(0);

         for (Product pt : pc.getProductList()) {
          Object[] row = new Object[9];
          
          double sugar = pt.getSugarPercentage();
double transfat = pt.getTransfatPercentage();
double sodium = pt.getSodiumPercentage();
double cholesterol = pt.getCholesterolPercentage();
double average = (sugar + transfat + sodium + cholesterol) / 4;
               row[0] = pt;
                row[5] = pt.getSugarPercentage();
                row[6] = pt.getTransfatPercentage();
                row[7] = pt.getSodiumPercentage();
                row[8]=pt.getCholesterolPercentage();
                row[1]=pt.getFloorPrice();
                row[2]=pt.getCeilingPrice();
                row[3]=pt.getTargetPrice();
                row[4] = average;
                

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

        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SupplierCatalogTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

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
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        SupplierCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Min Price", "Max Price", "Strategic Price", "Avg of 4 Fat contents"
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
        if (SupplierCatalogTable.getColumnModel().getColumnCount() > 0) {
            SupplierCatalogTable.getColumnModel().getColumn(0).setResizable(false);
            SupplierCatalogTable.getColumnModel().getColumn(1).setResizable(false);
            SupplierCatalogTable.getColumnModel().getColumn(2).setResizable(false);
            SupplierCatalogTable.getColumnModel().getColumn(3).setResizable(false);
            SupplierCatalogTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(340, 340, 340)
                                .addComponent(btnRefresh)
                                .addGap(33, 33, 33)
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnRefresh))
                .addGap(34, 34, 34)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
 int selectedRowIndex = SupplierCatalogTable.getSelectedRow();
    if (selectedRowIndex < 0) {
        JOptionPane.showMessageDialog(null, "Please select a product to delete.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Retrieve the Product object directly from the table
    Product productToDelete = (Product) SupplierCatalogTable.getValueAt(selectedRowIndex, 0);

    if (productToDelete != null) {
        // Attempt to remove the product
        spp.getSupplier().getProductCatalog().removeProduct(productToDelete);
        refreshTable();
        JOptionPane.showMessageDialog(null, "Product successfully deleted.", "Deletion Complete", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Product not found.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
     int selectedRowIndex = SupplierCatalogTable.getSelectedRow();
    if (selectedRowIndex < 0) {
        JOptionPane.showMessageDialog(this, "Please select a product to update.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Get the Product object from the selected row. Assume the Product object is stored in the first column.
    Product selectedProduct = (Product) SupplierCatalogTable.getValueAt(selectedRowIndex, 0);
    if (selectedProduct == null) {
        JOptionPane.showMessageDialog(this, "Product not found, please select a valid product to proceed!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Navigate to the update panel
    try {
        SupplierProductUpdateJPanel spuj = new SupplierProductUpdateJPanel(business, spp, selectedProduct, CardSequencePanel);
        // Assuming "SupplierProductUpdateJPanel" is the identifier key used when the panel was added to the card layout.
        CardSequencePanel.add(spuj, "SupplierProductUpdateJPanel");
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).show(CardSequencePanel, "SupplierProductUpdateJPanel");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Failed to initialize update panel. See console for details.", "Initialization Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        refreshTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void SupplierCatalogTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierCatalogTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierCatalogTableMouseEntered

    private void SupplierCatalogTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierCatalogTableMousePressed
        // TODO add your handling code here:
      /*  int suppliertablesize = SupplierCatalogTable.getRowCount();
        int selectedrow = SupplierCatalogTable.getSelectionModel().getLeadSelectionIndex();

        if (selectedrow < 0 || selectedrow > suppliertablesize - 1) {
            return;
        }
        Product selectedproduct = (Product) SupplierCatalogTable.getValueAt(selectedrow, 0);
        if (selectedproduct == null) {
            return ;*
        }

        //   ProductSummary productsummary = new ProductSummary(selectedproduct);
        /*
        productNameTextField.setText(selectedproduct.toString());
        String revenues = String.valueOf(productsummary.getSalesRevenues());
        productRevenueTextField.setText(revenues);
        productFrequencyAboveTargetTextField.setText(String.valueOf(productsummary.getNumberAboveTarget()));
        productFrequencyBelowTargetTextField.setText(String.valueOf(productsummary.getNumberBelowTarget()));
        productPricePerformanceTextField.setText(String.valueOf(productsummary.getProductPricePerformance()));
        */
    }//GEN-LAST:event_SupplierCatalogTableMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SupplierCatalogTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}