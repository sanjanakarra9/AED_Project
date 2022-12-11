/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Enterprise.Enterprise;
import Enterprise.FitnessEnterprise;
import FitnessmanagerUI.FCManagerWorkAreaJPanel;
import Model.EcoSystem;
import Network.Network;
import Organization.FitnessManagerOrg;
import Organization.Organization;
import UserAccount.UserAcnt;
import javax.swing.JPanel;

/**
 *
 * @author movvakodandram
 */
public class FitnessManagerRole extends Role{

     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcnt account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
         return new FCManagerWorkAreaJPanel(userProcessContainer, account, (FitnessManagerOrg)organization, 
                 (FitnessEnterprise)enterprise,network, business);
    }
   

   
}
