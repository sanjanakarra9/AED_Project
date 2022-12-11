/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccount;

import Person.Person;
import Role.Role;
import WorkQueue.ApntQueue;
import WorkQueue.CourseQueue;
import WorkQueue.SalesQueue;
import WorkQueue.WorkQueue;

/**
 *
 * @author movvakodandram
 */
public class UserAcnt {

     
    private String username;
    private String password;
    private Person person;
    private Role role;
    private WorkQueue workQueue;
    private SalesQueue salesQueue;
    private ApntQueue apntQueue;
    private CourseQueue courseQueue;
    
     public UserAcnt() {
        workQueue = new WorkQueue();
        courseQueue = new CourseQueue();
        apntQueue = new ApntQueue();
        salesQueue = new SalesQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public SalesQueue getSalesQueue() {
        return salesQueue;
    }

    public void setSalesQueue(SalesQueue salesQueue) {
        this.salesQueue = salesQueue;
    }

    public ApntQueue getApntQueue() {
        return apntQueue;
    }

    public void setApntQueue(ApntQueue apntQueue) {
        this.apntQueue = apntQueue;
    }

    public CourseQueue getCourseQueue() {
        return courseQueue;
    }

    public void setCourseQueue(CourseQueue courseQueue) {
        this.courseQueue = courseQueue;
    }
    
    @Override
    public String toString() {
        return username;
    }
    
    
}
