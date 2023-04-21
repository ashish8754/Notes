package Basics;

public class SinglylinkedList {
    public class Node {
        public int data;
        public Node nextNode;
    }

    public Node headNode;
    public int size;

    public SinglylinkedList() {
        headNode = null;
        size = 0;
    }

    public boolean isEmpty() {
        return headNode == null;
    }

    public void insertAtHead(int data)
    {
        Node newNode=new Node();
        newNode.data=data;

        newNode.nextNode=headNode;
        headNode=newNode;
        size++;
    }

    public void printList()
    {
        if(isEmpty())
            System.out.println("List is Empty");
        else
        {
            Node temp = headNode;
            System.out.print("List: ");
            while(temp.nextNode!=null)
            {
                System.out.print(temp.data+" ->");
                temp=temp.nextNode;
            }
            System.out.println(temp.data+ " -> null");

        }
    }


}
