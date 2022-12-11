/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Network;

import Enterprise.EnterpriseDirectory;
import UserAccount.UserAcntDirectory;

/**
 *
 * @author movvakodandram
 */
public class Network {
      private String name;
    private EnterpriseDirectory enterpriseDirectory;
     private UserAcntDirectory userAccountDirectory;
     
     public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
        userAccountDirectory = new UserAcntDirectory();
    }
    

    public UserAcntDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAcntDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
     
  
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

   
    
    @Override
    public String toString(){
        return name;
    }

    
    public boolean getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
