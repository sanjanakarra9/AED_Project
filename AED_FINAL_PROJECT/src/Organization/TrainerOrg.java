/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

import Role.Role;
import Role.RoleTrainer;
import java.util.ArrayList;

/**
 *
 * @author sanja
 */
public class TrainerOrg extends Organization{

    public TrainerOrg() {
        
         super(Organization.Type.Trainer.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleTrainer());
        return roles;
    }
}
