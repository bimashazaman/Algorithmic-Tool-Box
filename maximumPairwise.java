
// Input: A sequence of non-negative numbers.

// Output: The maximum value that can be obtained by multiplying two different numbers from the input sequence.

// =>, For example, I’m giving you a sequence of non-negative numbers: a1 . . . . an

// Input format: The first line contains a single number whose value is equal to n. The next line contains n non-negative numbers a1 . . . . an.

// Output format: The maximum pairwise product.

// Sample 1

// Input

// :
// 3
// 1 2 3
// Output

// :
// 6
// Sample 2

// Input:

// 10
// 7 5 14 2 8 8 10 1 2 3
// Output:

// 140
// Naive Method :

// A naive approach is to solve the Maximum Pairwise Product Question is to find all the possible pairs from the sequence which is inputted by the user. A[1 . . . . n] =[a1 . . . . an] and then we have to find the largest product value.

// Logic :

// First, we have to find the two largest values from the inputted sequence. Because we know that the product of the largest value is the maximum product we can get.

// Note: All inputted numbers in the sequence is must be non-negative numbers.








import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
static long getMaxPairwiseProductFast(int[] numbers) {
        int n_Size = numbers.length;
        int max_index1 = -1;
        for (int p = 0; p < n_Size; p++) {
            if ((max_index1 == -1) || (numbers[p] > numbers[max_index1]))
                max_index1 = i;
        }
        int max_index2 = -1;
        for (int k = 0; k < n_Size; k++) {
            if ((k != max_index1) && ((max_index2 == -1) || (numbers[k] > numbers[max_index2])))
                max_index2 = j;
        }
        return (long)numbers[max_index1] * numbers[max_index2];
    }
    public static void main(String[] args) {
        
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println(getMaxPairwiseProductFast(numbers));
     
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}