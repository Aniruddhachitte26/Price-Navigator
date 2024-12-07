/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uil.Main.WorkSpaceProfiles;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author divyansjemni
 */
public class ManageRegularUserAccountsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliersJPanel
     */
    JPanel CardSequencePanel;
    Business business;
    UserAccount selecteduseraccount;

    public ManageRegularUserAccountsJPanel(Business bz, JPanel jp) {
        CardSequencePanel = jp;
        this.business = bz;
        initComponents();
        refreshTable();

    }

    public void refreshTable() {

//clear supplier table
 int rc = UserAccountTable.getRowCount();
    for (int i = rc - 1; i >= 0; i--) {
        ((DefaultTableModel) UserAccountTable.getModel()).removeRow(i);
    }

    UserAccountDirectory uad = business.getUserAccountDirectory();

    for (UserAccount ua : uad.getUserAccountList()) {
        // Check if the role of the user account is "Supplier"
        if (ua.getRole().equalsIgnoreCase("regularUser")) {
            Object[] row = new Object[6];
            row[0] = ua;  // Assuming you might want to display the name in the table
             row[1] = ua.getAssociatedPersonProfile().getPerson().getName();
            row[2] = ua.getRole();
            if (ua.getIsEnabled()) {
                row[3] = "Enabled";
            } else {
                row[3] = "Disabled";
            }

            ((DefaultTableModel) UserAccountTable.getModel()).addRow(row);
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

        Back = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserAccountTable = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 204, 255));
        setLayout(null);

        Back.setBackground(new java.awt.Color(0, 204, 255));
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        add(Back);
        Back.setBounds(30, 300, 72, 23);

        Next.setBackground(new java.awt.Color(0, 204, 255));
        Next.setForeground(new java.awt.Color(255, 255, 255));
        Next.setText("NEXT");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        add(Next);
        Next.setBounds(500, 300, 80, 23);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("User Accounts");
        add(jLabel1);
        jLabel1.setBounds(30, 90, 190, 18);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Supplier Accounts");
        add(jLabel2);
        jLabel2.setBounds(11, 20, 630, 30);

        UserAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "Name", "Role", "Status", "Last Updated"
            }
        ));
        UserAccountTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserAccountTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(UserAccountTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 110, 550, 130);

        btnRefresh.setBackground(new java.awt.Color(0, 204, 255));
        btnRefresh.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("REFRESH DATA");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh);
        btnRefresh.setBounds(320, 300, 140, 24);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        //       ((java.awt.CardLayout)CardSequencePanel.getLayout()).show(CardSequencePanel, "IdentifyEventTypes");

    }//GEN-LAST:event_BackActionPerformed

    private void UserAccountTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserAccountTableMousePressed
        // Extracts the row (uaser account) in the table that is selected by the user
        int size = UserAccountTable.getRowCount();
        int selectedrow = UserAccountTable.getSelectionModel().getLeadSelectionIndex();

        if (selectedrow < 0 || selectedrow > size - 1) {
            return;
        }
        selecteduseraccount = (UserAccount) UserAccountTable.getValueAt(selectedrow, 0);
        if (selecteduseraccount == null) {
            return;

    }//GEN-LAST:event_UserAccountTableMousePressed
    }

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
     int selectedRowIndex = UserAccountTable.getSelectedRow();
    if (selectedRowIndex < 0) {
        JOptionPane.showMessageDialog(this, "Please select a record to proceed.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }
        
        if (selecteduseraccount == null) {
            return;
        }
        AdminUserAccount mppd = new AdminUserAccount(selecteduseraccount, CardSequencePanel);
        CardSequencePanel.add(mppd);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_NextActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        refreshTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Next;
    private javax.swing.JTable UserAccountTable;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
