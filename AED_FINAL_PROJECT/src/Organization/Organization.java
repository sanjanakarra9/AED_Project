/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

import Employee.EmployeeDirectory;
import Person.PersonDirectory;
import Role.Role;
import UserAccount.UserAcntDirectory;
import WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author sanja
 */
public abstract class Organization {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAcntDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAcntDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public OrganizationsDirectory getOrganizationsDirectory() {
        return organizationsDirectory;
    }

    public void setOrganizationsDirectory(OrganizationsDirectory organizationsDirectory) {
        this.organizationsDirectory = organizationsDirectory;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAcntDirectory userAccountDirectory;
    private PersonDirectory personDirectory;
    private int organizationID;
    private OrganizationsDirectory organizationsDirectory;
    private static int counter=0;
    
    
    public enum Type{
        Admin("Admin Organization"), 
        Trainer("Trainer Organization"), 
        Customer("Customer Organization"), 
        OnlineSales("Sales Organization"),
        FitnessClubManager("Fitness Club Manager Organization"),
        Analysis("Analysis Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAcntDirectory();
        organizationsDirectory = new OrganizationsDirectory();
        organizationID = counter;
        ++counter;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    @Override
    public String toString() {
        return name;
    }

    
    

}
