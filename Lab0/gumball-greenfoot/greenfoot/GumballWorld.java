import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class GumballWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballWorld extends World
{

    private Status machineStatus;
    private GumballMachine machine;
    private Inspector inspector;
    private ArrayList<Picker> pickers = new ArrayList<Picker>();
    /**
     * Constructor for objects of class GumballWorld.
     * 
     */
    public GumballWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        machine = new GumballMachine();
        addObject(machine, 367, 237);
        addObject( new Penny(), 57, 71 ) ;
        addObject( new Quarter(), 68, 156 ) ;
        addObject( new FakeQuarter(), 66, 248 ) ;

        inspector = new Inspector();
        addObject(inspector, 533, 291);
        RandomPicker randompicker = new RandomPicker();
        pickers.add(randompicker);
        addObject(randompicker, 643, 104);
        randompicker.setLocation(655, 94);
        GreenPicker greenpicker = new GreenPicker();
        pickers.add(greenpicker);
        addObject(greenpicker, 686, 454);
        greenpicker.setLocation(669, 456);
        
        machineStatus = new Status();
        addObject(machineStatus, 400, 550);
    }
    
    
    public Status getStatus()
    {
        return machineStatus;
    }
    
    public GumballMachine getMachine()
    {
        return machine;
    }
    
    public Inspector getInspector()
    {
        return inspector;
    }
    
    public ArrayList<Picker> getPickers()
    {
        return pickers;
    }
}
