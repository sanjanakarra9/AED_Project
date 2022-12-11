/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Sonur
 */
public class ApntQueue {
    
    private ArrayList<ApntRequest> appointmentRequestList;
    
    public ApntQueue(){
        this.appointmentRequestList = new ArrayList();
        
    }

    public ArrayList<ApntRequest> getAppointmentRequestList() {
        return appointmentRequestList;
    }

    public void setAppointmentRequestList(ArrayList<ApntRequest> appointmentRequestList) {
        this.appointmentRequestList = appointmentRequestList;
    }
    
}
