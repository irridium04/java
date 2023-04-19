/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bouncyballs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JComponent;
import javax.swing.Timer;

/**
 *
 * @author Collin Shook
 */
public class Ball extends JComponent{
    // position of ball
    float xPos = 0;
    float yPos = 0;
    
    // direction 
    float angle = 315;
    
    float slopeRise;
    float slopeRun;
    
    // panel size
    int panelWidth = 500;
    int panelHeight = 500;
    
    // speed
    int clockDelay = 5;
    int speed = 10;
    // size
    int radius = 25;
    
    // timer
    Timer bTimer;
    
    // color
    Color ballColor;
    
    // random number generator
    Random RNG;

    public Ball() {
        xPos = 1;
        yPos = 1;
        
        RNG = new Random();
        
        ballColor = Color.BLUE;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(ballColor);
        g.fillOval((int)xPos, (int)yPos, radius, radius);
    }
    
    
    public void startBall()
    {
        bClock();
    }
    
    // setters

    public void setxPos(float xPos) {
        this.xPos = xPos;
    }

    public void setyPos(float yPos) {
        this.yPos = yPos;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setBallColor(Color ballColor) {
        this.ballColor = ballColor;
    }

    public void setPanelWidth(int panelWidth) {
        this.panelWidth = panelWidth - radius;
    }

    public void setPanelHeight(int panelHeight) {
        this.panelHeight = panelHeight - radius;
    }
    
    
    
    private void bClock()
    {
        bTimer = new Timer(clockDelay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // check boundaries
                
                if(xPos > panelWidth)
                {
                    float angleOfHit = angle - 270;
                    
                    angle -= (angleOfHit * 2);
                    xPos = panelWidth - 1;
                }
                
                else if(xPos < -1)
                {
                    float angleOfHit = angle - 90;
                    
                    angle -= (angleOfHit * 2);
                    xPos = 0;
                }
                
                if(yPos > panelHeight)
                {
                    float angleOfHit = angle - 180;
                    
                    angle -= (angleOfHit * 2);
                    yPos = panelHeight - 1;
                }
                
                else if(yPos < -1)
                {
                    float angleOfHit = angle - 180;
                    
                    angle -= (angleOfHit * 2);
                    yPos = 0;
                }
                
                slopeRise = (float) Math.sin(DegToRad(angle));
                slopeRun = (float) Math.cos(DegToRad(angle));
                
                xPos += slopeRun * speed;
                yPos += slopeRise * speed;
                
                bTimer.setDelay(RNG.nextInt(100) + 1);
            }
        });
        
        bTimer.start();
    }
    
    
    private float DegToRad(float deg)
    {
        return (float) (deg * (3.141592653 / 180.0));
    }
    
    
    
}
