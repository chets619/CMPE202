import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Status here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Status extends Actor
{
    String status = "Welcome to Gumball Machine! Please insert a quarter and click the machine !";
    public Status() {
        super();        
        setMessage("");
    }
    
    
    /**
     * Act - do whatever the Status wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }
    
    public void setMessage(String message) {
        GreenfootImage img = new GreenfootImage(550, 200);
        status += "\n" + message;        
        img.drawString(status, 2, 20);
        setImage(img);
    }
}
