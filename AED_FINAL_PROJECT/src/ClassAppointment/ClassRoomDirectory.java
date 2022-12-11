/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassAppointment;

import java.util.ArrayList;

/**
 *
 * @author Sonur
 */
public class ClassRoomDirectory {
    
     private ArrayList<ClassRoom> classRoomList;
    
    public ClassRoomDirectory(){
        this.classRoomList = new ArrayList();
        for(int i = 0; i < 25; i++){
            ClassRoom classRoom = new ClassRoom();
            this.classRoomList.add(classRoom);
        }
    }
    
    public ArrayList<ClassRoom> getClassRoomList(){
        return classRoomList;
    }
    
    public void setClassRoomList(ArrayList<ClassRoom> classRoomList){
        this.classRoomList = classRoomList;
    }
}
