/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import ClassAppointment.ClassAppointment;
import ClassAppointment.ClassRoom;
import Course.Course;
import Enterprise.FitnessEnterprise;
import Network.Network;
import Enterprise.Enterprise;
import Enterprise.OnlineSalesEnterprise;
import Organization.Organization;
import Person.Person;
import Role.AdminRole;
import Role.AnalysisAdminRole;
import Role.CustomerRole;
import Role.FitnessManagerRole;
import Role.GymTrainerRole;
import Role.OnlineSalesAdminRole;
import Role.SalesAdminRole;
import Role.SystemAdminRole;
import Sale.OnlineSales;
import UserAccount.UserAcnt;
import WorkQueue.ApntRequest;
import WorkQueue.CourseRequest;
import WorkQueue.SalesRequest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sanja
 */
public class ConfigureASystem {
    
     public static EcoSystem configure(){
         
        EcoSystem system = EcoSystem.getInstance();
        
        Person person = system.getPersonDirectory().createPerson("sysadmin");
        UserAcnt ua = system.getUserAccountDirectory().createUserAccount("Systemadmin", "Systemadmin@123", person, new SystemAdminRole());
         
        
        testData(system);
        return system;
     }
      public static void testData(EcoSystem system){
        Network network = new Network();  
        network.setName("FitnessClub");
        system.getNetworkList().add(network);
        
        //FitnessClub AdmiEnterpriseType
        FitnessEnterprise fitEnterprise = (FitnessEnterprise) network.getEnterpriseDirectory().createAndAddEnterprise("FitEnterprise", Enterprise.EnterpriseType.FitnessClub);
        Person admin1 = fitEnterprise.getPersonDirectory().createPerson("fitadmin");
        fitEnterprise.getUserAccountDirectory().createUserAccount("Fitnessadmin", "Fitnessadmin@123", admin1, new FitnessManagerRole());
//        
        OnlineSalesEnterprise onlinesalesEnterprise = (OnlineSalesEnterprise) network.getEnterpriseDirectory().createAndAddEnterprise("Sales", Enterprise.EnterpriseType.OnlineSales);
  Person admin2 = onlinesalesEnterprise.getPersonDirectory().createPerson("salesadmin");
        onlinesalesEnterprise.getUserAccountDirectory().createUserAccount("Salesadmin", "Salesadmin@123", admin2, new OnlineSalesAdminRole());
        
        ArrayList<Course> courseList = fitEnterprise.getCourseDirectory().getListOfCourses();
        takeCourse(courseList);
        
        //organization 6->Admin
        Organization AdminOrganization=fitEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Admin);
        Person adminmanager = AdminOrganization.getPersonDirectory().createPerson("Admin");
        UserAcnt admin = AdminOrganization.getUserAccountDirectory().createUserAccount("Admin", "Admin@123", adminmanager, new AdminRole());
        
        //organization 3->fitnessclub organization
        Organization fitOrganization = fitEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.FitnessClubManager);
        Person fitnessclubManager1 = fitOrganization.getPersonDirectory().createPerson("Sonu Manager");
        UserAcnt ua11 = fitOrganization.getUserAccountDirectory().createUserAccount("Manager1", "Manager1@123", fitnessclubManager1, new FitnessManagerRole());
        //organization 4->analysis organization
        Organization anaOrganization = fitEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Analysis);
        Person fitnessclubAnalyst1 = fitOrganization.getPersonDirectory().createPerson("Adithi Manager");
        UserAcnt ua66 = fitOrganization.getUserAccountDirectory().createUserAccount("Analysis", "Analysis@123", fitnessclubAnalyst1, new AnalysisAdminRole());
//        Person fitnessclubManager2 = fitOrganization.getPersonDirectory().createPerson("Sanju Manager");
//        UserAccount ua12 = fitOrganization.getUserAccountDirectory().createUserAccount("manager2", "manager2", fitnessclubManager2, new FitnessClubManagerRole());
//        
//        Person fitnessclubManager3 = fitOrganization.getPersonDirectory().createPerson("Ram Manager");
//        UserAccount ua13 = fitOrganization.getUserAccountDirectory().createUserAccount("manager3", "manager3", fitnessclubManager3, new FitnessClubManagerRole());
        
//Organization 1 ->customer
        Organization cusOrganization = fitEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Customer);
        Person cus1 = cusOrganization.getPersonDirectory().createPerson("Sai Customer");
        UserAcnt ua1 = cusOrganization.getUserAccountDirectory().createUserAccount("cus1", "cus1", cus1, new CustomerRole());
        
        Person cus2 = cusOrganization.getPersonDirectory().createPerson("Sanju Customer");
        UserAcnt ua2 = cusOrganization.getUserAccountDirectory().createUserAccount("cus2", "cus2", cus2, new CustomerRole());
        
        Person cus3 = cusOrganization.getPersonDirectory().createPerson("Nikhil Customer");
        UserAcnt ua3 = cusOrganization.getUserAccountDirectory().createUserAccount("cus3", "cus3", cus3, new CustomerRole());
        
        Person cus4 = cusOrganization.getPersonDirectory().createPerson("Anutej Customer");
        UserAcnt ua33 = cusOrganization.getUserAccountDirectory().createUserAccount("cus4", "cus4", cus4, new CustomerRole());
        
        Person cus5 = cusOrganization.getPersonDirectory().createPerson("Sanjay Customer");
        UserAcnt ua44 = cusOrganization.getUserAccountDirectory().createUserAccount("cus5", "cus5", cus5, new CustomerRole());
        
        Person cus6 = cusOrganization.getPersonDirectory().createPerson("Akhila Customer");
        UserAcnt ua55 = cusOrganization.getUserAccountDirectory().createUserAccount("cus6", "cus6", cus6, new CustomerRole());
        
        Person cus7 = cusOrganization.getPersonDirectory().createPerson("Sindhu Customer");
        cusOrganization.getUserAccountDirectory().createUserAccount("cus7", "cus7", cus7, new CustomerRole());
        
        //organization2 ->trainer
        Organization trainerOrganization = fitEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Trainer);
        Person trainer1 = trainerOrganization.getPersonDirectory().createPerson("Karthik Trainer");
        UserAcnt ua4 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer1", "trainer1", trainer1, new GymTrainerRole());
        
        Person trainer2 = trainerOrganization.getPersonDirectory().createPerson("Nishanth Trainer");
        UserAcnt ua5 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer2", "trainer2", trainer2, new GymTrainerRole());
        
        Person trainer3 = trainerOrganization.getPersonDirectory().createPerson("Shiva Trainer");
        UserAcnt ua6 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer3", "trainer3", trainer3, new GymTrainerRole());
        
        Person trainer4 = trainerOrganization.getPersonDirectory().createPerson("Devika Trainer");
        UserAcnt ua61 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer4", "trainer4", trainer4, new GymTrainerRole());
        
        
        
        ArrayList<OnlineSales> salesitemList = onlinesalesEnterprise.getOnlineSalesDirectory().getSalesList();
        
        readSalesItemList(salesitemList);
        //organization 5 ->sales organization
        Organization salesOrganization = onlinesalesEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.OnlineSales);
        Person sales1 = salesOrganization.getPersonDirectory().createPerson("Urban Sales");
        UserAcnt ua7 = salesOrganization.getUserAccountDirectory().createUserAccount("sales1", "sales1", sales1, new OnlineSalesAdminRole());
        
        Person sales2 = salesOrganization.getPersonDirectory().createPerson("Dorena Sales");
        UserAcnt ua8 = salesOrganization.getUserAccountDirectory().createUserAccount("sales2", "sales2", sales2, new OnlineSalesAdminRole());
        
        //anothersales
        
        
   Person sales3 = salesOrganization.getPersonDirectory().createPerson("Geri Sales");
        UserAcnt ua9 = salesOrganization.getUserAccountDirectory().createUserAccount("sales3", "sales3", sales3, new SalesAdminRole());
//        
        takeCourseRequest(fitEnterprise);
        readOnlineSalesRequest(fitEnterprise, onlinesalesEnterprise);
        readAppointmentRequest(fitEnterprise);
       
    
    }
    
    public static void takeCourse(ArrayList<Course> courseList){
        File f=new File("Course.csv");
        try {
            InputStreamReader customer = new InputStreamReader(new FileInputStream(f));
            BufferedReader br = new BufferedReader(customer);
            String line = "";
            try {
                line = br.readLine(); //read header
                line = br.readLine();
                while (line != null) {
                    String[] courseData = line.split(",");
                    Course course = new Course(courseData[0]);
                    course.setVacantSeats(Integer.parseInt(courseData[1]));
                    courseList.add(course);
                    course.setChallengesfaced(courseData[2]);
                    line = br.readLine();
                }
            }catch (IOException ex) {
                Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void takeCourseRequest(FitnessEnterprise fitEnterprise) {
       File f=new File("CourseRequest.csv");
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(f));
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            try {
                line = br.readLine(); //read header
                line = br.readLine();
                while (line != null) {
                    String[] courseRequestData = line.split(",");
                    String courseName = courseRequestData[0];
                    Course c = null;
                    for(Course course : fitEnterprise.getCourseDirectory().getListOfCourses())
                        if(course.getCourseName().equals(courseName)){
                            c = course;
                            break;
                        }
                    CourseRequest courseRequest = new CourseRequest();
                    courseRequest.setCourse(c);
//                    ArrayList<Course> courseList = new ArrayList();
//                    courseList.add(c);
                    UserAcnt cus = null;
                    for(Organization organization : fitEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAcnt ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(courseRequestData[1])){
                                cus = ua;
                                break;
                            }
                    
                    UserAcnt manager = null;
                    for(Organization organization : fitEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAcnt ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(courseRequestData[2])){
                                manager = ua;
                                break;
                            }            
                    
                    //CourseRequest courseRequest = new CourseRequest();
                    courseRequest.setSend(cus);
                    courseRequest.setReceive(manager);
                    courseRequest.setStatus(courseRequestData[3]);
                    
                    fitEnterprise.getQueueofCourses().getCourseRequestList().add(courseRequest);
                    cus.getCourseQueue().getCourseRequestList().add(courseRequest);
                    line = br.readLine();
                }
            }catch (IOException ex) {
                Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public static void readAppointmentRequest(FitnessEnterprise fitEnterprise) {
       File f = new File("AppointmentRequest.csv");
       try{
           InputStreamReader reader = new InputStreamReader(new FileInputStream(f));
           BufferedReader br = new BufferedReader(reader);
           String line = "";
           try {
                line = br.readLine(); //read header
                line = br.readLine();
                while (line != null) {
                    String[] appointmentRequestData = line.split(",");
                    int roomNumber;
                    
                    ClassRoom cr = null;
                    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                    
                    Date date = null;
                    String session = appointmentRequestData[1]; //有问题
                    try {
                        date = df.parse(appointmentRequestData[2]);
                    } catch (ParseException ex) {
                        Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    UserAcnt cus = null;
                    for(Organization organization : fitEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAcnt ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(appointmentRequestData[3])){
                                cus = ua;
                                break;
                            }
                    UserAcnt trainer = null;
                    for(Organization organization : fitEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAcnt ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(appointmentRequestData[4])){
                                trainer = ua;
                                break;
                            }          
                    
                    ClassAppointment appointment = new ClassAppointment(date, session);
                    ApntRequest appointmentRequest = new ApntRequest(appointment);
                    appointmentRequest.setSend(cus);
                    if(!appointmentRequestData[0].equals("")){
                        roomNumber = Integer.parseInt(appointmentRequestData[0]);
                        for(ClassRoom classRoom : fitEnterprise.getClassRoomDirectory().getClassRoomList()){
                            if(classRoom.getNumber() == roomNumber){
                                cr = classRoom;
                                appointment.setClassRoom(cr);
                                break;
                            }
                        }
                    }
                    
                    appointmentRequest.setReceive(trainer);
                    appointmentRequest.setStatus(appointmentRequestData[5]);
                    fitEnterprise.getQueueofAppointments().getAppointmentRequestList().add(appointmentRequest);
                    cus.getApntQueue().getAppointmentRequestList().add(appointmentRequest);
                    
                    if(appointmentRequest.getStatus().equals("Cancelled"))
                        fitEnterprise.getQueueofAppointments().getAppointmentRequestList().remove(appointmentRequest);
                    
                    line = br.readLine();
                }
           }catch (IOException ex) {
                Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
       }
    
        

    public static void readOnlineSalesRequest(FitnessEnterprise fitEnterprise, OnlineSalesEnterprise onlinesalesEnterprise) {
        File f=new File("OnlineSalesRequest.csv");
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(f));
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            try {
                line = br.readLine(); //read header
                line = br.readLine();
                while (line != null) {
                    String[] itemRequestData = line.split(",");
                    String itemName = itemRequestData[0];
                    OnlineSales s = null;
                    for(OnlineSales onlinesales : onlinesalesEnterprise.getOnlineSalesDirectory().getSalesList())
                        if(onlinesales.getItemname().equals(itemName)){
                            s = onlinesales;
                            break;
                        }
                    HashMap<OnlineSales, Integer> cart = new HashMap();
                    cart.put(s, Integer.parseInt(itemRequestData[1]));
                    UserAcnt cus = null;
                    for(Organization organization : fitEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAcnt ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(itemRequestData[2])){
                                cus = ua;
                                break;
                            }
                    
                    UserAcnt salesManager= null;
                    for(Organization organization : onlinesalesEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAcnt ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(itemRequestData[3])){
                                salesManager = ua;
                                break;
                            }            
                    
                    SalesRequest onlinesalesRequest = new SalesRequest();
                    onlinesalesRequest.setSend(cus);
                    onlinesalesRequest.setItemOrder(cart);
                    onlinesalesRequest.setReceive(salesManager);
                    onlinesalesRequest.setStatus(itemRequestData[4]);
                    onlinesalesEnterprise.getOnlineSalesQueue().getOnlinesalesRequestList().add(onlinesalesRequest);
                    cus.getSalesQueue().getOnlinesalesRequestList().add(onlinesalesRequest);
            
                    line = br.readLine();
                }
            }catch (IOException ex) {
                Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void readSalesItemList(ArrayList<OnlineSales> salesitemList) {
        OnlineSales item1 = new OnlineSales("Protein powder", 50.0);
        OnlineSales item2 = new OnlineSales("Gatorate", 6);
        OnlineSales item3 = new OnlineSales("Red Bull", 3.5);
        OnlineSales item4 = new OnlineSales("Salad", 9);
        OnlineSales item5 = new OnlineSales("Fitness Ball", 17);
        OnlineSales item6 = new OnlineSales("Yoga Mat", 30.8);
        OnlineSales item7 = new OnlineSales("Weights", 15.8);
        OnlineSales item8 = new OnlineSales("Leggings", 50);
        OnlineSales item9 = new OnlineSales("Sports Bra", 27.2);
        OnlineSales item10 = new OnlineSales("Fitness Glove", 16.75);
        OnlineSales item11 = new OnlineSales("Loop Bands", 9.99);
        OnlineSales item12 = new OnlineSales("Fitness Bottle", 18);
        salesitemList.add(item1);
        salesitemList.add(item2);
        salesitemList.add(item3);
        salesitemList.add(item4);
        salesitemList.add(item5);
        salesitemList.add(item6);
        salesitemList.add(item7);
        salesitemList.add(item8);
        salesitemList.add(item9);
        salesitemList.add(item10);
        salesitemList.add(item11);
        salesitemList.add(item12);
    }
 
    
    
 
}
