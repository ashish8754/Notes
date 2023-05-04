package EducativeQuestions;

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

        Graph bfstest=new Graph(5);
        bfstest.addEdge(0,1);
        bfstest.addEdge(0,2);
        bfstest.addEdge(1,3);
        bfstest.addEdge(1,4);
        bfstest.printGraph();



    }
}
