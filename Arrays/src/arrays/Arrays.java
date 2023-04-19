/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author collinshook
 */
public class Arrays
{

public static void arr2Demo()
{
    int myI[] =
    {
        1, 2, 3, 4, 5, 6, 7, 8, 9
    };

    for (int c = 0; c < myI.length; c++)
    {
        System.out.print(myI[c] + " ");
    }
    
    System.out.println("");
    for (int x : myI)
    {
        System.out.print(x + " ");
    }
    
    String[] colors = {
        "red", "blue" , "yellow", "green", "orange", "pink", "white", "teal"
    };
    
    
    for(String clr : colors)
    {
        System.out.println(clr);
    }
}

/**
 * @param args the command line arguments
 */
public static void main(String[] args)
{
    arr2Demo();
}

}
