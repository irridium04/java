/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylists;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author collinshook
 */
public class ArrayLists
{
/**
     * @param myArrList
 */


public static void printArrayList(ArrayList myArrList)
{
    for (int i = 0; i < myArrList.size(); i++)
    {
        System.out.println((i + 1) + ". " + myArrList.get(i));
    }
}

public static void printArray(String[] myArr)
{
    for (int i = 0; i < myArr.length; i++)
    {
        System.out.println((i + 1) + ". " + myArr[i]);
    }
}

public static void main(String[] args)
{
    ArrayList<String> cars = new ArrayList();

    cars.add("Ford");
    cars.add("Chevy");
    cars.add("Dodge");

    System.out.println(cars.get(2));

    int c = 1;
    for (String car : cars)
    {
        System.out.println(c + ". " + car);
        c++;
    }
    cars.forEach((n) ->
    {
        System.out.println(n);
    });
    System.out.println("");

    // sorting lists
    Collections.sort(cars);

    cars.forEach((n) ->
    {
        System.out.println(n);
    });
    System.out.println("");

    Collections.reverse(cars);
    cars.forEach((n) ->
    {
        System.out.println(n);
    });
    
    System.out.println("");

    
    cars.add(0, "Toyota");

    c = 1;
    for (String car : cars)
    {
        System.out.println(c + ". " + car);
        c++;
    }
    
    System.out.println("");
    
    cars.remove("Toyota");
    
    cars.forEach((n) ->
    {
        System.out.println(n);
    });
    
    System.out.println("");

    
    cars.remove(1);
    
    cars.clear();
}

}
