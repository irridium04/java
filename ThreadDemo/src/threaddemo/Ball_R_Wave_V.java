/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threaddemo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author Collin Shook
 */
public class Ball_R_Wave_V extends JComponent implements Runnable
{

    // thread characteristics
    volatile Thread ballThread; 
    volatile boolean threadSuspend = false;
    
    
    
    // ball
    int bSize;
    int bXpos;
    int bYpos;
    int bSpeed;
    int bXdir;
    int bYdir;
    
    Color bColor;
    
    int bcWidth;
    int bcHeight;
    int bRise;
    int bRun;
    
    // wave
    
    double wAngle = 0;
    double wVelocity = .01;
    double wAmplitude = 30;
    
    double wX = 0;
    double wY = 0;
    
    
    // speed
    
    long speedInterval;

    public Ball_R_Wave_V(int bSize, int bXpos, int bYpos, int bSpeed, int bcWidth, int bcHeight, int bRise, int bRun) {
        this.bSize = bSize;
        this.bXpos = bXpos;
        this.bYpos = bYpos;
        this.bSpeed = bSpeed;
        this.bcWidth = bcWidth;
        this.bcHeight = bcHeight;
        this.bRise = bRise;
        this.bRun = bRun;
        
        
        bColor = Color.BLUE;
        
        
        ballThread = new Thread(this);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(bColor);
        g.fillOval(bXpos, bYpos, bSize, bSize);
    }
    
    
    void MoveBall()
    {
        if(bXpos > bcWidth - bSize)
        {
            bXdir *= -1;
            bXpos = bcWidth - bSize - 1;
            
            if(bColor == Color.BLUE)
            {
                bColor = Color.RED;
            }
            else
            {
                bColor = Color.BLUE;
            }
        }   
        else if(bXpos <= -1)
        {
            bXdir *= -1;
            bXpos = 0;
            
            bColor = Color.GREEN;
        }
        
        if(bYpos > bcHeight - bSize)
        {
            bYdir *= -1;
            bYpos = bcHeight - bSize;
            
            bColor = Color.ORANGE;
        }   
        else if(bYpos <= -1)
        {
            bYdir *= -1;
            bYpos = 0;
            
            bColor = Color.YELLOW;
        }
        
        bXpos = (int) ((int) wAmplitude * Math.sin(wAngle) / 1 + (bcWidth / 2 - 10));
        
        wAngle += wVelocity;
        
        bYpos += (bYdir * bRise);
        
        
        repaint();
    }
    
    
    
    @Override
    public void run() 
    {
        Thread thisThread = Thread.currentThread();
        
        while(ballThread == thisThread)
        {
            try
            {
                Thread.sleep(speedInterval);
                
                
                synchronized (this) 
                {
                    while(threadSuspend && ballThread == thisThread)
                    {
                        wait();
                    }
                    
                    // put code here
                    
                    MoveBall();
                    
                    // ----------------------------
                }
            }
            catch (InterruptedException e)
            {
                System.out.println("Error" + e.getLocalizedMessage());
            }
        }
    }
    
    
    public synchronized void StartBall()
    {
        threadSuspend = false;
        ballThread.start();
    }
    
    
    public synchronized void StopBall()
    {
        ballThread = null;
        notify();
    }
    
    
    public synchronized void PauseBall()
    {
        threadSuspend = true;
        
    }
    
    public synchronized void ResumeBall()
    {
        threadSuspend = false;
        
    }
    
    
}
