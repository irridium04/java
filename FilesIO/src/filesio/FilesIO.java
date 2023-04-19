/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filesio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author collinshook
 */
public class FilesIO
{



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        String xStrPath = "c:\\x";

        IOCreateDir(xStrPath);
        IOCreateTxtFile(xStrPath, "Red Dead Demensi9on");
        IOReadTxtFile(xStrPath, "Red Dead Demensi9on");
        IODeleteFile(xStrPath, "Red Dead Demensi9on");
        //IODeleteDir(xStrPath);
    }

    static void IOCreateDir(String path)
    {
        Boolean checkDir = false;

        Path xPath = Paths.get(path);

        checkDir = Files.exists(xPath);

        if(checkDir)
        {
            System.out.println("Directory already exists!");
            return;
        }

        try
        {
            Files.createDirectory(xPath);
        }
        catch (IOException ex)
        {
            ex.getLocalizedMessage();
        }
    }


    static void IODeleteDir(String path)
    {
        Path xDeletePath = Paths.get(path);


        try
        {
            Files.delete(xDeletePath);
        }
        catch (IOException ex)
        {
            System.out.println(ex.getLocalizedMessage());
        }
    }

    static void IOCreateTxtFile(String path, String fileName)
    {
        String xFilePath = path + "\\" + fileName + ".txt";

        Path xWritePath = Paths.get(xFilePath);

        boolean fileCheck;
        fileCheck = Files.isRegularFile(xWritePath) & Files.isReadable(xWritePath) & Files.isExecutable(xWritePath);

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

            String text1 = "xx Red Dead Redemption is great xx";
            String text2 = "xx Grand Theft Auto - Kia xx \r\n";


            for (int c = 0; c < 10; c++)
            {
                fw.write(text1);
                fw.newLine();
                fw.write(text2);

            }
            fw.close();
        }
        catch(Exception e)
        {

        }

    }

    static void IOReadTxtFile(String path, String fileName)
    {
        String xFilePath = path + "\\" + fileName + ".txt";
    
        String inputText = "";
        
        Path xReadPath = Paths.get(xFilePath);
        
        boolean fileCheck;
        fileCheck = Files.isRegularFile(xReadPath) & Files.isReadable(xReadPath) & Files.isExecutable(xReadPath);

        if(!fileCheck)
        {
            System.out.println("Bad file!");
            return;
        }
        
        try
        {
            BufferedReader fr = Files.newBufferedReader(xReadPath, StandardCharsets.UTF_16);
            String wholeFile = "";
            
            while((inputText = fr.readLine()) != null)
            {
                wholeFile += inputText + "\n";
                
            }
            
            System.out.println(wholeFile);
        }
        catch(Exception e)
        {
            
        }
    }

    static void IODeleteFile(String path, String fileName)
    {
        String xDeleteFilePath = path + "\\" + fileName + ".txt";
        
        
        Path xDeleteFile = Paths.get(xDeleteFilePath);
        
        
        try
        {
            Files.delete(xDeleteFile);
        }
        catch (IOException ex)
        {
            System.out.println(ex.getLocalizedMessage());        
        }
    }

}
