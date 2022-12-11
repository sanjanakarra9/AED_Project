/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Course;

/**
 *
 * @author Sonur
 */
public class Course {
    
    private String courseName;
    private int courseId;
    private String challengesfaced; 
    private static int count = 0; 
    private int vacantSeats;
      
       public Course(String coursename){
        this.courseName = coursename;
        this.challengesfaced = challengesfaced;
        courseId = count;
        count++;
    }
         public Course() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getChallengesfaced() {
        return challengesfaced;
    }

    public void setChallengesfaced(String challengesfaced) {
        this.challengesfaced = challengesfaced;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Course.count = count;
    }

    public int getVacantSeats() {
        return vacantSeats;
    }

    public void setVacantSeats(int vacantSeats) {
        this.vacantSeats = vacantSeats;
    }
       
    @Override
    public String toString(){
        return this.courseName;
    }
    
}
