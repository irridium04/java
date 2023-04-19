/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzaordering;

import java.awt.Color;

/**
 *
 * @author collinshook
 */
public class PizzaOrdering
{

/**
 * @param args the command line arguments
 */
public static void main(String[] args)
{
    PizzaForm myFrame = new PizzaForm();
    myFrame.setVisible(true);
    myFrame.setLocationRelativeTo(null);

    myFrame.getContentPane().setBackground(Color.decode("#dba24a"));

    myFrame.setTitle("Pizza Builder - Collin S");
}

}
