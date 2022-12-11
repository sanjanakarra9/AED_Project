/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import java.util.ArrayList;

/**
 *
 * @author sanja
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> custList;
    
    public CustomerDirectory(){
        custList = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return custList;
    }

    public void addCustomer(String firstName, String lastName, String email, String phone, String address){
        Customer customer = new Customer(firstName, lastName, email, phone);
        //customer.setName(firstName, lastName);
        customer.setEmail(email);
        customer.setPhone(phone);
        customer.setAddress(address);
        custList.add(customer);
    }
    
    public Customer createCustomer(String firstName, String lastName, String email, String phone) {
        Customer customer = new Customer(firstName, lastName, email, phone);
        this.custList.add(customer);
        return customer;
    }
    
}
