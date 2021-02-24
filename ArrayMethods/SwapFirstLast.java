import java.util.Random;

public class SwapFirstLast
{
   public void swapFirstLast(int[] arr)
   {

   }

   public static void main(String[] args)
   {
      int[] randoms = new int[10];
      SwapFirstLast util = new SwapFirstLast();
      Random generator = new Random();

      // Create a test array containing random numbers.
      for (int i = 0; i < 10; i++)
      {
         randoms[i] = generator.nextInt(100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Perform the swap.
      util.swapFirstLast(randoms);

      // Print again to see new order.
      for (int i = 0; i < 10; i++)
      {
         System.out.print(randoms[i] + " ");
      }
      System.out.println();
   }
}
