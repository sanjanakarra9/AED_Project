/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InfoPackages;

import java.util.ArrayList;

/**
 *
 * @author Sonur
 */
public class ReviewRequestForCourse {
    
    private ArrayList<RequestForcourses> classReviewRequestList;
    
    public ReviewRequestForCourse(CourseReview RequestForcourses){
        this.classReviewRequestList = new ArrayList();
    }

    public ArrayList<RequestForcourses> getClassReviewRequestList() {
        return classReviewRequestList;
    }

    public void setClassReviewRequestList(ArrayList<CourseReviewRequest> classReviewRequestList) {
        this.classReviewRequestList = classReviewRequestList;
    }
}
