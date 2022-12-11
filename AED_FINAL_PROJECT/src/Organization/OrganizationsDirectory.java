/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

import Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author sanja
 */
public class OrganizationsDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationsDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Trainer.getValue())){
            organization = new TrainerOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomerOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FitnessClubManager.getValue())){
            organization  = new FitnessManagerOrg();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.OnlineSales.getValue())){
            organization = new SalesOrg();
            organizationList.add(organization);
            
        }
        else if(type.getValue().equals(Type.Analysis.getValue())){
            organization = new AnalysisOrg();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrg();
            organizationList.add(organization);
        }
        return organization;
        
    }
    
}
