import java.util.Scanner;
/**
 * Write a description of class PurseTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PurseTester
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        
        Purse myPurse = new Purse();
        
        
        
        System.out.println("Enter A – Add a Coin, R – Remove a Coin, S – Show Purse");
        String answer = keyboard.nextLine();
        answer.toUpperCase();
        if (answer.equals("A"))
        {
            System.out.println("Add what type of coin? P - Penny, N – Nickel, D - Dime, Q - Quarter");
            String answer2 = keyboard.nextLine();
            answer2.toUpperCase();
            
            Coin coin = new Coin(answer2);
            
            System.out.println("Enter amount of coin you wish to add");
            int answer3 = keyboard.nextInt();
            
            //System.out.println(coin.getType());
            coin.changeValue(answer3);
            System.out.println(coin.getValue());
            myPurse.add(coin);
            System.out.println(String.format("Total value = $%.2f\n",myPurse.getTotal()));
        }
        else if (answer.equals("R"))
        {
            System.out.println("Remove what type of coin? P - Penny, N – Nickel, D - Dime, Q - Quarter");
            String answer2 = keyboard.nextLine();
            answer2.toUpperCase();
            
            Coin coin = new Coin(answer2);
            
            System.out.println("Enter amount of coin you wish to remove");
            int answer3 = keyboard.nextInt();
            
            coin.changeValue(0 - answer3);
            System.out.println(coin.getValue());
            if(myPurse.getTotal() > coin.getValue())
            {
                myPurse.add(coin);
            }
            else
            {
                System.out.println("Insufficient funds");
            }
        }
        else if (answer.equals("S"))
        {
            System.out.println("My Purse = " + myPurse.toString());
            System.out.println(String.format("Total value = $%.2f\n",
            myPurse.getTotal()));
        }
        
        
    }
}
