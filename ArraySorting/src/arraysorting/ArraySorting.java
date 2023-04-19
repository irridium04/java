/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author collinshook
 */
public class ArraySorting
{

/**
 * @param args the command line arguments
 */

// for full arrays only
static void printArray(int[] theArray)
{
    System.out.println("");
    
    for (int i = 0; i < theArray.length; i++)
    {
        System.out.println(theArray[i] + " ");
        
        
        
        
    }
}

public static void main(String[] args)
{
//    Scanner myScan = new Scanner (System.in);
//    
//    int boxes = -1;
//    int numElements = 0;
//    String quit = "n";
//    int value = 0;
//    
    int foundItem = -1;
    String searchItem = "canoe";
    
    int[] myArr = {7,1,5,2,9,22,3,44,4};
    
    
    String[] vehicles = {"Bike", "Truck", "Car", "ATV", "Canoe"};
    
    // binary search
    // MUST SORT LIST !!!!!!!!!
    
    Arrays.sort(vehicles);
    
    foundItem = Arrays.binarySearch(vehicles, searchItem);
    
    
    if(foundItem > -1)
    {
        System.out.println("Item found: ");
    }
    else
    {
        System.out.println("Vehicle not found!");
    }
    
//    
//    System.out.println("Please enter number of boxes:\n");
//    boxes = Integer.parseInt(myScan.nextLine());
//    
//    int[] myArr2 = new int[boxes];
//    
//    while(quit.equals("n"))
//    {
//        System.out.println("Please enter an integer");
//        value = Integer.parseInt(myScan.nextLine());
//        myArr2[numElements] = value;
//        numElements++;
//        
//        if(numElements == boxes)
//        {
//            break;
//        }
//        
//        System.out.println("Quit? y/n\n");
//        quit = myScan.nextLine().toLowerCase();
//    }
    
    printArray(myArr);
    
    Arrays.sort(myArr);
    printArray(myArr);
    
    
    
    
    System.out.println("\nBye\n");
}

}
