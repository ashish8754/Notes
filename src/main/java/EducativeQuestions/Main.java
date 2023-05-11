package EducativeQuestions;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        QueueUsingStack<Integer> queue = new QueueUsingStack<>(5);
//
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        queue.enqueue(5);
//
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue()); //this will output null because queue will be empty

//        Graph bfstest=new Graph(5);
//        bfstest.addEdge(0,1);
//        bfstest.addEdge(0,2);
//        bfstest.addEdge(1,3);
//        bfstest.addEdge(1,4);
//        bfstest.printGraph();


        BinarySearchTree bsT = new BinarySearchTree();

        bsT.add(6);
        bsT.add(4);
        bsT.add(9);
        bsT.add(5);
        bsT.add(2);
        bsT.add(8);
        bsT.add(12);
        bsT.add(10);
        bsT.add(14);

        bsT.printTree(bsT.getRoot());

        System.out.println("");
        Node res=bsT.Search(14);
        if(res!=null)
            System.out.println(res.getData());



    }
}
