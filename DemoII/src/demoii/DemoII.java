/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demoii;

import java.util.ArrayList;



/**
 *
 * @author collinshook
 */


class Person
{
    private String firstName;
    private String lastName;
    private String city;
    

    public Person()
    {
    }

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, String city)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }
    
    public void Overload_func()
    {
        System.out.println("Overload");
    }
    
    public void Overload_func(int x)
    {
        System.out.println("Overload" + x);
    }
    
    public void Overload_func(int x, double y)
    {
        System.out.println("Overload" + x + y);
    }
    
    
    // getters and setters

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }
    
    //-----------------------------------
    
    
    public String getAllData()
    {
        return (firstName + " " + lastName + ", " + city);
    }
    
}


class Worker extends Person
{
    private String jobTitle;
    private String company;

    public Worker()
    {
        
    }
    
    
    public Worker(String jobTitle, String company)
    {
        this.jobTitle = jobTitle;
        this.company = company;
    }

    public Worker(String jobTitle, String company, String firstName, String lastName)
    {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
        this.company = company;
    }

    public Worker(String jobTitle, String company, String firstName, String lastName, String city)
    {
        super(firstName, lastName, city);
        this.jobTitle = jobTitle;
        this.company = company;
    }

    
  
    
    
    
}

public class DemoII
{

/**
 * @param args the command line arguments
 */
public static void main(String[] args)
{
    Person p1 = new Person();
    
    
    Person[] people = new Person[3];
    
    p1.setFirstName("Larry");
    p1.setLastName("Smith");
    p1.setCity("Kalispell");
    
    Person p2 = new Person("Curly", "Doe", "Whitefish");
    
    Person p3 = new Person("Moe", "Rodes", "Denver");
    
    people[0] = new Person();
    people[0] = p1;
    people[1] = p2;
    people[2] = p3;
    
    
    for(Person p : people)
    {
        System.out.println(p.getAllData());
    }
    
    
    ArrayList<Worker> workers = new ArrayList();
    
    Worker w1 = new Worker("Developer", "Google", "Bob", "Smith");
    Worker w2 = new Worker("Auditor", "IRS", "Dave", "Rodes");
    Worker w3 = new Worker();
    
    workers.add(w1);
    workers.add(w2);
    workers.add(w3);
    
    workers.get(2).setFirstName("Bilbo");
    workers.get(2).setLastName("Baggins");
    
    
    for (Worker w : workers)
    {
        System.out.println(w.getFirstName());
    }
    
    
    
    System.out.println("bye");
}

}
