import java.util.*;

//creating a class
public class Solution{
    //creating a method
    public static void main(String[] args)
    {
        //creating a scanner
        Scanner scan = new Scanner(System.in);
        //integer
        int n = scan.nextInt();
        scan.nextLine(); // gets rid of pesky newline
        int[] array = new int[n];

        //loop for the array
        for(int i = 0; i < n; i++)
        {
            array[i] = scan.nextInt();
        }
    //creating a hashmap
        scan.close();
        System.out.println(lonelyinteger(array));
    }

//creating a method
    public static int lonelyinteger(int[] a)
    {
        //creating a hashmap
        int val = 0;
        //creating a hashmap
        for(int i = 0; i < a.length; i++)
        {
            val ^= a[i];
        }
        return val;
    }
}