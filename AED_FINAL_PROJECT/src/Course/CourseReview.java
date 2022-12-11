/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Course;

/**
 *
 * @author Sonur
 */
public class CourseReview {
    
    private String courseName;
    private String gymtrainerName;
    private int courseId;
    private int reviewId;
    private static int count = 0;
    
    
     public CourseReview(String coursename, String gymtrainerName, int reviewId){
        this.courseName = coursename;
        this.gymtrainerName = gymtrainerName;
        reviewId = count;
        count++;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getGymtrainerName() {
        return gymtrainerName;
    }

    public void setGymtrainerName(String gymtrainerName) {
        this.gymtrainerName = gymtrainerName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CourseReview.count = count;
    }
    
}
