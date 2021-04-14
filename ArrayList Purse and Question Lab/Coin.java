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
   
   private int amountPenny, amountNickel, amountDime, amountQuarter = 0;

   /**-----------------------------------------------------------------
   *  Sets up the coin by depending on the object.
   */
   public Coin (String type)
   {
      type = type;
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
       return (0.01 * amountPenny) + (0.05 * amountNickel) + (0.1 * amountDime) + (0.25 * amountQuarter);
   }
   
   public void changeValue(int amount)
   {
       if (type.equals("P"))
       {
           amountPenny += amount;
       }
       else if (type.equals("N"))
       {
           amountNickel += amount;
       }
       else if (type.equals("D"))
       {
           amountDime += amount;
       }
       else
       {
           amountQuarter += amount;
       }
   }

   public String getType()
   {
       return type;
   }
}
