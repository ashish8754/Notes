package EducativeQuestions;

public class BinarySearchTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    //note Iterative way to add value in BST
//    public boolean add(int value)
//    {
//        if(isEmpty())
//        {
//            root=new Node(value);
//            return true;
//        }
//
//        Node current=root;
//
//        while(current!= null)
//        {
//            Node left=current.getLeft();
//            Node right=current.getRight();
//
//            if(value<=current.getData())
//            {
//                if(left==null)
//                {
//                    left=new Node(value);
//                    current.setLeft(left);
//                    return true;
//                }
//                current=current.getLeft();
//            }
//            else
//            {
//                if(right==null)
//                {
//                    right=new Node(value);
//                    current.setRight(right);
//                    return true;
//                }
//                 current=current.getRight();
//
//            }
//        }
//        return false;
//    }

    public boolean add(int value)
    {
        root=recursiveInsert(this.root,value);
        return true;
    }

    public Node recursiveInsert(Node current,int value)
    {
        if(current==null)
            return new Node(value);

        if(current.getData() > value)
        {
            current.setLeft(recursiveInsert(current.getLeft(),value));
        } else if(current.getData() < value)
        {
            current.setRight(recursiveInsert(current.getRight(),value));
        }
        else
        {
            return current;
        }

        return current;
    }

    public boolean isEmpty()
    {
        return root==null;
    }

    public Node Search(int value)
    {
        if(isEmpty())
            return null;

        return recursiveSearch(root,value);
    }


    public Node recursiveSearch(Node current,int value)
    {
        if(current==null || current.getData()==value )
            return current;

        if(current.getData()>value)
        {
            return recursiveSearch(current.getLeft(),value);
        }
        else
        {
            return recursiveSearch(current.getRight(),value);
        }


    }

    public void printTree(Node current)
    {
        if (current == null) return;

        System.out.print(current.getData() + ",");
        printTree(current.getLeft());
        printTree(current.getRight());

    }

}
