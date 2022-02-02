public class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }


}

a = new Node(1);
b = new Node(2);
c = new Node(3);
d = new Node(4);
e = new Node(5);
f = new Node(6);

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.left = f;

+
