/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Customer.UserInterface;

import Course.Course;
import Enterprise.FitnessEnterprise;
import UserAccount.UserAcnt;
import WorkQueue.CourseQueue;
import WorkQueue.CourseRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanja
 */
public class CourseViewJPanel extends javax.swing.JPanel {
    
    private JPanel container;
    private UserAcnt account;
    private FitnessEnterprise fitenterprise;

    /**
     * Creates new form CourseView
     */
    public CourseViewJPanel(JPanel container, UserAcnt account, FitnessEnterprise fitenterprise) {
        initComponents();
        this.container = container;
        this.account = account;
        this.fitenterprise = fitenterprise;
         populateRequest();
    }

    public void populateRequest() {
        CourseQueue courseQueue = account.getCourseQueue();
        DefaultTableModel model = (DefaultTableModel) myCourseJTable.getModel();

        model.setRowCount(0);
        for (CourseRequest courseRequest : courseQueue.getCourseRequestList()) {
            Object[] row = new Object[3];
            row[0] = courseRequest;
            row[1] = courseRequest.getReceive();
            row[2] = courseRequest.getStatus();
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

        jPanel1 = new javax.swing.JPanel();
        renewBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myCourseJTable = new javax.swing.JTable();
        reviewBtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        renewBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        renewBtn.setText("Renew Course");
        renewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renewBtnActionPerformed(evt);
            }
        });

        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("My Course History");

        myCourseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course Name", "In charge", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        myCourseJTable.setRowHeight(40);
        myCourseJTable.setRowMargin(4);
        myCourseJTable.setSelectionBackground(new java.awt.Color(215, 145, 54));
        jScrollPane1.setViewportView(myCourseJTable);

        reviewBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        reviewBtn.setText("Review Course");
        reviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(655, 655, 655)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(601, 601, 601)
                        .addComponent(renewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(reviewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(496, 496, 496)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(454, 454, 454))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(renewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reviewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(349, 349, 349))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1450, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 834, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void renewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renewBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = myCourseJTable.getSelectedRow();
        if (selectedRow >= 0) {
            CourseRequest courseRequest = (CourseRequest) myCourseJTable.getValueAt(selectedRow, 0);
            if (!courseRequest.getStatus().equals("Complete")) {
                JOptionPane.showMessageDialog(null, "This status cannot be changed");
            } else {
                courseRequest.setStatus("Renewed");
                for (Course course2 : fitenterprise.getCourseDirectory().getListOfCourses()) {
                    if (courseRequest.getCourse().equals(course2)) {
                        int remainSeats = course2.getVacantSeats();
                        course2.setVacantSeats(remainSeats - 1);
                    }
                }

                JOptionPane.showMessageDialog(null, "Renew Course Successfully!!");
                populateRequest();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        populateRequest();
    }//GEN-LAST:event_renewBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void reviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = myCourseJTable.getSelectedRow();

        if (selectedRow >= 0) {
            CourseRequest courseRequest = (CourseRequest) myCourseJTable.getValueAt(selectedRow, 0);
            if (!courseRequest.getStatus().equals("Complete")) {
                JOptionPane.showMessageDialog(null, "This status cannot be changed");
                return;
            }
            Course course =( (CourseRequest) myCourseJTable.getValueAt(selectedRow, 0)).getCourse();
            ReviewCourseJPanel reviewCourseJPanel = new ReviewCourseJPanel(container, account, course, fitenterprise);
            container.add("reviewCourseJPanel", reviewCourseJPanel);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }

    }//GEN-LAST:event_reviewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable myCourseJTable;
    private javax.swing.JButton renewBtn;
    private javax.swing.JButton reviewBtn;
    // End of variables declaration//GEN-END:variables
}
