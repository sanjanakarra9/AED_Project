/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Enterprise.Enterprise;
import Model.EcoSystem;
import Network.Network;
import Organization.Organization;
import UserAccount.UserAcnt;
import javax.swing.JPanel;

/**
 *
 * @author movvakodandram
 */
    public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Trainer("Trainer"),
        Customer("Customer"),
        Sales("Sales"),
        ClubMembershipManager("ClubMembershipManager"),
        Analysis("Analysis"),
        FitnessClubManager("FitnessClubManager");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
   public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAcnt account, 
            Organization organization, 
            Enterprise enterprise,
            Network network,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
    

