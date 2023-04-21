package Basics;

public class LinkedListDemo {

    public class SinglylinkedList
    {
        public class Node
        {
            public int data;
            public Node nextNode;
        }

        public Node headNode;
        public int size;

        public SinglylinkedList()
        {
            headNode=null;
            size=0;
        }

        public boolean isEmpty()
        {
            return headNode == null;
        }

    }





    public static void main(String[] args) {

    }
}
