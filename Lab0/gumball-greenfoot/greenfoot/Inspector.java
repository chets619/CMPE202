import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    private boolean coinValidated = false;
    
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public GumballWorld returnWorld() { 
        return (GumballWorld) getWorld();
    }
    
    public void checkCoin(Actor coin) {
        GumballWorld world = returnWorld();
        
        world.getStatus().setMessage("Inspector checking coin...\n" + coin.toString());
        
        if (coin.getClass() == Quarter.class) {
            coinValidated = true;
            world.getMachine().hasCoin = true;
        } 
    }
    
    public void onCrankTurn() {
      GumballWorld world = returnWorld();
      ArrayList<Picker> pickers = world.getPickers();
      int pickerNum = Greenfoot.getRandomNumber(pickers.size());
        
      Picker pickerChosen = pickers.get(pickerNum);
        
      world.getStatus().setMessage("Chosen Picker:" + pickerChosen.getClass());;
      pickerChosen.pick();
    }
}
