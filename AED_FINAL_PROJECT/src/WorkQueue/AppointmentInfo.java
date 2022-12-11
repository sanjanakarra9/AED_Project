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
public class AppointmentInfo {
    
    private ArrayList<AppointmentRequest> appointmentRequestList;
    
    public AppointmentInfo(){
        this.appointmentRequestList = new ArrayList();
        
    }

    public ArrayList<AppointmentRequest> getAppointmentRequestList() {
        return appointmentRequestList;
    }

    public void setAppointmentRequestList(ArrayList<AppointmentRequest> appointmentRequestList) {
        this.appointmentRequestList = appointmentRequestList;
    }
    
}
