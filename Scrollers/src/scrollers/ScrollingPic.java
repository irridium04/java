/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scrollers;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/**
 *
 * @author Collin Shook
 */
public class ScrollingPic extends JComponent{

    
    BufferedImage img;
    ImageIcon myImage;
    
    int x;
    int y;
    
    public ScrollingPic() {
        LoadImage();
    }

    private void LoadImage() {
        String aPath;
        
        try
        {
            img = ImageIO.read(new File("src\\shapes\\longshape.png"));
            
            System.out.println("Image loaded");
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(img, x, y, this);
    }
    
}
