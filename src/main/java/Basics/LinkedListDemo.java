package Basics;

public class LinkedListDemo {

    public static void main(String[] args) {

        SinglylinkedList Sll=new SinglylinkedList();
        System.out.println(Sll.isEmpty());
        for(int i=0;i<10;i++)
        {
            Sll.insertAtEnd(i);
            Sll.printList();
        }
        Sll.printList();
        System.out.println(Sll.size);


//        SinglylinkedList Sll2=new SinglylinkedList();
//        System.out.println(Sll2.isEmpty());
//        for(int i=0;i<10;i++)
//        {
//            Sll2.insertAtHead(i);
//            Sll2.printList();
//        }
//        System.out.println(Sll2.size);

        Sll.insertAfter(20,5);
        Sll.printList();
        System.out.println(Sll.searchNode(20));
        Sll.deleteAtHead();
        Sll.printList();
        Sll.deleteByValue(6);
        Sll.printList();

    }
}

