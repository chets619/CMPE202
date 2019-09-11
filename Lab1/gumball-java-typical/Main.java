import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            GumballMachine gumballMachine;
            StringBuffer string = new StringBuffer();
            string.append("Please enter the number of machine to be used:\n1.Quarter Machine\n2.Two Quarter Machine\n3.All Coins Machine");
            System.out.println(string);            
            
            Scanner sc = new Scanner(System.in);            
            int option = sc.nextInt();    
            
            
            gumballMachine = new GumballMachine(5, option);
	}
}
