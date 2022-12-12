/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

import ClassAppointment.ClassAppointmentTime;
import ClassAppointment.ClassRoomDirectory;
import WorkQueue.ApntQueue;

/**
 *
 * @author Sonur
 */
public class CourseservicesEnterprise {
    
    private ApntQueue  apntQueue;
    private ClassRoomDirectory classRoomDirectory;
    private ClassAppointmentTime appointmentTime;

    public ApntQueue getApntQueue() {
        return apntQueue;
    }

    public void setApntQueue(ApntQueue apntQueue) {
        this.apntQueue = apntQueue;
    }

    public ClassRoomDirectory getClassRoomDirectory() {
        return classRoomDirectory;
    }

    public void setClassRoomDirectory(ClassRoomDirectory classRoomDirectory) {
        this.classRoomDirectory = classRoomDirectory;
    }

    public ClassAppointmentTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(ClassAppointmentTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
}
