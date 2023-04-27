package Basics;

public class DSADemo {

    public static void main(String[] args) {
                //Stack implementation

//        SinglylinkedList Sll=new SinglylinkedList();
//        System.out.println(Sll.isEmpty());
//        for(int i=0;i<10;i++)
//        {
//            Sll.insertAtEnd(i);
//            Sll.printList();
//        }
//        Sll.printList();
//        System.out.println(Sll.size);
//        SinglylinkedList Sll2=new SinglylinkedList();
//        System.out.println(Sll2.isEmpty());
//        for(int i=0;i<10;i++)
//        {
//            Sll2.insertAtHead(i);
//            Sll2.printList();
//        }
//        System.out.println(Sll2.size);
//        Sll.insertAfter(20,5);
//        Sll.printList();
//        System.out.println(Sll.searchNode(20));
//        Sll.deleteAtHead();
//        Sll.printList();
//        Sll.deleteByValue(6);
//        Sll.printList();

                //Queue implementation
        QueueImp queue = new QueueImp(5);
        //enqueue 2 4 6 8 10 at the end
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(10);
        //dequeue 2 elements from the start
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        //enqueue 12 and 14 at the end
        queue.enqueue(12);
        queue.enqueue(14);

        System.out.println("Queue:");
        while(!queue.isEmpty()){
            System.out.print(queue.dequeue()+" ");
        }


    }


//    public static String[] findBin(int number) {
//        String[] result = new String[number];
//        // Write -- Your -- Code
//
//        QueueImp binarynum=new QueueImp(number+1);
//        binarynum.enqueue("1");
//        for(int i=1;i==number;i++)
//        {
//
//        }
//        return result; //For number = 3 , result = {"1","10","11"};
//    }
}

