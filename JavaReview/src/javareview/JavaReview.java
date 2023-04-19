/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javareview;

import java.util.ArrayList;
import java.util.Scanner;

class Dessert
{
    private String dessertName;
    private int calories;
    private double cost;

    public Dessert(String dessertName, int calories, double cost)
    {
        this.dessertName = dessertName;
        this.calories = calories;
        this.cost = cost;
    }

    public String getDessertName()
    {
        return dessertName;
    }

    public void setDessertName(String dessertName)
    {
        this.dessertName = dessertName;
    }

    public int getCalories()
    {
        return calories;
    }

    public void setCalories(int calories)
    {
        this.calories = calories;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }
    
    public void PrintDessert(int itemNum)
    {
        System.out.println(itemNum + ".\tName: " + this.dessertName + "\tCalories: " + this.calories + "\tCost: " + this.cost);
    }

}

/**
 *
 * @author collinshook
 */
public class JavaReview
{

    static Scanner myScan = new Scanner(System.in);
    
    
    static void Menu(ArrayList<String> shows)
    {
        int choice = 0;
        boolean isValid = false;
        
        while(!isValid)
        {
            System.out.println(" Menu\n" +
            "1. Q1\n" +
            "2. Q2\n" +
            "3. Q3\n" +
            "4. Q4\n" +
            "5. Q5\n" +
            "6. Exit");

            System.out.println("Enter a whole number between 1 and 6!\n");
            try
            {
                choice = Integer.parseInt(myScan.nextLine());
                isValid = true;
                
                switch (choice)
                {
                    case 1 -> Q1();
                    case 2 -> Q2();
                    case 3 -> Q3(shows);
                    case 4 -> Q4();
                    case 5 -> Q5();
                    case 6 ->
                    {
                        return;
                    }

                    default ->
                    {
                        System.out.println("Not an option!");
                        isValid = false;
                    }

                }
                
            }
            catch(NumberFormatException e)
            {
                System.out.println("Not an integer!");
                isValid = false;
            }
        }
    }

    static void Q1()
    {
        int num = 0;
        boolean isValid = false;

        while (!isValid)
        {
            System.out.println("Enter a whole number between 1 and 100!\n");
            try
            {
                num = Integer.parseInt(myScan.nextLine());
                if (num < 1 || num > 100)
                {
                    System.out.println("Not between 1 and 100");

                }
                else
                {
                    isValid = true;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Not an integer!");
            }
        }

        String mood = "";

        if (num <= 20)
        {
            mood = "Oscar";
        }
        else
        {
            if (num > 20 && num <= 40)
            {
                mood = "Animal";
            }
            else
            {
                if (num > 40 && num <= 60)
                {
                    mood = "Elmo";
                }
                else
                {
                    if (num > 60 && num <= 80)
                    {
                        mood = "Big Bird";
                    }
                    else
                    {
                        mood = "Kermit";
                    }
                }
            }
        }

        System.out.println("\nYour mood is " + mood + "\n");
    }

    static void Q2()
    {
        int rows = 0;
        int cols = 0;
        String content;

        boolean isValid = false;

        while (!isValid)
        {
            try
            {
                System.out.println("Enter a number of rows!");
                rows = Integer.parseInt(myScan.nextLine());
                System.out.println("Enter a number of columns!");
                cols = Integer.parseInt(myScan.nextLine());

                if (rows < 0 || cols < 0)
                {
                    System.out.println("Cannot have negative amount of rows or columns!");

                }
                else
                {
                    isValid = true;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Not an integer!");
            }
        }

        System.out.println("Enter a character to repeat!");
        content = myScan.nextLine();

        System.out.println("");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(content + "\t");
            }
            System.out.println("");
        }
    }

    static void Q3(ArrayList<String> shows)
    {
int choice = 0;
        boolean isValid = false;
        
        while(!isValid)
        {
            System.out.println("Tv Shows"
                    + " Menu\n" +
            "1. Add TV Shows\n" +
            "2. Print TV Shows\n" +
            "3. Delete TV Shows\n" +
            "4. Exit");

            System.out.println("Enter a whole number between 1 and 4!\n");
            try
            {
                choice = Integer.parseInt(myScan.nextLine());
                isValid = true;
                switch (choice)
                {
                    case 1 -> Q3_Add(shows);
                    case 2 -> Q3_Print(shows);
                    case 3 -> Q3_Delete(shows);
                    case 4 ->
                    {
                        return;
                    }

                    default ->
                    {
                        System.out.println("Not an option!");
                        isValid = false;
                    }

                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("Not an integer!");
                isValid = false;
            }

        }
    }

    static void Q3_Add(ArrayList<String> shows)
    {
        System.out.println("Enter a name of a TV show to add!");
        shows.add(myScan.nextLine());
        Q3_Print(shows);
    }

    static void Q3_Print(ArrayList<String> shows)
    {
        System.out.println("TV Shows List\n");
        int c = 1;
        for (String show : shows)
        {
            System.out.println(c + ". " + show);
            c++;
        }
        
        System.out.println("----------------------");
    }

    static void Q3_Delete(ArrayList<String> shows)
    {
        Q3_Print(shows);

        int numToDelete = 0;
        boolean isValid = false;

        while (!isValid)
        {
            try
            {
                System.out.println("Enter a number to delete!");
                numToDelete = Integer.parseInt(myScan.nextLine());

                if (numToDelete < 0 || numToDelete > shows.size())
                {
                    System.out.println("Number out of range!");
                }
                else
                {
                    isValid = true;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Not an integer!");
            }
        }

        shows.remove(numToDelete);

        Q3_Print(shows);
    }

    static void Q4()
    {
        String[] items = new String[100];

        int i = 0;
        String shouldContinue = "y";
        while (!shouldContinue.equals("n") && i < 100)
        {
            System.out.println("Enter an item to put in the closet!");
            items[i] = myScan.nextLine();

            i++;
            System.out.println("Enter y to continue or n to quit!");
            shouldContinue = myScan.nextLine().toLowerCase();
        }

        System.out.println("Items in closet:\n");
        for (int c = 0; c < i; c++)
        {
            System.out.println((c + 1) + ". " + items[c]);
        }
    }
    
    static void Q5()
    {
        ArrayList<Dessert> desserts = new ArrayList<>();

        String dessertName;
        int calories = 0;
        double cost = 0;
        
        String shouldContinue = "y";
        while (!shouldContinue.equals("n"))
        {
            System.out.println("Enter an dessert name!");
            dessertName = myScan.nextLine();
            
            
  
            boolean isValid = false;

            while (!isValid)
            {
                try
                {
                    System.out.println("Enter a calorie count!\n");
                    calories = Integer.parseInt(myScan.nextLine());
                    System.out.println("Enter a cost!\n");
                    cost = Double.parseDouble(myScan.nextLine());
                    if (calories < 0)
                    {
                        System.out.println("Cannot have negative calories!");

                    }
                    else if (cost < 0)
                    {
                        System.out.println("Cannot have negative cost!");

                    }
                    else
                    {
                        isValid = true;
                    }
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Not an integer!");
                }
            }
            
            Dessert d = new Dessert(dessertName, calories, cost);
            
            desserts.add(d);
            
            System.out.println("Enter y to continue or n to quit!");
            shouldContinue = myScan.nextLine().toLowerCase();
        }
        
        System.out.println("Dessert list:");
        
        int i = 1;
        
        for (Dessert dessert : desserts)
        {
            dessert.PrintDessert(i);
            i++;
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayList<String> shows = new ArrayList<>();
        
        String shouldContinue = "y";
        while (!shouldContinue.equals("n"))
        {
            Menu(shows);    
            
            System.out.println("Enter y to continue or n to quit!");
            shouldContinue = myScan.nextLine().toLowerCase();
        }
        
        System.out.println("\nGoodbye!\n");
    }
}
