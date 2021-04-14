import java.util.ArrayList;

public class Purse
{
    //private ArrayList
    ArrayList <Coin> change = new ArrayList();
    
    String type;
    
    public Purse (){};
    
    public Purse (Coin acoin)
    {
        add(acoin);
    }
    
    /**
     * precondition: Coin will be initialized (value and name) correctly
     * each variable will have a value
     * postcondition: Puts the Coin into the array list change
     */
    public void add (Coin acoin)
    {
        change.add(acoin);
    }
    
    public void remove (String coin)
    {
        for (int i = 0; i < change.size(); i++)
        {
            if (change.get(i).getType() == coin)
            {
                change.remove(i);
            }
        }
    }
    
    /**
     * Returns the total value of the coins in the array
     * list change
     * @return ???
     */
    public double getTotal()
    {
        int total = 0;
	    
	for (Coin coin: change)
	{
	    total += coin.getValue();
	}
	    
        return total;
    }
        
    /**
     * Returns the all objects in the array list as Strings
     */
    public String toString()
    {
        return getNumberofPenny() + "Pennies\t.01\n" + getNumberofNickels() + "Nickels\t.05\n" + getNumberofDimes() + "Dimes\t.10\n" + getNumberofQuarters() + "Quarters\t.25\n" + "Total " + getTotal();
    }
        
    public int getNumberofDimes()
    {
        int number = 0;
            
        for (Coin coin: change)
        {
            if (coin.getType().equals("D"))
                number += 1;
        }
            
        return number;
    }
    
    public int getNumberofPenny()
    {
        int number = 0;
            
        for (Coin coin: change)
        {
            if (coin.getType().equals("P"))
                number += 1;
        }
            
        return number;
    }
        
    public int getNumberofNickels()
    {
        int number = 0;
            
        for (Coin coin: change)
        {
            if (coin.getType().equals("N"))
                number += 1;
        }
            
        return number;
    }
        
    public int getNumberofQuarters()
    {
        int number = 0;
            
        for (Coin coin: change)
        {
            if (coin.getType().equals("Q"))
                number += 1;
        }
            
        return number;
    }
}
//end of purse
