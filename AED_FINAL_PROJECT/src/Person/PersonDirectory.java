/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import java.util.ArrayList;

/**
 *
 * @author sanja
 */
public class PersonDirectory {
    
    private ArrayList<Person> persList;

    public PersonDirectory(){
        this.persList = new ArrayList();
    }
    
    public ArrayList<Person> getPersonList() {
        return persList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.persList = personList;
    }
    
    public Person createPerson(String name){
        Person person = new Person();
        person.setName(name);
        persList.add(person);
        return person;
    }
    
}
