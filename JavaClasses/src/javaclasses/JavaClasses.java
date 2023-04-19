/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaclasses;

/**
 *
 * @author collinshook
 */

class Person
{
    private String fn;
    private String ln;
    private String city;

    public Person()
    {
    }
    
    

    public Person(String fn, String ln, String city)
    {
        this.fn = fn;
        this.ln = ln;
        this.city = city;
    }

    public String getFn()
    {
        return fn;
    }

    public String getLn()
    {
        return ln;
    }

    public String getCity()
    {
        return city;
    }

    public void setFn(String fn)
    {
        this.fn = fn;
    }

    public void setLn(String ln)
    {
        this.ln = ln;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    private String getInfo()
    {
        return (this.fn + " " + this.ln + ", " + this.city);
    }
    
    public void printPerson()
    {
        System.out.println(getInfo());
    }

    
}

class Dog
{
    public String dogName;
    public String breed;

    public Dog()
    {
    }

    public Dog(String dogName)
    {
        this.dogName = dogName;
    }
    
    

    public Dog(String dogName, String breed)
    {
        this.dogName = dogName;
        this.breed = breed;
    }

    
    public void printDog()
    {
        System.out.println(this.dogName + " " + this.breed);
    } 
    
    
}

public class JavaClasses
{

/**
 * @param args the command line arguments
 */
public static void main(String[] args)
{
    // TODO code application logic here
    Person p1 = new Person();
    
    Dog dog1 = new Dog();
    
    dog1.dogName = "Rufus";
    dog1.breed = "Shepard";
    
    dog1.printDog();
}

}
