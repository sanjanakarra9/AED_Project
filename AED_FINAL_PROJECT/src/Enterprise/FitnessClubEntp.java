/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

/**
 *
 * @author Sonur
 */
public class FitnessClubEntp {
    
    private QueueofCourses QueueofCourses;
    private CourseDirectory courseDirectory;
    private QueueofAppointments QueueofAppointments;
    private ClassRoomDirectory classRoomDirectory;
    private AppointmentTime appointmentTime;
    
    public FitnessClubEntp(String name){
        super(name,TypeofEntp.FitnessClub);
        this.appointmentTime = new AppointmentTime();
        this.classRoomDirectory = new ClassRoomDirectory();
        this.courseDirectory = new CourseDirectory();
        
        appointmentQueue = new AppointmentQueue();
        courseQueue = new CourseQueue();
    }

    public QueueofCourses getQueueofCourses() {
        return QueueofCourses;
    }

    public void setQueueofCourses(QueueofCourses QueueofCourses) {
        this.QueueofCourses = QueueofCourses;
    }

    public CourseDirectory getCourseDirectory() {
        return courseDirectory;
    }

    public void setCourseDirectory(CourseDirectory courseDirectory) {
        this.courseDirectory = courseDirectory;
    }

    public QueueofAppointments getQueueofAppointments() {
        return QueueofAppointments;
    }

    public void setQueueofAppointments(QueueofAppointments QueueofAppointments) {
        this.QueueofAppointments = QueueofAppointments;
    }

    public ClassRoomDirectory getClassRoomDirectory() {
        return classRoomDirectory;
    }

    public void setClassRoomDirectory(ClassRoomDirectory classRoomDirectory) {
        this.classRoomDirectory = classRoomDirectory;
    }

    public AppointmentTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(AppointmentTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
    
    
}
