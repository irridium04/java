/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dynamicframe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Set;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.MouseInputListener;

/**
 *
 * @author Collin Shook
 */
public class DynamicFrame {

    /**
     * @param args the command line arguments
     */
    
    static JFrame Frame1;
    static JPanel Panel1;
    
    static void SetupFrame()
    {
        Frame1 = new JFrame("Example Frame");
        Frame1.setSize(800, 600);
        Frame1.setLocationRelativeTo(null);
     
        Frame1.setVisible(true);
        Frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    static void SetupPanel()
    {
        Frame1.getContentPane().setLayout(null);
        Panel1 = new JPanel();
        Panel1.setBounds(100, 100, 400, 300);
        Panel1.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
        Panel1.setVisible(true);
        
        Frame1.add(Panel1);
    }
    
    static void AddWord(String word, int x, int y, int w, int h)
    {
        for(int i = 0; i < word.length(); i ++)
        {
            JTextField tf = new JTextField();
            tf.setText(word.charAt(i) + "");
            
            tf.setSize(w, h);
            tf.setLocation(x, y);
            
            tf.setVisible(true);
            Panel1.add(tf);
            
            x+= 30;
        }
        
        Panel1.repaint();
    }
    
    static void AddClearButton()
    {
        JButton clrBttn = new JButton();
        
        clrBttn.setText("Clear");
            
        clrBttn.setSize(100, 25);
        clrBttn.setLocation(150, 200);

        clrBttn.setVisible(true);
        Panel1.add(clrBttn);
        
        Panel1.repaint();
        
        clrBttn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel1.removeAll();
                Panel1.repaint();
            }
        });
        
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        SetupFrame();
        SetupPanel();
        AddWord("Bubba", 20, 20, 20, 30);
        AddClearButton();
    }
    
    
}
