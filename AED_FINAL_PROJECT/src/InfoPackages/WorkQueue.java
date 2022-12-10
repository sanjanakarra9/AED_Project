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
public class WorkQueue {
    
    private ArrayList<RequestInfo> infoRequestList;
    
    public WorkQueue(){
        infoRequestList= new ArrayList();
    }

    public ArrayList<RequestInfo> getInfoRequestList() {
        return infoRequestList;
    }
    
    
    
}
