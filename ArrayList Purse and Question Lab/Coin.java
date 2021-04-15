import java.text.DecimalFormat;

/**
*  Edit class to fullfill Purse Requirements
*
*  Represents a type of coin.
*/

public class Coin
{
   private double faceValue;
   private String coinName;
   private int amount;
   private DecimalFormat decForm = new DecimalFormat("$0.00");
  
   /**-----------------------------------------------------------------
   *  Sets up the coin by depending on the object.
   */
   public Coin (String type, double value)
   {
      faceValue = value;
      coinName = type;
      amount = 0;
   }
   
   public double getValue()
   {
       return faceValue;
   }

   public String getType()
   {
       return coinName;
   }
   
   public void changeAmount(int num)
   {
        amount += num;
   }
   
   public int getAmount()
   {
       return amount;
   }
   
   //display value and type 
   public String toString()
   {
       return coinName + "\t" + decForm.format(faceValue);
   }
}
