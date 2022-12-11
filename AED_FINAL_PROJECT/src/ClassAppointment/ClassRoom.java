/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassAppointment;

/**
 *
 * @author Sonur
 */
public class ClassRoom {
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    private int number;
    private static int id = 100;
    
    public ClassRoom(){
        if(id % 100 == 4){
            id = id + 100 - 4;
        }
        id++;
        this.number = id;
    }
    
    public String toString(){
        return "" + number;
    }
    
}
