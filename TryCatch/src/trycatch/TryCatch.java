/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trycatch;

/**
 *
 * @author collinshook
 */
public class TryCatch
{

    public static void trycatch()
    {

        String myString = "Bob";
        char y;


        try
        {

        y = myString.charAt(9);
        System.out.println("Char = " + y);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        finally
        {
            System.out.println("Always runs.");
        }

    }
    
    @SuppressWarnings("null")
    public static void arraydemo1()
    {
        int numBoxes = 20;
        double[] Array1;
        
        Array1 = new double[numBoxes];
        
        String dogNames[] = new String[numBoxes];
        
        String[] stooges = {"Larry" , "Curly", "Moe", "Shemp"};
        
        int yrs = 10, mos = 3, wks = 4, plrs = 3, holes = 18;
        
        int[][][][][] gs = new int[yrs][mos][wks][plrs][holes];
        
        String[][] names = {{"Mr", "Mrs", "Ms", "Dr"},{"Rodes", "Doe", "Smith", "Bill"}};
        
        //int[][] numpairs = {{10,15},{12,22},{53,20}, {25, 14}};
        
        //=----------------------------------------
        
        int[][] numpairs = new int[4][2];
        
        numpairs[0][0] = 10;
        numpairs[0][1] = 15;
        numpairs[1][0] = 12;
        numpairs[1][1] = 22;
        numpairs[2][0] = 53;
        numpairs[2][1] = 20;
        numpairs[3][0] = 25;
        numpairs[3][1] = 14;
        
        
        for (String stooge : stooges)
        {
            System.out.println(stooge);
        }
        
        
        for(int[] numpairarr : numpairs)
        {
            for(int num : numpairarr)
            {
                System.out.print(num + " ");
            }
            System.out.println("");
        }
        
   
        String[] nameArr = null;
        for (String[] arr : names)
        {
            nameArr = arr;
            break;
        }
        
        for (int i = 0; i < nameArr.length; i++)
        {
            System.out.println(names[0][i] + " " + names[1][i]);
        }
          
    }

    public static void main(String[] args)
    {
        //trycatch();
        arraydemo1();
    }

}

