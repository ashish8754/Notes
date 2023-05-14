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

//        Graph bfstest=new Graph(5);
//        bfstest.addEdge(0,1);
//        bfstest.addEdge(0,2);
//        bfstest.addEdge(1,3);
//        bfstest.addEdge(1,4);
//        bfstest.printGraph();

//        System.out.println("");
//        Node res=bsT.Search(14);
//        if(res!=null)
//            System.out.println(res.getData());

//        System.out.print("\nDeleting Node 6: ");
//        bsT.delete(bsT.getRoot(),6);
//        bsT.printTree(bsT.getRoot());
//
//        System.out.print("\nDeleting Node 15: ");
//        bsT.delete(bsT.getRoot(),15);
//        bsT.printTree(bsT.getRoot());
//
//        System.out.print("\nDeleting Node 1: ");
//        bsT.delete(bsT.getRoot(),1);
//        bsT.printTree(bsT.getRoot());


        BinarySearchTree BST = new BinarySearchTree();

        BST.add(6);
        BST.add(4);
        BST.add(2);
        BST.add(5);
        BST.add(9);
        BST.add(8);
        BST.add(12);

        BST.printTree(BST.getRoot());   


        System.out.println("");
        System.out.println("Preorder:");
        preOrder(BST.getRoot());

        System.out.println("");
        System.out.println("PostOrder:");
        postOrder(BST.getRoot());

        System.out.println("");
        System.out.println("Inorder:");
        inOrder(BST.getRoot());
    }

    public static void preOrder(AVLNode root)
    {
        if(root==null)
            return ;


        System.out.print(root.getData()+",");
        preOrder(root.getLeft());
        preOrder(root.getRight());


    }

    public static void postOrder(AVLNode root)
    {
        if(root==null)
            return;


        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getData()+",");
    }

    public static void inOrder(AVLNode root)
    {
        if(root==null)
            return;

        inOrder(root.getLeft());
        System.out.print(root.getData()+",");
        inOrder(root.getRight());
    }
}
