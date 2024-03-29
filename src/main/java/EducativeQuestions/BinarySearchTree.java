package EducativeQuestions;

public class BinarySearchTree {

    private AVLNode root;

    public AVLNode getRoot() {
        return root;
    }

    public void setRoot(AVLNode root) {
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

    public AVLNode recursiveInsert(AVLNode current, int value)
    {
        if(current==null)
            return new AVLNode(value);

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

    public AVLNode Search(int value)
    {
        if(isEmpty())
            return null;

        return recursiveSearch(root,value);
    }


    public AVLNode recursiveSearch(AVLNode current, int value)
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

    public boolean delete(AVLNode current, int value)
    {
        if(isEmpty())
            return false;

        AVLNode parent=null;
        while(current != null && current.getData()!=value)
        {
            parent=current;
            if(current.getData()>value) {
                current=current.getLeft();
            }
            else {
                current=current.getRight();
            }
        }

        if(current==null){
            return false;
        }
        else if(current.getLeft()==null && current.getRight()==null){
            //then its a leaf node , just remove the node;
            //it could be just the root node also if only node in the tree is root
            if(root.getData()== current.getData()){
                setRoot(null);
                return true;
            }
            else if(current.getData() < parent.getData()){
                parent.setLeft(null);
                return true;
            }
            else{
                parent.setRight(null);
                return true;
            }

        } else if (current.getLeft()==null) {
            //meaning it has 1 child node in right sub tree
            if(root.getData()==current.getData()){
                setRoot(current.getRight());
                return true;
            }else if(current.getData()< parent.getData()){
                parent.setLeft(current.getRight());
                return true;
            }else {
                parent.setRight(current.getRight());
                return true;
            }
        } else if (current.getRight()==null) {

            //1 child node in left subtree
            if(root.getData()== current.getData()){
                setRoot(current.getLeft());
                return true;
            }else if(current.getData()< parent.getData()){
                parent.setLeft(current.getLeft());
                return true;
            }else {
                parent.setRight(current.getLeft());
                return true;
            }
        }else {
            //note It has 2 child nodes, so then first we find the left leaf node in the right sub tree of the current node
            AVLNode leftleaf=leastNode(current.getRight());

            //take the value from the leftleaf
            int temp=leftleaf.getData();
            //now delete the left leaf node;
            delete(root,temp);
            //now set the current nodes value to the value taken from the left leaf node
            current.setData(temp);
            return true;

        }

    }

    private AVLNode leastNode(AVLNode current)
    {
        AVLNode temp=current;
        while(temp.getLeft()!=null){
            temp = temp.getLeft();
        }
        return temp;
    }

    public void printTree(AVLNode current)
    {
        if (current == null) return;

        System.out.print(current.getData() + ",");
        printTree(current.getLeft());
        printTree(current.getRight());

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

    public static void main(String[] args) {
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

}
