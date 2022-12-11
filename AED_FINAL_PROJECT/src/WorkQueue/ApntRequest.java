/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

import ClassAppointment.ClassAppointment;

/**
 *
 * @author Sonur
 */
public class ApntRequest  extends workRequest{
     private ClassAppointment appointment;
    
   
    
    public ApntRequest(ClassAppointment appointment){
        this.appointment = appointment;
        
    }
    
    public String toString(){
        return this.appointment.toString();
    }

    public ClassAppointment getAppointment() {
        return appointment;
    }

    public void setAppointment(ClassAppointment appointment) {
        this.appointment = appointment;
    }
}
