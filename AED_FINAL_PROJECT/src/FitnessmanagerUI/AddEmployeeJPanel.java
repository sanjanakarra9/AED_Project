/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FitnessmanagerUI;

import Course.Course;
import Employee.Employee;
import Enterprise.FitnessEnterprise;
import Network.Network;
import Organization.Organization;
import Person.Person;
import Role.AnalysisAdminRole;
import Role.GymTrainerRole;
import UserAccount.UserAcnt;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sonur
 */
public class AddEmployeeJPanel extends javax.swing.JPanel {

    private JPanel container;
    private FitnessEnterprise fitenterprise;
    private Network network;
    

    /**
     * Creates new form AddEmployeeJPanel
     */
    public AddEmployeeJPanel(JPanel container, FitnessEnterprise fitenterprise, Network network) {
        initComponents();
        this.container = container;
        this.fitenterprise = fitenterprise;
        this.network = network;
//        idTxt.setText(String.valueOf());  //有问题
        idTxt.setEditable(true);
        populatecombobox();
    }

    public void populatecombobox() {
        courseCbx.removeAll();
        for (Course courselist : fitenterprise.getCourseDirectory().getListOfCourses()) {
            courseCbx.addItem(String.valueOf(courselist));
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

        jLabel8 = new javax.swing.JLabel();
        PassField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        backTxt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        courseCbx = new javax.swing.JComboBox<>();
        accountTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JobTitleCbo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        idTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        phoneNumberTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        CPassField = new javax.swing.JPasswordField();

        jLabel8.setText("jLabel8");

        setBackground(new java.awt.Color(255, 255, 255));

        PassField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("Please add the employee");

        nameTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        backTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/返回.png"))); // NOI18N
        backTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backTxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Course");

        courseCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " " }));
        courseCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseCbxActionPerformed(evt);
            }
        });

        accountTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13), new java.awt.Color(102, 102, 102))); // NOI18N
        accountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountTxtActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Job Title");

        JobTitleCbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Analyst", "Trainer" }));
        JobTitleCbo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JobTitleCboItemStateChanged(evt);
            }
        });
        JobTitleCbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobTitleCboActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
            }
        });

        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID:");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phone Number:");

        phoneNumberTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTxtActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email:");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Address:");

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addGap(19, 19, 19)))
                .addGap(505, 505, 505))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(106, 106, 106)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(336, 336, 336))
        );

        CPassField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirm Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(courseCbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(accountTxt)
                                    .addComponent(JobTitleCbo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3)
                                    .addComponent(nameTxt)
                                    .addComponent(PassField)
                                    .addComponent(CPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(backTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(189, 189, 189)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JobTitleCbo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void backTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backTxtActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        EmployeeViewJPanel employeeViewJPanel = (EmployeeViewJPanel) component;
        employeeViewJPanel.populateEmployee();
        layout.previous(container);
    }//GEN-LAST:event_backTxtActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        // Book book = new Book(nameTxt.getText());

        //,Integer.parseInt(storageTxt.getText()
        if (nameTxt.getText().equals("")) {
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

        if (phoneNumberTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Phone number can't be empty!");
            return;
        }
        if (emailTxt.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Email can't be empty!");
            return;
        }
        if (!checkEmailPattern()) {
            JOptionPane.showMessageDialog(null, "Email must follow the format");
            return;
        }
        if (!passwordPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Password must follow the format");
            return;
        }
        if (!PassField.getText().equals(CPassField.getText())) {
            JOptionPane.showMessageDialog(null, "The password does not match");
            return;
        }
        if (!phonePattern()) {
            JOptionPane.showMessageDialog(null, "Please follow the phone number format");
            return;
        }
        if (nameTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "please add all the mandatory fields");
        } else {
            try {

                Integer d = Integer.parseInt(idTxt.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Only Integer allowed as ID");
                return;
            }
            
            
            Employee employee = new Employee(nameTxt.getText(), phoneNumberTxt.getText(),
                    emailTxt.getText(), addressTxt.getText(), String.valueOf(courseCbx.getSelectedItem()), Integer.parseInt(idTxt.getText()), accountTxt.getText(), PassField.getText(), String.valueOf(JobTitleCbo.getSelectedItem()));
            //this.network = (Network) NetworkCMB.getSelectedItem();
            
            /*
              Organization anaOrganization = fitEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Analysis);
        Person fitnessclubAnalyst1 = fitOrganization.getPersonDirectory().createPerson("Xianling Zhao");
        UserAccount ua66 = fitOrganization.getUserAccountDirectory().createUserAccount("analysis", "analysis", fitnessclubAnalyst1, new AnalysisRole());
            */
            Organization fitorganization = fitenterprise.getOrganizationDirectory().createOrganization(Organization.Type.Analysis);
           Person analyst1=fitorganization.getPersonDirectory().createPerson("Analystsonu");
            
            fitenterprise.getEmployeeDirectory().getEmployeeList().add(employee);
           
            if(JobTitleCbo.getSelectedItem().equals("Analyst")){
            UserAcnt ua = fitorganization.getUserAccountDirectory().createUserAccount(accountTxt.getText(), CPassField.getText(),analyst1, new AnalysisAdminRole());
            }
            else{
            UserAcnt ua = fitenterprise.getUserAccountDirectory().createTrainerAcount(accountTxt.getText(), CPassField.getText(), new GymTrainerRole());
            }
            nameTxt.setText("");
            phoneNumberTxt.setText("");
            emailTxt.setText("");
            addressTxt.setText("");
            courseCbx.setSelectedItem("");
            //这个地方，注册完应该重制成什么比较好？
            accountTxt.setText("");
            PassField.setText("");
            CPassField.setText("");
            JobTitleCbo.setSelectedItem("");
            JOptionPane.showMessageDialog(null, "Add successfully");
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private Boolean checkEmailPattern() {
        String validName = "^[A-Z0-9a-z]+\\w*@[A-Z0-9a-z]+(\\.[A-Z0-9a-z]+)*$";
        Pattern p = Pattern.compile(validName);
        Matcher m = p.matcher(emailTxt.getText());
        boolean b = m.matches();

        return b;
    }

    private boolean passwordPatternCorrect() {
        Pattern p = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m = p.matcher(PassField.getText());
        boolean b = m.matches();

        return b;
    }

    private boolean phonePattern() {
        Pattern p = Pattern.compile("^(\\+?1)?[2-9]\\d{2}[2-9](?!11)\\d{6}$");
        //"^(\\+?1)?[2-9]\\d{2}[2-9](?!11)\\d{6}$"
        Matcher m = p.matcher(phoneNumberTxt.getText());
        boolean b = m.matches();
        return b;
    }

    private void courseCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseCbxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_courseCbxActionPerformed

    private void accountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountTxtActionPerformed

    private void JobTitleCboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JobTitleCboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JobTitleCboActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void phoneNumberTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTxtActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTxtActionPerformed

    private void JobTitleCboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JobTitleCboItemStateChanged
        // TODO add your handling code here:
        if (JobTitleCbo.getSelectedItem().toString().equals("Analyst")) {
            courseCbx.setEnabled(false);
            courseCbx.setSelectedItem(" ");
        } else {
            courseCbx.setEnabled(true);
        }
    }//GEN-LAST:event_JobTitleCboItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CPassField;
    private javax.swing.JComboBox<String> JobTitleCbo;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JTextField accountTxt;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton backTxt;
    private javax.swing.JComboBox<String> courseCbx;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField phoneNumberTxt;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
