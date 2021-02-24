public class AdjacentDupes
{
   public boolean adjacentDupes(int[] arr)
   {
      // Assume no adjacent dupes.
      boolean adjDupes = false;

      // Loop through array, checking for duplicates
      // next to each other.

   }

   public static void main(String[] args)
   {
      int[] arr1 = { 1, 2, 3, 4, 4, 6, 7, 8, 9, 42 };
      int[] arr2 = { 2, 1, 3, 4, 5, 4, 7, 4, 9, 4 };
      AdjacentDupes util = new AdjacentDupes();

      // Check if array 1 has adjacent dupes.
      if (util.adjacentDupes(arr1))
      {
         System.out.println("Array contains adjacent duplicates.");
      }
      else
      {
         System.out.println("Array does NOT contain adjacent duplicates.");
      }
      System.out.println("Expected: Array contains adjacent duplicates.");

      // Check if array 2 has adjacent dupes.
      if (util.adjacentDupes(arr2))
      {
         System.out.println("Array contains adjacent duplicates.");
      }
      else
      {
         System.out.println("Array does NOT contain adjacent duplicates.");
      }
      System.out
            .println("Expected: Array does NOT contain adjacent duplicates.");
   }
}
