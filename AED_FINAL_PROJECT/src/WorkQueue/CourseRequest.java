/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

import Course.Course;

/**
 *
 * @author Sonur
 */
public class CourseRequest extends workRequest{
     private Course course;
    private String result;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
     @Override
    public String toString(){
        
        return course.getCourseName();
    }
    
    public CourseRequest(){
        course = new Course();
    }
}
