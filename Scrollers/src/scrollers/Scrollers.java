/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scrollers;

/**
 *
 * @author Collin Shook
 */
public class Scrollers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        InitMainFrame();
    }
    
    public static void InitMainFrame()
    {
        FrameStart myF = new FrameStart();
        
        myF.setTitle("Long boi");
        
        myF.setLocationRelativeTo(null);
        
        myF.setVisible(true);
        
    }
}
