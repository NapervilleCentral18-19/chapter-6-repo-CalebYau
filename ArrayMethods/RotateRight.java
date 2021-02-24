import java.util.Random;

public class RotateRight
{
	//[1,4,2,5,8,7] rotatesRight to --> [7,1,4,2,5,8]
   public void rotateRight(int[] arr)
   {

   }

   public static void main(String[] args)
   {
      int[] randoms = new int[10];
      RotateRight util = new RotateRight();
      Random generator = new Random();

      // Create a test array containing random numbers.
      for (int i = 0; i < 10; i++)
      {
         randoms[i] = generator.nextInt(100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Rotate the array once to the right.
      util.rotateRight(randoms);

      // Print again to see new order.
      for (int i = 0; i < 10; i++)
      {
         System.out.println(randoms[i] + " ");
      }
      System.out.println();
   }
}
