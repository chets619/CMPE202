import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{
    public boolean hasCoin = false;
    
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }

    public void act() 
    {
        if (!hasCoin) {checkCoinInserted();}
        
        if(Greenfoot.mousePressed(this) && hasCoin) {
            crankTurned();
            doneMessage();
        }
    }    
    
    public void checkCoinInserted() {
        Actor coin;
        coin = getOneObjectAtOffset(0, 0, Coin.class);
        
        if (coin != null) {
            GumballWorld world = returnWorld(); 
            world.removeObject(coin);
            
            world.getInspector().checkCoin(coin);
            
        }
    }
    
    public void doneMessage() {
        hasCoin = false;
    }
    
    private void crankTurned() {
        GumballWorld world = returnWorld();            
        world.getInspector().onCrankTurn();
    }
    
    public GumballWorld returnWorld() { 
        return (GumballWorld) getWorld();
    }
}
