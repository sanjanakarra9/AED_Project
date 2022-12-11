/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassAppointment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sonur
 */
public class ClassAppointment {
    
    private ClassRoom classRoom;
    private String session;
    private Date date;
    
    public ClassAppointment(Date date, String session){
        classRoom = null;
        this.date = date;
        this.session = session;
    }
@Override
    public String toString(){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String s = df.format(date);
        s = s + " " + session;
        return s;
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
