/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listbox;

import java.awt.Color;

/**
 *
 * @author collinshook
 */
public class ListBox
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        ListBoxFrame1 myFrame = new ListBoxFrame1();

        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);
        
        myFrame.getContentPane().setBackground(Color.decode("#121212"));
    }

}
