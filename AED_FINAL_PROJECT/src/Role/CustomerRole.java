/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Customer.UserInterface.CustomerAreaJPanel;
import Enterprise.Enterprise;
import Model.EcoSystem;
import Network.Network;
import Organization.CustomerOrg;
import Organization.Organization;
import UserAccount.UserAcnt;
import javax.swing.JPanel;

/**
 *
 * @author movvakodandram
 */
public class CustomerRole extends Role{

   
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcnt account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new CustomerAreaJPanel(userProcessContainer, account, (CustomerOrg)organization, enterprise, network, business);
    }
    
    
}
