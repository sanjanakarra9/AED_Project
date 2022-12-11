/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassAppointment;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sonur
 */
public class Appointmenttimings {
 
     Date date;
    private ArrayList<Date> dateList;
    private ArrayList<String> sessionList;

     public Appointment(Date date, String session){
        classRoom = null;
        this.date = date;
        this.session = session;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
