/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

import Role.Role;
import Role.CustomerRole;
import java.util.ArrayList;

/**
 *
 * @author sanja
 */
public class CustomerOrg extends Organization {

    public CustomerOrg() {
        
        super(Organization.Type.Customer.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CustomerRole());
        return roles;
    }

    
    
}
