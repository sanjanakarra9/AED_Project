/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccount;

import Customer.Customer;
import Person.Person;
import Role.AnalysisAdminRole;
import Role.CustomerRole;
import Role.GymTrainerRole;
import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author movvakodandram
 */
public class UserAcntDirectory {
    
     private ArrayList<UserAcnt> userAccountList;

    public UserAcntDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAcnt> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAcnt authenticateUser(String username, String password){
        for (UserAcnt ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAcnt createUserAccount(String username, String password, Person person, Role role){
        UserAcnt userAccount = new UserAcnt();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    

    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAcnt ua : userAccountList){
            if(ua.getUsername()==null)continue;
//            if(ua==null)System.out.println("ua is null");
//            if(ua.getUsername()==null)System.out.println("name is nul;l");
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }

//    public UserAccount createUserAccount(String username, String password, Customer customer, CustomerRole customerRole) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public UserAcnt createUserAccount(String username, String password, Customer customer, CustomerRole customerRole) {
         UserAcnt ac = new UserAcnt();
         ac.setUsername(username);
         ac.setPassword(password);
         ac.setRole(customerRole);
         userAccountList.add(ac);
         return ac;
    }
       public UserAcnt createAnalysisAcount(String username, String password, AnalysisAdminRole analysisRole) {
         UserAcnt ac = new UserAcnt();
         ac.setUsername(username);
         ac.setPassword(password);
         ac.setRole(analysisRole);
         userAccountList.add(ac);
         return ac;
    }
       
       public UserAcnt createTrainerAcount(String username, String password, GymTrainerRole analysisRole) {
         UserAcnt ac = new UserAcnt();
         ac.setUsername(username);
         ac.setPassword(password);
         ac.setRole(analysisRole);
         userAccountList.add(ac);
         return ac;
    }
    
    
}
