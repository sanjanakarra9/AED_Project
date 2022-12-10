/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

import java.util.ArrayList;

/**
 *
 * @author sanja
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> empList;

    public EmployeeDirectory() {
        empList = new ArrayList();
        
        
    }

    public ArrayList<Employee> getEmployeeList() {
        return empList;
    }
    
    public boolean isEmployeeExist(Employee emp) {
        if (!this.empList.isEmpty()) {
            for (Employee em : this.empList) {
                if (em.getId() == emp.getId()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public Employee createEmployee(String name, String mobileNumber, String email, String address, String course,String evaluation){
        Employee employee = new Employee(name, mobileNumber, email, address, course);
        empList.add(employee);
        
       
        return employee;
    }
}
