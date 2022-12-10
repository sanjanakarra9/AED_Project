/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

/**
 *
 * @author Sonur
 */
public class Enterprise extends Organization{
    
    private typeOfEnterprise typeOfEnterprise;
    private OrganizationsDirectory organizationDirectory;

    public OrganizationsDirectory getOrganizationsDirectory() {
        return organizationsDirectory;
    }
    
     public enum EnterpriseType{
        //Hospital("Hospital");
        FitnessClub("FitnessClub"),
        OnlineSales("OnlineSales"),
        HealthEnterprise("Health Services");
        
        private String value;
        
        private typeOfEnterprise(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }
     
     public EnterpriseType typeOfEnterprise() {
        return enterpriseType;
    }

   
}
