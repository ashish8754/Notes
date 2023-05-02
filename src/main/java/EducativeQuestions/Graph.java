package EducativeQuestions;

import Basics.DoublyLinkedList;

public class Graph {

    int vertices;
    DoublyLinkedList<Integer> adjacencyList[];

    public Graph(int vertices)
    {
        this.vertices=vertices;
        this.adjacencyList=new DoublyLinkedList[vertices];

        for (int i=0;i<vertices;i++)
        {
            adjacencyList[i]=new DoublyLinkedList<>();
        }
    }

    void printGraph()
    {
        System.out.println(">>Adjacency List of Directed Graph<<");
        for (int i = 0; i < vertices; i++)
        {
            if(adjacencyList[i]!=null){
                System.out.print("|" + i + "| => ");

                DoublyLinkedList<Integer>.Node temp = adjacencyList[i].getHeadNode();
                while (temp != null)
                {
                    System.out.print("[" + temp.data + "] -> ");
                    temp = temp.nextNode;
                }
                System.out.println("null");
            }
            else{

                System.out.println("|" + i + "| => "+ "null");
            }
        }
    }

    void addEdge(int source,int destination)
    {

        if(source <vertices && destination<vertices) {
            //this line is for directed graph
            this.adjacencyList[source].insertAtEnd(destination);
            //if we are creating an undirected Graph then we need to add edge from destination to source
            //this.adjacencyList[destination].insertAtEnd(source);
        }
    }
}
