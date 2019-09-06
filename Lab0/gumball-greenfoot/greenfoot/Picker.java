import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Picker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Picker extends Alien
{
    /**
     * Act - do whatever the Picker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void pick() {
        int randomNo = Greenfoot.getRandomNumber(3);
        
        outputBall(randomNo);
    }
    
    public void outputBall(int num) {
        Gumball ball = new GreenGumball();
        switch(num) {
            case 0: 
                ball = new BlueGumball();
                break;
            case 1: 
                ball = new RedGumball();
                break;
            case 2: 
                ball = new GreenGumball();
                break;
        }
        
        GumballWorld world = (GumballWorld) getWorld();
        world.addObject(ball, 500, 500);
        world.getStatus().setMessage(ball.getClass().getName());
    }
}
