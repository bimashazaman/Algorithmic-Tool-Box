import java.util.Scanner;
import java.util.HashMap;

//create a class
public class Solution {
    //create a method
public static void main(String[] args) {
    
    //create a scanner 
Scanner scan = new Scanner(System.in);

//string
int N = scan.nextInt();

scan.nextLine(); // gets rid of pesky newline
/* Create and fill HashMap */


HashMap<String, Integer> map = new HashMap();


for (int i = 0; i < N; i++) {
String str = scan.nextLine();
map.merge(str, 1, Integer::sum);
}


/* Query HashMap */
int Q = scan.nextInt();
scan.nextLine(); // gets rid of pesky newline
for (int i = 0; i < Q; i++) {
String str = scan.nextLine();
System.out.println(map.getOrDefault(str, 0));
}
}
}