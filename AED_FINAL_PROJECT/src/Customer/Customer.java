/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

/**
 *
 * @author sanja
 */
public class Customer {
    
    private int customerId;
    private String firstName;
    private String lastName;
    private String address;
    private String mobile;
    private String email;
    private String membership;
    private static int count = 0;
    
    public Customer(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = "";
        this.email = email;
        this.mobile = mobile;
        this.membership = membership;
        customerId = count;
        count++;
    }

    public int getCusId() {
        return customerId;
    }

    public void setName(String Name){
        String [] names = Name.split(" ");
        this.firstName = names[0];
        this.lastName = names[1];
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return mobile;
    }

    public void setPhone(String phone) {
        this.mobile = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Customer.count = count;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }
    
}
