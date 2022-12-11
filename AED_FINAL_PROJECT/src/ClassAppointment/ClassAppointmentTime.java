/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassAppointment;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Sonur
 */
public class ClassAppointmentTime {
 
    Date date;
    private ArrayList<Date> dateList;
    private ArrayList<String> sessionList;
    
     public ClassAppointmentTime(){
        
        dateList = new ArrayList();
        sessionList = new ArrayList();
        
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        try{
            date = df.parse("2022-12-01");
        }
        catch(ParseException pe){
            
        }
        
        Calendar dateCalendar = Calendar.getInstance();
        dateCalendar.setTime(date);
        
        for(int i = 0; i < 30; i++){
           dateCalendar.add(Calendar.DAY_OF_YEAR, 1);
           
           dateList.add(dateCalendar.getTime());
           
        }
        
        sessionList.add("8:00 - 9:00");
        sessionList.add("9:10 - 10:10");
        sessionList.add("10:20 - 11:20");
        sessionList.add("11:30 - 12:30");
        sessionList.add("13:30 - 14:30");
        sessionList.add("14:40 - 15:40");
        sessionList.add("15:50 - 16:50");
        sessionList.add("17:00 - 18:00");
    }
    
     public ArrayList<Date> getDateList() {
        return dateList;
    }

    public void setDateList(ArrayList<Date> dateList) {
        this.dateList = dateList;
    }

    public ArrayList<String> getSessionList() {
        return sessionList;
    }

    public void setSessionList(ArrayList<String> sessionList) {
        this.sessionList = sessionList;
    }
    
}
