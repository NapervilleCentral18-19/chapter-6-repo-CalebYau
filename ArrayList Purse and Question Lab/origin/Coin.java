/**
*  Edit class to fullfill Purse Requirements
*
*  Represents a type of coin.
*/

//import java.util.Random;

public class Coin
{
   //private final int HEADS = 0;
   //private final int TAILS = 1;

   //private int face;
   private int amount;
   private String type;
   
   private int amountP, amountN, amountD, amountQ = 0;

   /**-----------------------------------------------------------------
   *  Sets up the coin by depending on the object.
   */
   public Coin (String type)
   {
      this.type = type;
   }
   
   /*
   //-----------------------------------------------------------------
   //Flips the coin by randomly choosing a face value.
   //
   public void flip ()
   {
      face = (int) (Math.random() * 2);
   }

   //-----------------------------------------------------------------
   //Returns true if the current face of the coin is heads.
   //@return boolean, true if heads
   //
   public boolean isHeads ()
   {
      return (face == HEADS);
   }

   //-----------------------------------------------------------------
   //Returns the current face of the coin as a string.
   //@return String
   //
   public String toString()
   {
      String faceName;
      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";

      return faceName;
   }
   */
   
   public double getValue()
   {
       return (0.01 * amountP) + (0.05 * amountN) + (0.1 * amountD) + (0.25 * amountQ);
   }
   
   public void changeValue(int amount)
   {
       if (type.equals("P"))
       {
           amountP += amount;
       }
       else if (type.equals("N"))
       {
           amountN += amount;
       }
       else if (type.equals("D"))
       {
           amountD += amount;
       }
       else
       {
           amountQ += amount;
       }
   }

   public String getType()
   {
       return type;
   }
}
