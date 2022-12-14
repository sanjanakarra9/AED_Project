/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FitnessTrainerUI;


import ClassAppointment.ClassRoom;
import Enterprise.FitnessEnterprise;
import UserAccount.UserAcnt;
import WorkQueue.ApntRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Sonur
 */
public class ViewRequestJPanel extends javax.swing.JPanel {

    private JPanel container;
    private UserAcnt account;
    private FitnessEnterprise fitenterprise;
    /**
     * Creates new form ReverseRequestJPanel
     */
    public ViewRequestJPanel(JPanel container, UserAcnt account, FitnessEnterprise fitenterprise) {
        initComponents();
        this.container = container;
        this.account = account;
        this.fitenterprise = fitenterprise;
        populateRequest();
        populateComboBox();
    }
    public void populateRequest() {
       DefaultTableModel model = (DefaultTableModel) requestJTable.getModel();
        
        model.setRowCount(0);
        for(ApntRequest appRequest : fitenterprise.getQueueofAppointments().getAppointmentRequestList()){
            if(appRequest.getReceive() == null || appRequest.getReceive() == account){
               Object[] row = new Object[4];
                row[0] = appRequest;
                row[1] = appRequest.getSend();
                row[2] = appRequest.getAppointment().getClassRoom();
                row[3] = appRequest.getStatus();
                model.addRow(row); 
            }
        }
    }
     public void populateComboBox(){
        cboClassRoom.removeAll();
        for(ClassRoom classRoom : fitenterprise.getClassRoomDirectory().getClassRoomList()){
            cboClassRoom.addItem(classRoom);
        }
    }
    public boolean checkRoom(ApntRequest request, ClassRoom classRoom){
        boolean avilable = false;
        for(ApntRequest appointmentRequest : fitenterprise.getQueueofAppointments().getAppointmentRequestList())
            if(appointmentRequest.getStatus().equals("Accept") && appointmentRequest.getAppointment().getClassRoom() == classRoom && request.getAppointment().getDate().equals(appointmentRequest.getAppointment().getDate()) && request.getAppointment().getSession().equals(appointmentRequest.getAppointment().getSession()))
                avilable = true;
        return avilable;
    }
    
    public boolean checkSchedule(ApntRequest request){
        boolean avilable = false;
        for(ApntRequest appointmentRequest : account.getApntQueue().getAppointmentRequestList())
            if(appointmentRequest.getStatus().equals("Accept") && request.getAppointment().getDate().equals(appointmentRequest.getAppointment().getDate()) && request.getAppointment().getSession().equals(appointmentRequest.getAppointment().getSession()))
                avilable = true;
        return avilable;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        requestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        acceptBtn = new javax.swing.JButton();
        declineBtn = new javax.swing.JButton();
        cboClassRoom = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(43, 45, 66));
        setForeground(new java.awt.Color(255, 255, 255));

        requestJTable.setBackground(new java.awt.Color(242, 233, 228));
        requestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Request Student", "Room", "Requested Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requestJTable.setRowHeight(40);
        requestJTable.setRowMargin(4);
        requestJTable.setSelectionBackground(new java.awt.Color(215, 145, 54));
        jScrollPane1.setViewportView(requestJTable);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please check the request message:");

        acceptBtn.setBackground(new java.awt.Color(202, 97, 71));
        acceptBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        acceptBtn.setText("Accept");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        declineBtn.setBackground(new java.awt.Color(202, 97, 71));
        declineBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        declineBtn.setText("Decline");
        declineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Please select the fit room for the appointment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cboClassRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(declineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(333, 333, 333))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboClassRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(declineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(325, 325, 325))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestJTable.getSelectedRow();
        if(selectedRow >= 0){
            ApntRequest appRequest = (ApntRequest)requestJTable.getValueAt(selectedRow, 0);
            if(!appRequest.getStatus().equals("Pending")){
                JOptionPane.showMessageDialog(null, "You cannot change it.");
            }
            else{
                ClassRoom classRoom = (ClassRoom) cboClassRoom.getSelectedItem();
                if(!checkRoom(appRequest, classRoom)){
                    if(!checkSchedule(appRequest)){
                        appRequest.setStatus("Accept");
                         JOptionPane.showMessageDialog(null, "Accept Successful");
                        appRequest.getAppointment().setClassRoom(classRoom);
                        appRequest.setReceive(account);
                        populateRequest();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "You have schedule at that time");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "This room has been taken");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void declineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestJTable.getSelectedRow();
        if(selectedRow >= 0){
            ApntRequest appointmentRequest = (ApntRequest)requestJTable.getValueAt(selectedRow, 0);
            if(!appointmentRequest.getStatus().equals("Pending")){
                JOptionPane.showMessageDialog(null, "You cannot change it.");
            }
            else{
                appointmentRequest.setStatus("Decline");
                JOptionPane.showMessageDialog(null, "Decline Successfully");
                appointmentRequest.setReceive(account);
                populateRequest();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_declineBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JComboBox cboClassRoom;
    private javax.swing.JButton declineBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestJTable;
    // End of variables declaration//GEN-END:variables

    
}
