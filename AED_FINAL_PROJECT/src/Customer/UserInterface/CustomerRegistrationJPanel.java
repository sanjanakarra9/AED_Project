/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Customer.UserInterface;

import Customer.Customer;
import Enterprise.Enterprise;
import Model.EcoSystem;
import Network.Network;
import Organization.Organization;
import Role.CustomerRole;
import UI.MainLogin;
import UserAccount.UserAcnt;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sanja
 */
public class CustomerRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerRegistration
     */
       private JPanel crpJPanel;
    private String username;
    private String password;
    private EcoSystem system;
    private Network network;
    private MainLogin frame;
    public CustomerRegistrationJPanel(EcoSystem system, JPanel crpJPanel, MainLogin frame) {
        initComponents();
        this.system = system;
        this.crpJPanel = crpJPanel;
        this.frame = frame;
        NetworkCMB.removeAllItems();
        for (Network network : system.getNetworkList()) {
            NetworkCMB.addItem(network);
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

        jPanel1 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        lastNameTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        PassField = new javax.swing.JPasswordField();
        CPassField = new javax.swing.JPasswordField();
        NetworkCMB = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        submitButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("* is required field");

        firstNameTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        lastNameTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        addressTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        phoneTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Phone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        emailTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel1.setText("Please provide information to complete your registration:");

        userNameTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*User Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });

        PassField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        CPassField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Confirm Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        CPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPassFieldActionPerformed(evt);
            }
        });

        NetworkCMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkCMBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("*Network");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Self-Decipline");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Freedom is from");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("To");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Come");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Join Us");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addGap(531, 531, 531))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel4)
                    .addGap(508, 508, 508)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(492, 492, 492)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PassField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CPassField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NetworkCMB, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel2))))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(addressTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NetworkCMB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(258, 258, 258))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1454, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 839, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (userNameTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "User name can't be empty!");
            return;
        }
        if (PassField.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Password can't be empty!");
            return;
        }
        if (CPassField.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Confirm Password can't be empty!");
            return;
        }

        if (firstNameTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "First name can't be empty!");
            return;
        }
        if (lastNameTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Last name can't be empty!");
            return;
        }
        if (phoneTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Phone number can't be empty!");
            return;
        }
        if (emailTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Email can't be empty!");
            return;
        }
        if(!checkEmailPattern()){
            JOptionPane.showMessageDialog(null, "Email must follow the format");
            return;
        }
        if(!passwordPatternCorrect()){
            JOptionPane.showMessageDialog(null, "Password must follow the format");
            return;
        }
        if(!PassField.getText().equals(CPassField.getText())){
            JOptionPane.showMessageDialog(null, "The password does not match");
            return;
        }
        if(!phonePattern()){
            JOptionPane.showMessageDialog(null, "Please follow the phone number format");
            return;
        }

        username = userNameTxt.getText();
        password = CPassField.getText();

        UserAcnt userAccount = system.getUserAccountDirectory().authenticateUser(username, password);

        if (userAccount == null) {
            for (Network network : system.getNetworkList()) {
                userAccount = network.getUserAccountDirectory().authenticateUser(username, password);
                if (userAccount == null) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        userAccount = enterprise.getUserAccountDirectory().authenticateUser(username, password);
                        if (userAccount == null) {
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                userAccount = organization.getUserAccountDirectory().authenticateUser(username, password);
                                if (userAccount != null) {
                                    JOptionPane.showMessageDialog(null, "Account already exist!");
                                    userNameTxt.setText("");
                                    PassField.setText("");
                                    CPassField.setText("");
                                   
                                    return;
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Account already exist!");
                            userNameTxt.setText("");
                            PassField.setText("");
                            CPassField.setText("");
                            return;

                        }
                        //UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(username, password);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Account already exist!");
                    userNameTxt.setText("");
                    PassField.setText("");
                    CPassField.setText("");
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Account already exist!");
            userNameTxt.setText("");
            PassField.setText("");
            CPassField.setText("");
            return;

        }

        Customer customer = new Customer(firstNameTxt.getText(), lastNameTxt.getText(),
            emailTxt.getText(), phoneTxt.getText());
        this.network = (Network) NetworkCMB.getSelectedItem();
        UserAcnt ua = network.getUserAccountDirectory().createUserAccount(userNameTxt.getText(), CPassField.getText(), customer, new CustomerRole());

        //DB4OUtil.getInstance().storeSystem(system);
        JOptionPane.showMessageDialog(null, "Create Account Successfully");
        userNameTxt.setEnabled(false);
        PassField.setEnabled(false);
        CPassField.setEnabled(false);
        firstNameTxt.setEnabled(false);
        lastNameTxt.setEnabled(false);
        addressTxt.setEnabled(false);
        phoneTxt.setEnabled(false);
        emailTxt.setEnabled(false);
        frame.setActivate();
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        CancelJPanel cp = new CancelJPanel(this.system, this.crpJPanel);
        this.crpJPanel.add("CancelJPanel", cp);
        CardLayout layout = (CardLayout) this.crpJPanel.getLayout();
        crpJPanel.remove(this.crpJPanel);
        layout.next(crpJPanel);
        frame.setActivate();
        
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void CPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPassFieldActionPerformed

    private void NetworkCMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetworkCMBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NetworkCMBActionPerformed

  private Boolean checkEmailPattern(){
        String validName = "^[A-Z0-9a-z]+\\w*@[A-Z0-9a-z]+(\\.[A-Z0-9a-z]+)*$";
        Pattern p = Pattern.compile(validName);
        Matcher m = p.matcher(emailTxt.getText());
        boolean b = m.matches();
        
        return b;
    }

private boolean passwordPatternCorrect(){
        Pattern p = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
//                "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$*#&])[A-Za-z\\d$*#&]{6,}$]"
        Matcher m = p.matcher(PassField.getText());
        boolean b = m.matches();
        
        return b;
    }
private boolean phonePattern(){
        Pattern p = Pattern.compile("^(\\+?1)?[2-9]\\d{2}[2-9](?!11)\\d{6}$");
                //"^(\\+?1)?[2-9]\\d{2}[2-9](?!11)\\d{6}$"
        Matcher m = p.matcher(phoneTxt.getText());
        boolean b = m.matches();
        
        return b;
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CPassField;
    private javax.swing.JComboBox NetworkCMB;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
