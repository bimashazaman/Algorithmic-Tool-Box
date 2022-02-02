






import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
  public static int n;
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int c_neg=0;
        int c_pos=0;
        int c_zero=0;
     for(int i = 0 ; i<n ; i++)
     {
          if(arr[i]<0)
          {
            c_neg+=1;
          }
          if(arr[i]>0)
          {
            c_pos+=1;
          }
          if(arr[i]==0)
          {
            c_zero+=1;
          }
     }
      double pof_pos,pof_neg,pof_zero;
          pof_pos = (double)c_pos/(double)n;
           pof_neg = (double)c_neg/(double)n;
            pof_zero = (double)c_zero/(double)n;
            System.out.println(pof_pos);
             System.out.println(pof_neg);
              System.out.println(pof_zero);
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
         n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        plusMinus(arr);
        scanner.close();
    }
}