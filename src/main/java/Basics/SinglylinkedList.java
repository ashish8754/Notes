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

    boolean searchNode(int data)
    {
        if(isEmpty())
        {
            System.out.println("List is Empty");
            return false;
        }

        Node current=new Node();
        current=this.headNode;
        while(current.nextNode!=null)
        {
            if(current.data==data)
                return true;

            current=current.nextNode;
        }
        return false;
    }
    public void insertAtHead(int data)
    {
        Node newNode=new Node();
        newNode.data=data;

        newNode.nextNode=headNode;
        headNode=newNode;
        size++;
    }

    public void insertAtEnd(int data)
    {
        if(isEmpty())
        {
            insertAtHead(data);
        }
        else
        {
            Node n=new Node();
            Node temp=new Node();
            temp=headNode;
            n.data=data;
            while(temp.nextNode!=null)
            {
                temp=temp.nextNode;
            }
            temp.nextNode=n;
            n.nextNode=null;
            size++;

        }
    }

    void insertAfter(int data, int previous)
    {
        //Worst case if element is not in the list then we will tarverse the whole list atleast once so O(n);

            Node n=new Node();
            Node current=new Node();
            current=this.headNode;
            n.data=data;
            while(current != null && current.data!=previous)
            {
                current=current.nextNode;
            }
            if(current != null)
            {
                n.nextNode=current.nextNode;
                current.nextNode=n;
                size++;
            }



    }

    public void deleteAtHead()
    {
        //O(1) since we are deleting at head
        if(isEmpty())
            return;

        headNode=headNode.nextNode;
        size--;
    }

    public void deleteByValue(int data)
    {

        //In the worst case, you would have to traverse until the end of the list. This means the time complexity will be O(n)

        if(isEmpty())
        {
            System.out.println("Empty List");
            return;
        }

        Node current=this.headNode;
        if(current.data==data)
        {
            deleteAtHead();
            return;
        }

        Node prev=null;
        while(current.nextNode!=null)
        {

            if(current.data==data)
            {
                prev.nextNode=current.nextNode;
                size--;
                return;
            }
            prev=current;
            current=current.nextNode;

        }
        return;
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
