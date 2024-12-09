/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uil.Main.WorkSpaceProfiles;

import javax.swing.JOptionPane;
import model.UserAccountManagement.UserAccount;
import javax.swing.JPanel;
import static utility.Email.SmtpEmail.sendEmailMessage;

/**
 *
 * @author divyansjemni
 */
public class AdminUserAccount extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliersJPanel
     */
    JPanel CardSequencePanel;

    UserAccount selecteduseraccount;
    

    public AdminUserAccount(UserAccount sua, JPanel jp) {

        CardSequencePanel = jp;
        selecteduseraccount = sua;
         
        initComponents();
        prefill();
        //display user details here

    }

    public void prefill() {
        
        txtName.setText(selecteduseraccount.getProfile().getPerson().getName());
        txtRole.setText(selecteduseraccount.getRole());
        dropEnabled.setSelectedIndex(selecteduseraccount.getIsEnabled() == true ? 0 : 1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblEnable = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtRole = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        dropEnabled = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnUpdate.setBackground(new java.awt.Color(0, 204, 255));
        btnUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(450, 310, 100, 24);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Administer User Account");
        add(jLabel2);
        jLabel2.setBounds(11, 20, 890, 23);

        btnBack.setBackground(new java.awt.Color(0, 204, 255));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(320, 310, 100, 24);

        lblEnable.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblEnable.setForeground(new java.awt.Color(0, 204, 255));
        lblEnable.setText("Enabled");
        add(lblEnable);
        lblEnable.setBounds(230, 230, 70, 20);

        lblRole.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblRole.setForeground(new java.awt.Color(0, 204, 255));
        lblRole.setText("Role");
        add(lblRole);
        lblRole.setBounds(250, 200, 37, 18);

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 204, 255));
        lblName.setText("Full Name");
        add(lblName);
        lblName.setBounds(220, 170, 70, 18);

        txtRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoleActionPerformed(evt);
            }
        });
        add(txtRole);
        txtRole.setBounds(310, 200, 310, 20);
        add(txtName);
        txtName.setBounds(310, 170, 310, 20);

        dropEnabled.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "True", "False" }));
        add(dropEnabled);
        dropEnabled.setBounds(310, 230, 310, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    boolean isEnabled = dropEnabled.getSelectedItem().toString().equalsIgnoreCase("true");
    selecteduseraccount.setIsEnabled(isEnabled);
    
    String statusMessage = "User account is " + (isEnabled ? "Enabled" : "Disabled");
    JOptionPane.showMessageDialog(this, statusMessage);
    
    // Prepare email content
    String emailSubject = "Account Status Update";
    String emailBody = "Hi<br>"
            + "<p>Your account status has been updated as below:</p>"
            + "<p>Status: " + (isEnabled ? "<b>Enabled</b>" : "<b>Disabled</b>") + "</p>"
            + "<p>If you have any questions, please contact support.</p>"
            + "<p>Team,<br>Price Navigator </p>";
    
    // Send email notification to the user
    sendEmailMessage(selecteduseraccount.getProfile().getPerson().getEmail(), emailSubject, emailBody);

    CardSequencePanel.remove(this);
    ((java.awt.CardLayout) CardSequencePanel.getLayout()).previous(CardSequencePanel);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);


    }//GEN-LAST:event_btnBackActionPerformed

    private void txtRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> dropEnabled;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEnable;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRole;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRole;
    // End of variables declaration//GEN-END:variables

}