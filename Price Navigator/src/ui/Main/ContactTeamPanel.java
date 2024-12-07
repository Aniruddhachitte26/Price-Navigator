/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Main;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Business.Business;
import model.DistributorManagement.DistributorPersonProfile;
import model.Personnel.Person;
import model.ProductManagement.Product;
import model.Supplier.Supplier;
import ui.Main.SignUp.LogoutJPanel;
import static utility.Email.SmtpEmail.sendEmailMessage;

/**
 *
 * @author Aniruddha
 */
public class ContactTeamPanel extends javax.swing.JPanel {
    
    JPanel CardSequencePanel;
    Business business;
    Supplier selectedsupplier;
    Product selectedproduct;
    DistributorPersonProfile salesperson;
    Person person;

    /**
     * Creates new form ContactTeamPanel
     */
    public ContactTeamPanel(Business b, JPanel clp) {
        
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

        jLabel1 = new javax.swing.JLabel();
        txtSubject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuery = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnSubmitQuery = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Subject : ");

        txtQuery.setColumns(20);
        txtQuery.setRows(5);
        jScrollPane1.setViewportView(txtQuery);

        jLabel2.setText("  Query :");

        btnSubmitQuery.setBackground(new java.awt.Color(0, 204, 255));
        btnSubmitQuery.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnSubmitQuery.setText("Submit Query");
        btnSubmitQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitQueryActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("CONTACT FORM");

        Back.setBackground(new java.awt.Color(0, 204, 255));
        Back.setText(" Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 253, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(txtSubject)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(btnSubmitQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(btnSubmitQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitQueryActionPerformed
        // TODO add your handling code here:
        
    String subject = txtSubject.getText().trim();
    String query = txtQuery.getText().trim();
     
    convertToHtml(query); // converting to html
    
    
    // Check if subject or query is empty
    if(subject.isEmpty() || query.isEmpty()){
        JOptionPane.showMessageDialog(this, "Please fill in both the subject and the query.");
        return;
    }
    
    sendEmailMessage("manikantapkapalavai@gmail.com", subject, query);
        
    }//GEN-LAST:event_btnSubmitQueryActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.removeAll();
        LogoutJPanel log = new LogoutJPanel(business, CardSequencePanel);
        CardSequencePanel.add("ll", log);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).show(CardSequencePanel, "ll");
        CardSequencePanel.revalidate();
        CardSequencePanel.repaint();
        
    }//GEN-LAST:event_BackActionPerformed
private String convertToHtml(String text) {
    // Escape special HTML characters
    text = text.replace("&", "&amp;")
               .replace("<", "&lt;")
               .replace(">", "&gt;")
               .replace("\"", "&quot;")
               .replace("'", "&#x27;")
               .replace("/", "&#x2F;");

    // Replace newlines with <br> tags
    text = text.replace("\n", "<br>");
    text = text.replace(",", ",<br>");
    text = text.replace(".", ".<br>");

    // Wrap text in <p> tags or any other desired HTML structure
    text = "<html><body><p>" + text + "</p></body></html>";

    return text;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton btnSubmitQuery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtQuery;
    private javax.swing.JTextField txtSubject;
    // End of variables declaration//GEN-END:variables
}
