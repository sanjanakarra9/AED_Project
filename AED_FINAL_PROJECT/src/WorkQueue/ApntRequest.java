/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

/**
 *
 * @author Sonur
 */
public class ApntRequest  extends workRequest{
     private Appointment appointment;
    
   
    
    public ApntRequest(Appointments appointment){
        this.appointment = appointment;
        
    }
    
    public String toString(){
        return this.appointment.toString();
    }

    public Appointments getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointments appointment) {
        this.appointment = appointment;
    }
}
