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
public class CourseReview {
    
    private ArrayList<CourseRequest> classReviewRequestList;
    
    public CourseReview(CourseReview RequestForcourses){
        this.classReviewRequestList = new ArrayList();
    }

    public ArrayList<CourseRequest> getClassReviewRequestList() {
        return classReviewRequestList;
    }

    public void setClassReviewRequestList(ArrayList<CourseRequest> classReviewRequestList) {
        this.classReviewRequestList = classReviewRequestList;
    }

   
}
