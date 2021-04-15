
import java.util.Scanner;
/**
 * Write a description of class PurseTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PurseTester
{
    static boolean exit = true;
    static Scanner keyboard = new Scanner(System.in);
    static Purse purse = new Purse();
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        /*
        Coin penny = new Coin("Penny",0.01);
        Coin nickel = new Coin("Nickel",0.05);
        Coin dime = new Coin("Dime",0.10);
        Coin quarter = new Coin("Quarter",0.25);
        Coin half_dollar = new Coin("Half Dollar",0.50);
        penny.changeAmount(1);
        dime.changeAmount(5);
        dime.changeAmount(-2);
        System.out.println(penny.toString());
        System.out.println(penny.getType());
        System.out.println(penny.getValue());
        System.out.println(penny.getAmount());
        System.out.println(nickel.toString());
        System.out.println(nickel.getAmount());
        System.out.println(dime.toString());
        System.out.println(dime.getAmount());
        System.out.println(quarter.toString());
        System.out.println(quarter.getAmount());
        System.out.println(half_dollar.toString());
        
        Purse myPurse = new Purse();
        System.out.println(myPurse.getTotal());
        System.out.println(myPurse.toString());
        */

        //loop that keeps person in menu until exit
        System.out.println("Welcome to the menu.");
        while (exit)
        {
            menu();
        }
        System.out.println("\nExiting program.");
    }
    
    //creates a menu with options
    private static void menu()
    {
        System.out.println("Choose an option" + 
        "\nA – Add a Coin" + 
        "\nR – Remove a Coin" +
        "\n? – Display Purse" +
        "\nQ - Quit");
        
        String ans = keyboard.next();
        String answer = ans.toUpperCase();
        if (answer.equals("A") || answer.equals("R"))
        {
            System.out.println("Enter P - Penny, N – Nickel, D - Dime, Q - Quarter");
            String ans2 = keyboard.next();
            String answer2 = ans2.toUpperCase();
            System.out.println("Enter amount to add/remove");
            int answer3 = keyboard.nextInt();
            if (answer.equals("R"))
                answer3 = 0 - answer3;
                
            if (answer2.equals("P"))
            {
                int test = purse.getNumberOfPenny() + answer3;
                if (test < 0)
                {
                    answer3 = 0 - purse.getNumberOfPenny();
                }
                purse.setNumberOfPenny(answer3);
            }
            else if (answer2.equals("N"))
            {
                int test = purse.getNumberOfNickels() + answer3;
                if (test < 0)
                {
                    answer3 = 0 - purse.getNumberOfNickels();
                }
                purse.setNumberOfNickels(answer3);
            }
            else if (answer2.equals("D"))
            {
                int test = purse.getNumberOfDimes() + answer3;
                if (test < 0)
                {
                    answer3 = 0 - purse.getNumberOfDimes();
                }
                purse.setNumberOfDimes(answer3);
            }
            else if (answer2.equals("Q"))
            {
                int test = purse.getNumberOfQuarters() + answer3;
                if (test < 0)
                {
                    answer3 = 0 - purse.getNumberOfQuarters();
                }
                purse.setNumberOfQuarters(answer3);
            }
        }
        else if (answer.equals("?"))
            System.out.println(purse.toString());
        else if (answer.equals("Q"))
            exit = false;
        else
            System.out.println("Error. Not an option. Returning to menu.");
    }
}
/*
output

Welcome to the menu.
Choose an option
A – Add a Coin
R – Remove a Coin
? – Display Purse
Q - Quit
?

5 Penny	$0.01
4 Nickel	$0.05
3 Dime	$0.10
2 Quarter	$0.25
Total $1.05
Choose an option
A – Add a Coin
R – Remove a Coin
? – Display Purse
Q - Quit
a
Enter P - Penny, N – Nickel, D - Dime, Q - Quarter
n
Enter amount to add/remove
2
Choose an option
A – Add a Coin
R – Remove a Coin
? – Display Purse
Q - Quit
r
Enter P - Penny, N – Nickel, D - Dime, Q - Quarter
q
Enter amount to add/remove
2
Choose an option
A – Add a Coin
R – Remove a Coin
? – Display Purse
Q - Quit
?

5 Penny	$0.01
6 Nickel	$0.05
3 Dime	$0.10
0 Quarter	$0.25
Total $0.65
Choose an option
A – Add a Coin
R – Remove a Coin
? – Display Purse
Q - Quit
q

Exiting program.
*/