import java.util.Scanner;

public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    private int gumball_price;
    private int inserted_value;
    private int machineType;

    public GumballMachine( int size, int type )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.machineType = type;
        this.gumball_price = type == 1 ? 25 : 50;
        selectAction();
    }
    
    private int recordTextResponse(String str) {
        StringBuffer string = new StringBuffer();
        string.append(str);
        System.out.println(string);            
        
        Scanner sc = new Scanner(System.in);            
        int option = sc.nextInt();
        
        return option;
    }
    
    private void selectAction() {
        int option = recordTextResponse("Select Action:\n1.Enter Coin\n2.Turn Crank");       
        
        switch(option) {
            case 1:
                acceptCoin();
                break;
            case 2:
                turnCrank();
                break;
            default:
                System.out.println("Invalid Option! Select again...");
                selectAction();
        }
    }
    
    private void acceptCoin() {
        int[] coinArray = new int[]{ 25, 5, 10 };          
        int option = recordTextResponse("Select which coin to enter:\n1.Quarter\n2.Nickel(5 cents)\n3.Dime(10 cents)");
        
        insertCoin(coinArray[option - 1]);
    }

    public void insertCoin(int coin)
    {
        System.out.println(coin);
        
        if (this.machineType != 3 && coin != 25)
            System.out.println("Invalid Coin...Coin returned");
        else {
            this.inserted_value += coin;
            System.out.println("Total Value: " + this.inserted_value);
            selectAction();
        }
    }
    
    public void turnCrank()
    {
        if ( this.inserted_value >= this.gumball_price )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                System.out.println("Coins returned:" + (this.inserted_value - this.gumball_price));
                this.inserted_value = 0 ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
                selectAction();
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert appropriate amount" ) ;
            selectAction();
        }        
    }
}
