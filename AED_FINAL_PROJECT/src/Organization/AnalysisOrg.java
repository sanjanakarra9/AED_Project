/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

import Role.Role;
import Role.AnalystAdminRole;
import java.util.ArrayList;

/**
 *
 * @author sanja
 */
public class AnalysisOrg extends Organization{
    
    public AnalysisOrg() {
        super(Organization.Type.Analysis.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AnalystAdminRole());
        return roles;
    }
    
}
