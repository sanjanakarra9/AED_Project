package WorkQueue;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author Sonur
 */
public class WorkQueue {
     private ArrayList<workRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public void setWorkRequestList(ArrayList<workRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }

    public ArrayList<workRequest> getWorkRequestList() {
        return workRequestList;
    }

}
