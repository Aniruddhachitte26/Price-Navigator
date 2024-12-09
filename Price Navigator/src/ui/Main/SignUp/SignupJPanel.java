/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Main.SignUp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Business.Business;
import model.Personnel.Person;
import model.Personnel.Profile;
import model.ProductManagement.Product;
import model.DistributorManagement.DistributorPersonProfile;
import model.Supplier.Supplier;
import model.UserAccountManagement.UserAccountDirectory;
import static utility.Email.SmtpEmail.sendEmailMessage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;

/**
 *
 * @author Aniruddha
 */
public class SignupJPanel extends javax.swing.JPanel {

  
    
    JPanel CardSequencePanel;
    Business business;
    Supplier selectedsupplier;
    Product selectedproduct;
    DistributorPersonProfile salesperson;
    Person person;
    /**
     * Creates new form SignupJPanel
     */
    public SignupJPanel(Business b, JPanel clp) {
        business = b;
        this.CardSequencePanel = clp;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        btnSignup = new javax.swing.JButton();
        dropUserType = new javax.swing.JComboBox<>();
        lblUserType = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtgender = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPassword1 = new javax.swing.JLabel();
        txtconfPassword = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        Back = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(null);

        lblHeading.setBackground(new java.awt.Color(0, 204, 255));
        lblHeading.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(0, 204, 255));
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("REGISTRATION PAGE");
        add(lblHeading);
        lblHeading.setBounds(0, 10, 630, 30);

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 204, 255));
        lblName.setText("NAME:");
        add(lblName);
        lblName.setBounds(170, 160, 70, 18);

        lblAge.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblAge.setForeground(new java.awt.Color(0, 204, 255));
        lblAge.setText("AGE:");
        add(lblAge);
        lblAge.setBounds(180, 190, 70, 18);

        lblEmail.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 204, 255));
        lblEmail.setText("EMAIL:");
        add(lblEmail);
        lblEmail.setBounds(170, 230, 70, 20);

        lblUserName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 204, 255));
        lblUserName.setText("USERNAME:");
        add(lblUserName);
        lblUserName.setBounds(140, 60, 80, 20);

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 204, 255));
        lblPassword.setText("CONFIRM PASSWORD:");
        add(lblPassword);
        lblPassword.setBounds(70, 120, 150, 18);
        add(txtName);
        txtName.setBounds(250, 160, 170, 20);
        add(txtAge);
        txtAge.setBounds(250, 190, 170, 20);
        add(txtEmail);
        txtEmail.setBounds(250, 230, 170, 20);
        add(txtUsername);
        txtUsername.setBounds(250, 60, 170, 20);

        btnSignup.setBackground(new java.awt.Color(0, 204, 255));
        btnSignup.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("REGISTER");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        add(btnSignup);
        btnSignup.setBounds(220, 410, 130, 30);

        dropUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User","Logistics","Supermarket","RegulatoryBody","Supplier","Distributor"}));
        dropUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropUserTypeActionPerformed(evt);
            }
        });
        add(dropUserType);
        dropUserType.setBounds(250, 350, 170, 22);

        lblUserType.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblUserType.setForeground(new java.awt.Color(0, 204, 255));
        lblUserType.setText("USER TYPE:");
        add(lblUserType);
        lblUserType.setBounds(140, 350, 90, 18);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("GENDER:");
        add(jLabel1);
        jLabel1.setBounds(160, 270, 80, 18);
        add(txtgender);
        txtgender.setBounds(250, 270, 170, 20);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("ADDRESS:");
        add(jLabel2);
        jLabel2.setBounds(150, 310, 80, 20);
        add(txtAddress);
        txtAddress.setBounds(250, 310, 170, 20);

        lblPassword1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblPassword1.setForeground(new java.awt.Color(0, 204, 255));
        lblPassword1.setText("PASSWORD:");
        add(lblPassword1);
        lblPassword1.setBounds(140, 90, 80, 18);

        txtconfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconfPasswordActionPerformed(evt);
            }
        });
        add(txtconfPassword);
        txtconfPassword.setBounds(250, 120, 170, 20);
        add(txtPassword);
        txtPassword.setBounds(250, 90, 170, 20);

        Back.setBackground(new java.awt.Color(0, 204, 255));
        Back.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        add(Back);
        Back.setBounds(40, 420, 72, 26);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
// Validate all input fields are filled
    if (txtName.getText().isEmpty() || txtAge.getText().isEmpty() || txtEmail.getText().isEmpty() || txtUsername.getText().isEmpty() || txtPassword.getPassword().length == 0 || txtconfPassword.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all the fields.");
        return;
    }
    
    // Validate email
    if (!patternMatches(txtEmail.getText())) {
        JOptionPane.showMessageDialog(this, "Please enter a valid email address.");
        return;
    }
    
    // Check if username exists
    UserAccountDirectory uad = business.getUserAccountDirectory();
    if (!uad.isUserNameAvailable(txtUsername.getText())) {
        JOptionPane.showMessageDialog(this, "Username already exists, please choose a different one.");
        return;
    }
    
    // Validate password match
    String password = new String(txtPassword.getPassword());
    if (!password.equals(txtconfPassword.getText())) {
        JOptionPane.showMessageDialog(this, "Passwords do not match.");
        return;
    }
    
    // Validate password strength (example regex, can be modified as needed)
    if (!password.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})")) {
        JOptionPane.showMessageDialog(this, "Password does not meet complexity requirements.");
        return;
    }
    
            Profile profile;
            person = business.getPersonDirectory().newPerson(txtName.getText(),txtName.getText(),txtEmail.getText(), txtAddress.getText(), txtgender.getText(), Integer.parseInt(txtAge.getText()));
            if ("User".equals((dropUserType.getSelectedItem()).toString())) {
                profile = business.getRegularuser().newRegularUserProfile(person);
            } 
            else if ("Logistics".equals((dropUserType.getSelectedItem()).toString())){
                profile = business.getLpd().newLogisticPartnerUserProfile(person);
            }
            else if ("Supermarket".equals((dropUserType.getSelectedItem()).toString())){
                profile = business.getCustomerDirectory().newCustomerProfile(person);
                
            }
            else if ("RegulatoryBody".equals((dropUserType.getSelectedItem()).toString())){
                profile = business.getRbdirectory().newRegularatoryBodyProfile(person);
                
            }
            else if ("Distributor".equals((dropUserType.getSelectedItem()).toString())){
                profile = business.getSalesPersonDirectory().newSalesPersonProfile(person);
                
            }
            else  {
            Supplier newSupplier = business.getSupplierDirectory().newSupplier(person.getPersonId());
            profile = business.getSupplierDirectory().newSupplierProfile(newSupplier, person);
            }
        
            uad.newUserAccount(profile, txtUsername.getText(), txtPassword.getText());
            JOptionPane.showMessageDialog(this, "user created");
            
                        
            String Path = "C:/Users/alshi/Downloads/price_navigator";
            try {
            Path = encodeFileToBase64Binary(Path);
           } catch (IOException e) {
                 // Handle the exception, e.g., log it, display an error message, etc.
                 e.printStackTrace();
                 }
            
        String emailBody = "<html>"
        + "<body>"
        + "<h1>Welcome to MarketHarmonix!</h1>"
        + "<p>Your account has been created successfully.</p>"
        + "<p>We are excited to have you on board.</p>"
        + "<img src='data:image/jpeg;base64," + Path + " ' />" 
        + "<p>Best regards,</p>"
        + "<p>The MarketHarmonix Team</p>"
        + "</body>"
        + "</html>";
            
        sendEmailMessage(txtEmail.getText(), "Welcome to MarketHarmonix Platform - Account Created Successfully!!", emailBody);
        
        
resetFormFields();
    
    }//GEN-LAST:event_btnSignupActionPerformed

    public static boolean patternMatches(String emailAddress) {
        return Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")
                .matcher(emailAddress)
                .matches();
    }

    private void resetFormFields() {
    txtAddress.setText("");
    txtName.setText("");
    txtAge.setText("");
    txtEmail.setText("");
    txtgender.setText("");
    txtUsername.setText("");
    txtPassword.setText("");
    txtconfPassword.setText("");
}
    
public static String encodeFileToBase64Binary(String fileName) throws IOException {
    File file = new File(fileName);
    byte[] fileContent = Files.readAllBytes(file.toPath());
    return Base64.getEncoder().encodeToString(fileContent);
}
    private void dropUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropUserTypeActionPerformed

    private void txtconfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconfPasswordActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.removeAll();
        LogoutJPanel log = new LogoutJPanel(business, CardSequencePanel);
        CardSequencePanel.add("ll", log);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).show(CardSequencePanel, "ll");
        CardSequencePanel.revalidate();
        CardSequencePanel.repaint();

    }//GEN-LAST:event_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton btnSignup;
    private javax.swing.JComboBox<String> dropUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserType;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtconfPassword;
    private javax.swing.JTextField txtgender;
    // End of variables declaration//GEN-END:variables
}
