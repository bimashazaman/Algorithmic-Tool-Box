import java.util.*;
import java.io.*;

public class StackDemo
{
    public static void main(String args[])
    {
        //creating a stack
        Stack<Integer> stack = new Stack<Integer>();

        //adding elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        //printing the elements of the stack
        System.out.println("initial stack elements: " + stack);

        //removing elements from the stack
        stack.pop();
        System.out.println("after removing an element: " + stack);

        
    }
}