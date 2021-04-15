import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Purse
{
    //private ArrayList
    private ArrayList<Coin> pocket = new ArrayList<>();
    private Coin penny = new Coin("Penny",0.01);
    private Coin nickel = new Coin("Nickel",0.05);
    private Coin dime = new Coin("Dime",0.10);
    private Coin quarter = new Coin("Quarter",0.25);
    private DecimalFormat decForm = new DecimalFormat("$0.00");
    
    //Create a purse class/object and populate with at least 5 coins equaling more than a dollar.
    public Purse ()
    {
        pocket.add(penny);
        pocket.add(nickel);
        pocket.add(dime);
        pocket.add(quarter);
        penny.changeAmount(5);
        nickel.changeAmount(4);
        dime.changeAmount(3);
        quarter.changeAmount(2);
    }
    
    public int getNumberOfPenny()
    {
        return penny.getAmount();
    }
    
    public void setNumberOfPenny(int num)
    {
        penny.changeAmount(num);
    }
    
    public int getNumberOfNickels()
    {
        return nickel.getAmount();
    }
    
    public void setNumberOfNickels(int num)
    {
        nickel.changeAmount(num);
    }
    
    public int getNumberOfDimes()
    {
        return dime.getAmount();
    }
    
    public void setNumberOfDimes(int num)
    {
        dime.changeAmount(num);
    }
    
    public int getNumberOfQuarters()
    {
        return quarter.getAmount();
    }
    
    public void setNumberOfQuarters(int num)
    {
        quarter.changeAmount(num);
    }
    
    //calculate total
    public double getTotal()
    {
        double total = 0;
        
        total += getNumberOfPenny() * penny.getValue();
        total += getNumberOfNickels() * nickel.getValue();
        total += getNumberOfDimes() * dime.getValue();
        total += getNumberOfQuarters() * quarter.getValue();
        
        return total;
    }
    
    //display total number of each coin and total amount in purse
    public String toString()
    {
        
        return "\n" + getNumberOfPenny() + " " + penny.toString() + "\n" 
        + getNumberOfNickels() + " " + nickel.toString() + "\n" 
        + getNumberOfDimes() + " " + dime.toString() + "\n"
        + getNumberOfQuarters() + " " + quarter.toString() + "\n"
        + "Total " + decForm.format(getTotal());
    }
}
//end of purse
