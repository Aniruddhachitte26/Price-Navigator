
package ui.Main.WorkSpaceProfiles.OrderManagement;


import model.Business.Business;
import model.ProductManagement.Product;
import model.DistributorManagement.DistributorPersonProfile;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.ProductManagement.ProductReport;

/**
 *
 * @author Aniruddha
 */
public class RecommendationJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;
    Product product;
    ProductReport productReport;
    DistributorPersonProfile salesperson;



    public RecommendationJPanel(JPanel clp,Business business, String selectedSupplier, String Customername, String Salespersonname, String productName, int cp, int fp, int tp, int FAT, int FBT, int MAP, int salesRevenue) {


        this.CardSequencePanel = clp;
        initComponents();
        this.business = business;
        
        txtSupplierName.setText(selectedSupplier);
        salesPersonTextField.setText(Salespersonname);
        customerTextField.setText(Customername);
        txtName.setText(productName);
        txtFloorPrice.setText(String.valueOf(fp));
        txtCeilingPrice.setText(String.valueOf(cp));
        txtTargetPrice.setText(String.valueOf(tp));
        productPricePerformanceTextField.setText(String.valueOf(MAP));
        productRevenueTextField.setText(String.valueOf(salesRevenue));
        
        //Populate RecommendationTable
        populateRecommendationTable(productName, fp, tp, cp, FAT, FBT, MAP);
    }
    
private void populateRecommendationTable(String Productname, int floorPrice, int targetPrice, int ceilingPrice, int fat, int fbt, int marginAroundProfit){

     DefaultTableModel model = (DefaultTableModel) RecommendationTable.getModel();
     model.setRowCount(0);
     String productName = Productname;
      double[] improvementPercentages = {0.2, 0.5, 0.7}; // Target improvements
    
    for (double improvementPercentage : improvementPercentages) {
        boolean combinationFound = false;
        
        // Correcting the target margin calculation for negative margins
        int targetMargin = marginAroundProfit < 0 ? (int)(marginAroundProfit * (1 - improvementPercentage)) : (int)(marginAroundProfit * (1 + improvementPercentage));
        
        for (int actualPrice = floorPrice; actualPrice <= ceilingPrice && !combinationFound; actualPrice += 1000) {
            for (int quantity = 1; quantity <= 7 && !combinationFound; quantity++) { // Adjusted quantity range
                int profit = (actualPrice - targetPrice) * quantity;
                int newMargin = marginAroundProfit + profit;
                
                if (marginAroundProfit < 0 ? newMargin > targetMargin : newMargin >= targetMargin) {
                    // Add the first matching combination and break
                    model.addRow(new Object[]{productName, actualPrice, quantity, marginAroundProfit, profit, improvementPercentage * 100, newMargin});
                    combinationFound = true; // Ensure only the first matching combination is added
                }
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

        jLabel10 = new javax.swing.JLabel();
        txtFloorPrice = new javax.swing.JTextField();
        customerTextField = new javax.swing.JTextField();
        txtTargetPrice = new javax.swing.JTextField();
        salesPersonTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RecommendationTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCeilingPrice = new javax.swing.JTextField();
        txtSupplierName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        productPricePerformanceTextField = new javax.swing.JTextField();
        productRevenueTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSubmitTPCR = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(51, 51, 51));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 255));
        jLabel10.setText("CustomerName");

        txtFloorPrice.setEnabled(false);

        customerTextField.setEnabled(false);

        txtTargetPrice.setEnabled(false);

        salesPersonTextField.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 255));
        jLabel11.setText("Sales person");

        RecommendationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "ActualPrice", "Quantity", "PreviousMargin", "Profit", "% Margin Improved", "Current Margin Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RecommendationTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        RecommendationTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RecommendationTableMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RecommendationTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(RecommendationTable);

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Recommendations:");

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 255));
        jLabel12.setText("Product Specifications:");

        txtName.setEnabled(false);

        txtCeilingPrice.setEnabled(false);

        txtSupplierName.setEnabled(false);

        btnBack.setBackground(new java.awt.Color(0, 204, 255));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("Supplier Name");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setText("Min Price");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setText("Strategic Price");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText("Max Price");

        productPricePerformanceTextField.setEnabled(false);
        productPricePerformanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productPricePerformanceTextFieldActionPerformed(evt);
            }
        });

        productRevenueTextField.setEnabled(false);
        productRevenueTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productRevenueTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setText("Sales Revenues so far:");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8.setText("Margin around STR Price you have so far:");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel9.setText("**Don't see any recommendation values to improve your Margin?? ");

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel13.setText("No Problem!! Request Supplier for adjustinng the STR price for the product?");

        btnSubmitTPCR.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnSubmitTPCR.setText("Submit STR Price Change Request!!");
        btnSubmitTPCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitTPCRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salesPersonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTargetPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtFloorPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCeilingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(productRevenueTextField))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(productPricePerformanceTextField)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9))
                        .addGap(31, 31, 31)
                        .addComponent(btnSubmitTPCR, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addComponent(btnSubmitTPCR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salesPersonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTargetPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFloorPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCeilingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productRevenueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productPricePerformanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack))
                        .addGap(65, 65, 65)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RecommendationTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecommendationTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_RecommendationTableMouseEntered

    private void RecommendationTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecommendationTableMousePressed

    }//GEN-LAST:event_RecommendationTableMousePressed

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

    private void btnSubmitTPCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitTPCRActionPerformed
        // TODO add your handling code here:
        
        String sn = txtSupplierName.getText();
        String pn = txtName.getText();
        String dn = salesPersonTextField.getText();
        int fp = Integer.parseInt(txtFloorPrice.getText());
        int cp = Integer.parseInt(txtCeilingPrice.getText());
        int tp = Integer.parseInt(txtTargetPrice.getText());
        
        STRPriceChangeRequestJPanel tpcrp = new STRPriceChangeRequestJPanel(CardSequencePanel,business, productReport, sn, pn,cp, fp, tp, dn);
        
        CardSequencePanel.add("TargetPriceChangeRequestJPanel", tpcrp);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnSubmitTPCRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RecommendationTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmitTPCR;
    private javax.swing.JTextField customerTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField productPricePerformanceTextField;
    private javax.swing.JTextField productRevenueTextField;
    private javax.swing.JTextField salesPersonTextField;
    private javax.swing.JTextField txtCeilingPrice;
    private javax.swing.JTextField txtFloorPrice;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSupplierName;
    private javax.swing.JTextField txtTargetPrice;
    // End of variables declaration//GEN-END:variables

}
