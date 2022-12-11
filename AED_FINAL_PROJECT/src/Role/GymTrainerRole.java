/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Enterprise.Enterprise;
import Enterprise.FitnessEnterprise;
import FitnessTrainerUI.FCTrainerWorkAreaJPanel;
import Model.EcoSystem;
import Network.Network;
import Organization.Organization;
import Organization.TrainerOrg;
import UserAccount.UserAcnt;
import javax.swing.JPanel;

/**
 *
 * @author Sonur
 */
public class GymTrainerRole extends Role{

    
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcnt account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new FCTrainerWorkAreaJPanel(userProcessContainer, account, (TrainerOrg)organization, (FitnessEnterprise)enterprise, network, business);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
