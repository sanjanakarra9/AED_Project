/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

import Role.Role;
import Role.FitnessManagerRole;
import java.util.ArrayList;

/**
 *
 * @author sanja
 */
public class FitnessManagerOrg extends Organization{
    public FitnessManagerOrg() {
        super(Organization.Type.FitnessClubManager.getValue());
    }

    @Override
   public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FitnessManagerRole());
        return roles;
    }
    
}
