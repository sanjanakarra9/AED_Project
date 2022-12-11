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
public class SalesQueue {
    private ArrayList<SalesRequest> onlinesalesRequestList;
     
    public SalesQueue(){
        this.onlinesalesRequestList = new ArrayList();
    }


    public ArrayList<SalesRequest> getOnlinesalesRequestList() {
        return onlinesalesRequestList;
    }

    public void setOnlinesalesRequestList(ArrayList<SalesRequest> onlinesalesRequestList) {
        this.onlinesalesRequestList = onlinesalesRequestList;
    }
    
}
