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
public class CourseReviewRequest {
    
     private ArrayList<CourseRequest> courseRequestList;
    
    public CourseReviewRequest(){
        this.courseRequestList = new ArrayList();
    }

    public ArrayList<CourseRequest> getCourseRequestList() {
        return courseRequestList;
    }

    public void setCourseRequestList(ArrayList<CourseRequest> courseRequestList) {
        this.courseRequestList = courseRequestList;
    }
    
}
