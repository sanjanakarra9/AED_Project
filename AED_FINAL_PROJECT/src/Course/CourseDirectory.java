/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Course;

import java.util.ArrayList;

/**
 *
 * @author Sonur
 */
public class CourseDirectory {
    private ArrayList<Course> listOfCourses;
    
    public CourseDirectory(){
        this.listOfCourses = new ArrayList();
}

    public ArrayList<Course> getListOfCourses() {
        return listOfCourses;
    }

    public void setListOfCourses(ArrayList<Course> listOfCourses) {
        this.listOfCourses = listOfCourses;
    }

    
    
}
