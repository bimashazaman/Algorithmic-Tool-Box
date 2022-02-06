public class SinglyLinkedList<E> {
    //nested node class
    public static class Node<E>
    {
        private E element;
        private Node<E> next;

        //constructor

        public Node(E e, Node<E> n)
        {
            element = e;
            next = n;
        }

        public E getElemet()
        {
            return element;
        }

        public Node<E> getNext()
        {
            return next;
        }

        public void setNext(Node<E> n)
        {
            next = n;
        }
    }


    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    //constructor

    public SinglyLinkedList()
    {
        public int size()
        {
            return size;
        }

        public boolean isEmpty()
        {
            return size == null;
        }

        public E first()
        {
            if(isEmpty())
            {
                return null;
            }
            return head.getElemet();
        }

        public E last()
        {
            if(isEmpty())
            {
                return null;
            }
            return tail.getElemet();
        }

        public void addFirst(E e)
        {
            head = new Node<>(e, head);
            if(size == 0)
            {
                tail = head;
                size++;
            }
        }

        public void addLast(E e)
        {
            Node<E> new_node = new Node<>(e, null);
            if(isEmpty())
            {
                head = new_node;
            }
            else
            {
                tail.setNext(new_node);
                tail  = new_node;
                size++;
            }


        }

        public E RemoveFirst()
        {
            if(isEmpty())
            {
                return null;
            }

            E Answer = head.getNext();
            size--;

            if(size == 0)
            {
                tail = null;
            }
             return Answer;
        }

    }
}