

/**
 * Write a description of class AccountDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AccountDriver
{
    public static void main (String [] args)
    {
        Account p1 = new Account ("Homer Simpson" ,0001, 1090.45, 1);
        Account p2 = new Account ("Karri Meirey" , 0002, 786.54, 2);
        Account p3 = new Account ("Bart Simpson", 1564, 4571.60, 1);
        Account p4 = new Account ("Liz Wilson", 1349, 2034.52, 2);
        Account p5 = new Account ("Jack Hagested", 2389, 280.67, 1);
        Account p6 = new Account ("Bill Hagested" , 2391, 1008.53, 2);
        Account p7 = new Account ("Emy Hayes", 3598, 1260.84, 1);
        Account p8 = new Account ("Doug Dralle", 4562, 5783.90, 1);
        Account p9 = new Account ("Eric Willhelm", 3208, 3420.75, 1);
        Account p10 = new Account ("Julie Noris", 4568, 9041.49, 2);
        Account[] people = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
        
        
        
        //for (Account a: people)
           // System.out.println(a);
            
        Sorts.insertionSort(people);
        for (Account a: people)
            System.out.println(a);
        
        //sorted by hash number
        /*
         * 15001551	Emy Hayes	$1,260.84
         * 17403233	Liz Wilson	$2,034.52
         * 18406921	Doug Dralle	$5,783.90
         * 18998380	Julie Noris	$9,041.49
         * 20718988	Karri Meirey	$786.54
         * 20969910	Bart Simpson	$4,571.60
         * 21758522	Jack Hagested	$280.67
         * 21937752	Bill Hagested	$1,008.53
         * 22385827	Eric Willhelm	$3,420.75
         * 23013132	Homer Simpson	$1,090.45
         */
        /*
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p7);
        System.out.println(p8);
        System.out.println(p9);
        System.out.println(p10);
        */
    }
}
