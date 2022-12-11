/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

import ClassAppointment.ClassAppointmentTime;
import ClassAppointment.ClassRoomDirectory;
import Course.CourseDirectory;
import Enterprise.Enterprise.EnterpriseType;
import Role.Role;
import WorkQueue.ApntQueue;
import WorkQueue.CourseQueue;
import java.util.ArrayList;

/**
 *
 * @author Sonur
 */
public class FitnessEnterprise extends Enterprise{
    
    private CourseQueue  courseQueue;
    private CourseDirectory courseDirectory;
    private ApntQueue  apntQueue;
    private ClassRoomDirectory classRoomDirectory;
    private ClassAppointmentTime appointmentTime;

    public FitnessEnterprise(String name){
        super(name,EnterpriseType.FitnessClub);
        this.appointmentTime = new ClassAppointmentTime();
        this.classRoomDirectory = new ClassRoomDirectory();
        this.courseDirectory = new CourseDirectory();
        
        apntQueue = new ApntQueue();
        courseQueue = new CourseQueue();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    public CourseQueue getQueueofCourses() {
        return courseQueue;
    }

    public void setQueueofCourses(CourseQueue QueueofCourses) {
        this.courseQueue = QueueofCourses;
    }

    public CourseDirectory getCourseDirectory() {
        return courseDirectory;
    }

    public void setCourseDirectory(CourseDirectory courseDirectory) {
        this.courseDirectory = courseDirectory;
    }

    public ApntQueue getQueueofAppointments() {
        return apntQueue;
    }

    public void setQueueofAppointments(ApntQueue QueueofAppointments) {
        this.apntQueue = QueueofAppointments;
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
