import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private GreenfootImage buttonImage1 = new GreenfootImage( 100, 50);
    private GreenfootImage buttonImage2 = new GreenfootImage( 100, 50);
    private int value;
    private boolean justClicked = false;
    
    public Button()
    {
        GreenfootImage text1 = new GreenfootImage( 100, 50);
        GreenfootImage text2 = new GreenfootImage( 100, 50);
        
        value = 50;
        buttonImage1.setColor(Color.GREEN);
        buttonImage1.fillRect( 0, 0, 100, 50);
        
        Font Helvetic = new Font("Helvetic", Font.BOLD, 30);
        text1.setColor(Color.WHITE);
        text1.setFont(Helvetic);
        text1.drawString(""+ value, text1.getWidth()/3 + 1, text1.getHeight() / 2 + 8);
        buttonImage1.drawImage(text1, 0, 0);
        
        buttonImage2.setColor(Color.ORANGE);
        buttonImage2.fillRect( 0, 0, 100, 50);
        
        text2.setColor(Color.BLACK);
        text2.setFont(Helvetic);
        text2.drawString(""+ value, text2.getWidth()/3 + 1, text2.getHeight() / 2 + 8);
        buttonImage2.drawImage(text2, 0, 0);
        
        setImage(buttonImage1);
    }
    
    public Button( Color noClick, Color click, int v)
    {
        GreenfootImage text1 = new GreenfootImage( 100, 50);
        GreenfootImage text2 = new GreenfootImage( 100, 50);
        
        value = v;
        buttonImage1.setColor(noClick);
        buttonImage1.fillRect( 0, 0, 100, 50);
        
        Font Helvetic = new Font("Helvetic", Font.BOLD, 30);
        text1.setColor(Color.WHITE);
        text1.setFont(Helvetic);
        text1.drawString(""+ value, text1.getWidth()/3 + 1, text1.getHeight() / 2 + 8);
        buttonImage1.drawImage(text1, 0, 0);
        
        buttonImage2.setColor(click);
        buttonImage2.fillRect( 0, 0, 100, 50);
        
        text2.setColor(Color.BLACK);
        text2.setFont(Helvetic);
        text2.drawString(""+ value, text2.getWidth()/3 + 1, text2.getHeight() / 2 + 8);
        buttonImage2.drawImage(text2, 0, 0);
        
        setImage(buttonImage1);
    }
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        HealthBar healthBar = getWorld().getObjects(HealthBar.class).get(0);
        
        if (Greenfoot.mousePressed(this))
        {
            setImage(buttonImage2);
            justClicked = true;
        }
        else if (Greenfoot.mouseClicked(this))
        {
            setImage(buttonImage1);
            if(justClicked = true)
            {
                healthBar.add(value);
                justClicked = false;
            }
        }
    }    
}
