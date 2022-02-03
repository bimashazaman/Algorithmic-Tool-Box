import java.util.*;

public class linkedList
{
    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");


        System.out,println("initial list elements: " + ll);

        ll.remove("B");
        System.out.println("after removing an element: " + ll);

        ll.removeFirst();
        System.out.println("after removing first element: " + ll);

        ll.removeLast();
        System.out.println("after removing last element: " + ll);

        ll.clear();
        System.out.println("after clearing the list: " + ll);



        interator i = ll.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        //remove duplicates from the list
        LinkedList<String> ll1 = new LinkedList<String>();

        ll1.add("A");
        ll1.add("B");
        ll1.add("C");
        ll1.add("D");
        ll1.add("A");
        ll1.add("B");

        System.out.println("initial list elements: " + ll1);

        ll1.removeDuplicates();
        System.out.println("after removing duplicates: " + ll1);

        //delete the middle node
        LinkedList<String> ll2 = new LinkedList<String>();

        ll2.add("A");
        ll2.add("B");
        ll2.add("C");
        ll2.add("D");

        System.out.println("initial list elements: " + ll2);

        ll2.deleteMiddleNode();
        System.out.println("after deleting middle node: " + ll2);

        //sum of two linked lists
        LinkedList<Integer> ll3 = new LinkedList<Integer>();

        ll3.add(1);
        ll3.add(2);
        ll3.add(3);
        ll3.add(4);
        ll3.add(5);

        LinkedList<Integer> ll4 = new LinkedList<Integer>();

        ll4.add(6);
        ll4.add(7);
        ll4.add(8);
        ll4.add(9);
        ll4.add(10);

        System.out.println("initial list elements: " + ll3);

        System.out.println("initial list elements: " + ll4);

        LinkedList<Integer> ll5 = new LinkedList<Integer>();

        ll5 = ll3.sum(ll4);
        System.out.println("sum of two linked lists: " + ll5);

        
    }
}