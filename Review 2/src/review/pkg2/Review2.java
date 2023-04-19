/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package review.pkg2;

import java.util.Scanner;

/**
 *
 * @author collinshook
 */
public class Review2 {

    static Scanner myScan = new Scanner(System.in);

    /**
     * @param x
     */

    public static void dtrees(int x) 
    {
        if (x > 40) 
        {
            System.out.println("num is greater than 40\n");
        } 
        
        else 
        {
            System.out.println("num is less than or equal to 40\n");
        }
        
    }
    
    public static void loops()
    {
        int numberOfLoops = 25;
        int i = 0;
        
        do
        {
            System.out.println("Do loop - "  + i);
            i++;
        }
        while (i < numberOfLoops);
        
        i = 0;
        while (i < numberOfLoops)
        {
            System.out.println("While loop - "  + i);
            i++;
        }
        
        
        for (int c = 0; c < numberOfLoops; c++)
        {
            System.out.println("For loop - "  + c);
        }
        
        for (int c = 0; c < numberOfLoops; c += 3)
        {
            System.out.println("For loop - "  + c);
        }
        
    }
    
    static void happy1()
    {
        
    }
    
    static void happy2()
    {
        
    }
    
    static void happy3()
    {
        
    }
    
    static void menu()
    {
        System.out.print("menu\n1. Happy 1\n2. Happy 2\n3. Happy 3\nPlease enter 1, 2, or 3: ");
        
    }
    
    static void switch_example_1()
    {
        menu();
        
        int choice = Integer.parseInt(myScan.nextLine());
        
        switch(choice)
        {
            case 1:
                happy1();
                break;
                
            case 2:
                happy2();
                break;
                
            case 3:
                happy3();
                break;
             
            default:
                System.out.println("Not a choice!");
        }
    }
    
    static void switch_example_2()
    {
        menu();
        
        int choice = Integer.parseInt(myScan.nextLine());
        
        switch(choice)
        {
            case 1 -> happy1();
            case 2 -> happy2();
            case 3 -> happy3(); 
            default -> System.out.println("Not a choice!");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public static void main(String[] args) 
    {
        // TODO code application logic here

        
        loops();
        
        System.out.println("Enter an integer:\n");
        
        try 
        {
            int myInt;
            myInt = Integer.parseInt(myScan.nextLine());
            dtrees(myInt);
        }
        catch(NumberFormatException e)
        {   
            System.out.println("Not an int");
        }
        
        switch_example_1();

        System.out.println("\nBye\n");
    }

}
