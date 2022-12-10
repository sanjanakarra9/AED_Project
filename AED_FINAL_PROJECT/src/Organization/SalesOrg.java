/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

import java.util.ArrayList;

/**
 *
 * @author sanja
 */
public class SalesOrg extends Organization{
    
    public SalesOrg() {
        super(Organization.Type.OnlineSales.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OnlineSalesRole());
        return roles;
    }
    
}