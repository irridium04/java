/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hangman;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


class Key extends JButton
{
    Boolean isPressed = false;

    public Key() {
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setFont(new Font("Monospace", Font.BOLD, 16));
    }

    
    public Boolean getIsPressed() {
        return isPressed;
    }

   
    
    public void Press() // key is pressed
    {
        this.isPressed = true;
        
        if(Hangman.CheckLetter(this.getText())) // word contains letter
        {
            this.setForeground(Color.decode("#00cf29"));
        }
        else // word does not contain letter
        {
            this.setForeground(Color.decode("#cf0000"));
        }
        
    }
    
    
}


class LetterBox extends JLabel
{
    char letter;

    public LetterBox(char letter) {
        this.letter = letter;
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setFont(new Font("Monospace", Font.BOLD, 20));
    }

    public char getLetter() {
        return letter;
    }
    
    public void ShowLetter()
    {
        
        this.setText((letter + "").toUpperCase());
        
        
    }
    
}
/**
 *
 * @author Collin Shook
 */
public class Hangman {

    static JFrame Frame1;
    static JPanel Panel1;
    static JPanel Panel2;
    
    
    static String masterString;
    static ArrayList<LetterBox> boxesList = new ArrayList<>();
    
    static void SetupFrame() // sets up frame
    {
        Frame1 = new JFrame("Collin Shook - Hangman"); // title
        Frame1.setSize(1200, 800); // size
        Frame1.setLocationRelativeTo(null); // center
     
        Frame1.setVisible(true); // sets visible
        Frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    static void SetupKeyboardPanel() // sets up keyboard panel
    {
        
        
        LayoutManager mgr = new LayoutManager() {
            @Override
            public void addLayoutComponent(String name, Component comp) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void removeLayoutComponent(Component comp) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Dimension preferredLayoutSize(Container parent) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Dimension minimumLayoutSize(Container parent) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void layoutContainer(Container parent) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        Frame1.getContentPane().setLayout(mgr);
        Panel1 = new JPanel();
        Panel1.setBounds(0, 450, 1200, 350);
        Panel1.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        Panel1.setBackground(Color.decode("#101e52"));
        Panel1.setVisible(true);
        
        Frame1.add(Panel1);
    }
    
    static void SetupWordPanel() // sets up keyboard panel
    {
//        Frame1.getContentPane().setLayout(null);
        Panel2 = new JPanel();
        Panel2.setBounds(0, 0, 1200, 450);
        Panel2.setBackground(Color.decode("#620096"));
        Panel2.setVisible(true);
        
        Frame1.add(Panel2);
    }
    
    static void AddWordBoxes()
    {
        
        int wordLength = masterString.length();
        
        ArrayList<Integer> wordLengths = GetWordLengths(masterString);
        
        ArrayList<Integer> rowLengths = GetRowLengths(wordLengths);
        System.out.println(wordLengths);
        System.out.println(rowLengths);
        int rows = rowLengths.size();
        int startx;
        int starty = 350 - (30 * rows);
        int i = 0;
        for (int row = 0; row < rows; row++)
        {
            for (int c = 0; c < rowLengths.get(row); c++)
            {
                startx = 600 - (20 * rowLengths.get(row));
                
                if(masterString.charAt(i) != ' ')
                {
    //                
                    System.out.println("Row: " + row + " C: " + c);
                    int x = startx + (40 * c);
                    int y = starty + (60 * row);
                    LetterBox box = new LetterBox(masterString.charAt(i));

                    box.setOpaque(true);

                    box.setText(" ");
                    box.setSize(25, 50);
                    box.setLocation(x, y);


                    box.setForeground(Color.decode("#eeeeee"));
                    box.setBackground(Color.decode("#121212"));

                    box.setVisible(true);
                    Panel2.add(box);
                    boxesList.add(box);

                    Panel2.repaint();
                    
                   
                }
                i++;
            }
        }
    }
    
    
    static void AddLetterBttns() // sets up keyboard
    {
        int x;
        int y = 75;
        
        // keyboard letters
        String row1letters = "QWERTYUIOP";
        String row2letters = "ASDFGHJKL";
        String row3letters = "ZXCVBNM";
        
        
        // creates an object of class key that inherits JButton
        // Iterates and creates all 26 keys
        
        for (int i = 0; i < row1letters.length(); i++)
        {
            x = 212 + (i * 75); // keyboard x spacing
            
            Key key = new Key();
        
            key.setText(row1letters.charAt(i) + "");

            key.setSize(50, 50);
            key.setLocation(x + 25, y);
            
            key.setForeground(Color.decode("#eeeeee"));
            key.setBackground(Color.decode("#121212"));

            key.setVisible(true);
            Panel1.add(key);

            

            // key clicked
            key.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // button press
//                    
                    if(!key.getIsPressed()) // if not pressed already
                    {
                        key.Press();
                    }
                    
                }
            });
        }
        
        y += 75;
        
        for (int i = 0; i < row2letters.length(); i++)
        {
            x = 250 + (i * 75); // keyboard x spacing
            
            Key key = new Key();
        
            key.setText(row2letters.charAt(i) + "");

            key.setSize(50, 50);
            key.setLocation(x + 25, y);
            
            key.setForeground(Color.decode("#eeeeee"));
            key.setBackground(Color.decode("#121212"));

            key.setVisible(true);
            Panel1.add(key);

            

            // key clicked
            key.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // button press
//                    
                    if(!key.getIsPressed()) // if not pressed already
                    {
                        key.Press();
                    }
                    
                }
            });
        }
        
        y += 75;
        
        for (int i = 0; i < row3letters.length(); i++)
        {
            x = 325 + (i * 75); // keyboard x spacing
            
            Key key = new Key();
        
            key.setText(row3letters.charAt(i) + "");

            key.setSize(50, 50);
            key.setLocation(x + 25, y);
            
            key.setForeground(Color.decode("#eeeeee"));
            key.setBackground(Color.decode("#121212"));

            key.setVisible(true);
            Panel1.add(key);

            

            // key clicked
            key.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // button press
//                    
                    if(!key.getIsPressed()) // if not pressed already
                    {
                        key.Press();
                    }
                    
                }
            });
        }
        
        Panel1.repaint();
    }
    
    static void GUISetup()
    {
        SetupFrame();
        SetupWordPanel();
        SetupKeyboardPanel();
        AddLetterBttns();
        AddWordBoxes();
    }
    
    public static boolean CheckLetter(String letter)
    {
        masterString = masterString.toLowerCase(); 
        boolean containsLetter = masterString.contains(letter.toLowerCase());
        for (LetterBox box : boxesList)
        {
            if(String.valueOf(box.getLetter()).equals(letter.toLowerCase())) // if true show letter in box
            {
                box.ShowLetter();
            }
        }
        
        return containsLetter;
    }
    
    
    
    static ArrayList GetWordLengths(String s)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != ' ')
            {
                c++;
            }
            else
            {
                list.add(c + 1);
                c = 0;
            }
        }
        
        list.add(c);
        
        return list;
    }
    
    
    static ArrayList GetRowLengths(ArrayList<Integer> wordLengths)
    {
        ArrayList<Integer> rowLengths = new ArrayList<>();
        
        int c = 0;
        for(int len : wordLengths)
        {
            
            if (c + len < 25)
            {
                c += len;
               
            }
            else
            {
                
                rowLengths.add(c);
                c = len;
            }
            
            
        }
        rowLengths.add(c);
        
        return rowLengths;
    }
    
    
    static void CreatePhrases()
    {
        
        String xStrPath = "C:\\x";
       
        boolean checkDir = false;
        
        Path xPath = Paths.get(xStrPath);
        
        checkDir = Files.exists(xPath);
        
        if(checkDir)
        {
            System.out.println("Directory exists");
            
        }
        else
        {
            try 
            {
                Files.createDirectory(xPath);
            } 
            catch (IOException ex) 
            {
                System.out.println("Error:" + ex);
            }
        }
        
        String xFilePath = xStrPath + "\\phrases.txt";
        
        Path xWritePath = Paths.get(xFilePath);
        
        boolean fileCheck = Files.isRegularFile(xWritePath) & Files.isReadable(xWritePath) & Files.isExecutable(xWritePath);
        
        
        try
        {
            
            BufferedWriter fw = null;
        
            if(fileCheck)
            {
                fw = Files.newBufferedWriter(xWritePath, StandardCharsets.UTF_16, StandardOpenOption.APPEND);
            }
            else
            {
                fw = Files.newBufferedWriter(xWritePath, StandardCharsets.UTF_16, StandardOpenOption.CREATE);
            }   
            
            
            String phrases = "Good Evening Developers\n" +
            "Homage To The Panda\n" +
            "Many weeks of programming will save you hours of planning\n" +
            "A happy little function\n" +
            "Big brain\n" +
            "where would you rather be than right here right now learning how to change the world\n" +
            "for grins and giggles\n" +
            "your roommate bubba";

            for(int i = 0; i < phrases.length(); i++)
            {
                if(phrases.charAt(i) != '\n')
                {
                    fw.write(phrases.charAt(i));
                } 
                else {
                    fw.newLine();
                }
                
                fw.flush();
            }
            
            fw.close();
        }
        catch (IOException eio)
        {
            System.out.println("Error: " + eio.getLocalizedMessage());
        }
        
        
        
        
    }
    
    
    static ArrayList ReadPhraseFile()
    {
        ArrayList<String> phrases = new ArrayList<>();
        
       
        File file = new File("src\\phrases\\phrases.txt");
 
        
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println(ex.getLocalizedMessage());
        }
 
        
        String st;
        
        try 
        {
            while ((st = br.readLine()) != null)
            {
                phrases.add(st);
            }
        } 
        catch (IOException ex) 
        {
            System.out.println(ex.getLocalizedMessage());
        }
        
        System.out.println(phrases);
        return phrases;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> phrases = ReadPhraseFile();
        Random RNG = new Random();
        int phraseIndex = RNG.nextInt(phrases.size());
        
        masterString = phrases.get(phraseIndex).toLowerCase();
        
        GUISetup();
        
    }
    
}
