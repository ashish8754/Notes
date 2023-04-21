package Basics;

public class LinkedListDemo {

    public static void main(String[] args) {

        SinglylinkedList Sll=new SinglylinkedList();
        System.out.println(Sll.isEmpty());
        for(int i=0;i<10;i++)
        {
            Sll.insertAtHead(i);
            Sll.printList();
        }

    }
}

