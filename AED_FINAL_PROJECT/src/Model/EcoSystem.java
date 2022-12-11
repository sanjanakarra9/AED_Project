/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Enterprise.Enterprise;
import Network.Network;
import Organization.Organization;
import Role.Role;
import Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author sanja
 */
public class EcoSystem extends Organization {
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    //private CustomerDirectory customers;
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                
                if(!enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
                    return false;
                
                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
                    if(!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
                        return false;
            }
            
        }
        return true;
    }
    
}
