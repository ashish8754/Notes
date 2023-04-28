package Basics;

public class DSADemo {

    public static void main(String[] args) {

        DoublyLinkedList<Integer> DLL=new DoublyLinkedList<>();
        DLL.insertAtHead(5);
        DLL.insertAtHead(4);
        DLL.insertAtHead(7);

        DLL.printList();

        System.out.println("Graph demo ::");
        Graph graphDemo=new Graph(5);
        graphDemo.addEdge(0,1);
        graphDemo.addEdge(0,2);
        graphDemo.addEdge(1,3);
        graphDemo.addEdge(2,3);
        graphDemo.addEdge(2,4);
        graphDemo.addEdge(3,4);
        graphDemo.printGraph();

        TwoStacks<Integer> tS = new TwoStacks<Integer>(5);
        tS.push1(11);
        tS.push1(3);
        tS.push1(7);
        tS.push2(1);
        tS.push2(9);

        System.out.println(tS.pop1());
        System.out.println(tS.pop2());
        System.out.println(tS.pop2());
        System.out.println(tS.pop2());
        System.out.println(tS.pop1());
    }
}

