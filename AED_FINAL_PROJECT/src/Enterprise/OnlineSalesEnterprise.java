/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

import Role.Role;
import Sale.OnlineSalesDirectory;
import WorkQueue.SalesQueue;
import java.util.ArrayList;

/**
 *
 * @author Sonur
 */
public class OnlineSalesEnterprise extends Enterprise {
      private SalesQueue onlineSalesQueue;
    private OnlineSalesDirectory onlineSalesDirectory;
    
    public OnlineSalesEnterprise(String name){
        super(name, Enterprise.EnterpriseType.OnlineSales);
        this.onlineSalesDirectory = new OnlineSalesDirectory();
        
        onlineSalesQueue = new SalesQueue();
    }
    
    public ArrayList<Role> getSupportRole(){
        return null;
    }

    public SalesQueue getOnlineSalesQueue() {
        return onlineSalesQueue;
    }

    public void setOnlineSalesQueue(SalesQueue onlineSalesQueue) {
        this.onlineSalesQueue = onlineSalesQueue;
    }

    public OnlineSalesDirectory getOnlineSalesDirectory() {
        return onlineSalesDirectory;
    }

    public void setOnlineSalesDirectory(OnlineSalesDirectory onlineSalesDirectory) {
        this.onlineSalesDirectory = onlineSalesDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
