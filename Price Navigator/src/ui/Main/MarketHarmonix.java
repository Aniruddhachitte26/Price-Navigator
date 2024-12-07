/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Main;
import javax.swing.JOptionPane;
import model.Business.Business;
import model.Personnel.Profile;
import model.DistributorManagement.DistributorPersonProfile;
import model.Personnel.EmployeeProfile;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;
import uil.Main.WorkSpaceProfiles.DistributorPersonWorkAreaJPanel;
import uil.Main.WorkSpaceProfiles.AdminPersonWorkAreaJpanel;
import javax.swing.JPanel;
import model.SuperMarketManagement.SuperMarketProfile;
import model.LogisticPartner.LogisticPartnerProfile;
import model.RegularUser.RegularUserProfile;
import model.RegulatoryBody.RegulatoryBodyProfile;
import model.Supplier.SupplierProfile;
import ui.Main.SignUp.SignupJPanel;
import ui.Main.SignUp.LogoutJPanel;
import uil.Main.WorkSpaceProfiles.LogisticPartnerWorkArea;
import uil.Main.WorkSpaceProfiles.RegulatoryBodyWorkArea;
import uil.Main.WorkSpaceProfiles.SuperMarketWorkAreaJPanel;
import uil.Main.WorkSpaceProfiles.SupplierPersonWorkAreaJPanel;
import uil.Main.WorkSpaceProfiles.UserLoginWorkArea;

/**
 *
 * @author Aniruddha
 */
public class MarketHarmonix extends javax.swing.JFrame {

    Business business;

    public MarketHarmonix() {
        initComponents();
        business = ConfigureABusiness.initialize();

    }

    public void insert(JPanel jpanel) {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitHomeArea = new javax.swing.JSplitPane();
        actionsidejpanel = new javax.swing.JPanel();
        btnlogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        UserNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnsingup = new javax.swing.JButton();
        txtlogout = new javax.swing.JButton();
        PasswordTextField = new javax.swing.JPasswordField();
        btnContactTeam = new javax.swing.JButton();
        CardSequencePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        actionsidejpanel.setBackground(new java.awt.Color(255, 255, 255));
        actionsidejpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlogin.setBackground(new java.awt.Color(0, 204, 255));
        btnlogin.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("LOGIN");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        actionsidejpanel.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, 30));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("UserName");
        actionsidejpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        UserNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTextFieldActionPerformed(evt);
            }
        });
        actionsidejpanel.add(UserNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 130, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("Password");
        actionsidejpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        btnsingup.setBackground(new java.awt.Color(0, 204, 255));
        btnsingup.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnsingup.setForeground(new java.awt.Color(255, 255, 255));
        btnsingup.setText("REGISTER");
        btnsingup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsingupLoginButtonActionPerformed(evt);
            }
        });
        actionsidejpanel.add(btnsingup, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, 30));

        txtlogout.setBackground(new java.awt.Color(0, 204, 255));
        txtlogout.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txtlogout.setForeground(new java.awt.Color(255, 255, 255));
        txtlogout.setText("LOGOUT");
        txtlogout.setEnabled(false);
        txtlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlogoutActionPerformed(evt);
            }
        });
        actionsidejpanel.add(txtlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 110, 20));
        actionsidejpanel.add(PasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 130, -1));

        btnContactTeam.setBackground(new java.awt.Color(0, 204, 255));
        btnContactTeam.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnContactTeam.setForeground(new java.awt.Color(255, 255, 255));
        btnContactTeam.setText("HELP");
        btnContactTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactTeamActionPerformed(evt);
            }
        });
        actionsidejpanel.add(btnContactTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 660, 120, -1));

        SplitHomeArea.setLeftComponent(actionsidejpanel);

        CardSequencePanel.setBackground(new java.awt.Color(255, 204, 204));
        CardSequencePanel.setLayout(new java.awt.CardLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Market Harmonix");
        CardSequencePanel.add(jLabel3, "card2");

        SplitHomeArea.setRightComponent(CardSequencePanel);

        getContentPane().add(SplitHomeArea, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        //      WorkAreaJPanel ura = new WorkAreaJPanel(workareajpanl);
        
    String un = UserNameTextField.getText();
    String pw = PasswordTextField.getText();

    UserAccountDirectory uad = business.getUserAccountDirectory();
    UserAccount useraccount = uad.AuthenticateUser(un, pw);
    if (useraccount == null) {
        JOptionPane.showMessageDialog(null, "Invalid credentials. Please try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!useraccount.getIsEnabled()) {
        JOptionPane.showMessageDialog(null, "This account has been disabled. Please contact admin.", "Access Denied", JOptionPane.ERROR_MESSAGE);
        return;
    }

    btnlogin.setEnabled(false); // Disable login button
    txtlogout.setEnabled(true); // Enable logout button
    btnsingup.setEnabled(false);

    Profile profile = useraccount.getAssociatedPersonProfile();

    CardSequencePanel.removeAll();
    JPanel panelToAdd = null;
    
    if (profile instanceof DistributorPersonProfile) {
        panelToAdd = new DistributorPersonWorkAreaJPanel(business, (DistributorPersonProfile) profile, CardSequencePanel);
        CardSequencePanel.add("Sales", panelToAdd);
    }
    else if (profile instanceof EmployeeProfile) {
        panelToAdd = new AdminPersonWorkAreaJpanel(business, (EmployeeProfile) profile, CardSequencePanel);
        CardSequencePanel.add("admin", panelToAdd);
    }
    else if (profile instanceof SupplierProfile) {
        panelToAdd = new SupplierPersonWorkAreaJPanel(business, (SupplierProfile) profile, CardSequencePanel);
        CardSequencePanel.add("Supplier", panelToAdd);
    }
    else if (profile instanceof SuperMarketProfile) {
        panelToAdd = new SuperMarketWorkAreaJPanel(business, (SuperMarketProfile) profile, CardSequencePanel);
        CardSequencePanel.add("supermarket", panelToAdd);
    }
    else if (profile instanceof RegularUserProfile) {
        panelToAdd = new UserLoginWorkArea(business, (RegularUserProfile) profile, CardSequencePanel);
        CardSequencePanel.add("regularuserprofile", panelToAdd);
    }
    else if (profile instanceof RegulatoryBodyProfile) {
        panelToAdd = new RegulatoryBodyWorkArea(business,(RegulatoryBodyProfile) profile, CardSequencePanel);
        CardSequencePanel.add("regulatorybody", panelToAdd);
    }
    else if (profile instanceof LogisticPartnerProfile) {
        panelToAdd = new LogisticPartnerWorkArea(business,(LogisticPartnerProfile) profile,CardSequencePanel);
        CardSequencePanel.add("lpp", panelToAdd);
    }

    if (panelToAdd != null) {
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    } else {
        JOptionPane.showMessageDialog(null, "User profile not found.", "Error", JOptionPane.ERROR_MESSAGE);
    }

        UserNameTextField.setText("");
        PasswordTextField.setText("");
        UserNameTextField.setEnabled(false); // Disable username text field
        PasswordTextField.setEnabled(false);
        
        
        

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void UserNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTextFieldActionPerformed

    private void btnsingupLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsingupLoginButtonActionPerformed
        // TODO add your handling code here:
        SignupJPanel signupJPanel = new SignupJPanel(business, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("SignUp", signupJPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnsingupLoginButtonActionPerformed

    private void txtlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlogoutActionPerformed
        // TODO add your handling code here:
    btnlogin.setEnabled(true); // Enable login button
    txtlogout.setEnabled(false); // Disable logout button
    UserNameTextField.setEnabled(true); // Disable username text field
    PasswordTextField.setEnabled(true);
    btnsingup.setEnabled(true);
    CardSequencePanel.removeAll();
    LogoutJPanel log = new LogoutJPanel(business, CardSequencePanel);
    CardSequencePanel.add("loginLabel", log);
    ((java.awt.CardLayout) CardSequencePanel.getLayout()).show(CardSequencePanel, "loginLabel");

    // Revalidate and repaint the panel to ensure UI updates are displayed immediately
    CardSequencePanel.revalidate();
    CardSequencePanel.repaint();
    }//GEN-LAST:event_txtlogoutActionPerformed

    private void btnContactTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactTeamActionPerformed
        // TODO add your handling code here:
        
        ContactTeamPanel ctp = new ContactTeamPanel(business, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("ContactTeam", ctp);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnContactTeamActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MarketHarmonix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarketHarmonix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarketHarmonix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarketHarmonix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarketHarmonix().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardSequencePanel;
    private javax.swing.JPasswordField PasswordTextField;
    private javax.swing.JSplitPane SplitHomeArea;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JPanel actionsidejpanel;
    private javax.swing.JButton btnContactTeam;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsingup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton txtlogout;
    // End of variables declaration//GEN-END:variables
}
