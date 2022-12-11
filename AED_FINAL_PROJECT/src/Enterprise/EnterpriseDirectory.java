/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Sonur
 */
public class EnterpriseDirectory {
    
     private ArrayList<Enterprise> listofenterprises;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return listofenterprises;
    }

    public void setEnterpriseList(ArrayList<Enterprise> listofenterprises) {
        this.listofenterprises = listofenterprises;
    }
    
    public EnterpriseDirectory(){
        listofenterprises=new ArrayList<Enterprise>();
    }
        public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.FitnessClub){
            enterprise=new FitnessEnterprise(name);
            listofenterprises.add(enterprise);
        }
        
        if(type==Enterprise.EnterpriseType.OnlineSales){
            enterprise=new OnlineSalesEnterprise(name);
            listofenterprises.add(enterprise);
        }
        return enterprise;
    }
    
   
}
