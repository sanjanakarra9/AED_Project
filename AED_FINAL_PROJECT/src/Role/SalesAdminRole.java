/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Enterprise.Enterprise;
import Enterprise.OnlineSalesEnterprise;
import Model.EcoSystem;
import Network.Network;
import Organization.Organization;
import Organization.SalesOrg;
import SalesManager.UI.SalesManagerWorkAreaJPanel;
import UserAccount.UserAcnt;
import javax.swing.JPanel;

/**
 *
 * @author movvakodandram
 */
public class SalesAdminRole extends Role {
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcnt account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new SalesManagerWorkAreaJPanel(userProcessContainer, account, (SalesOrg) organization, (OnlineSalesEnterprise) enterprise, network, business);
    }
}
