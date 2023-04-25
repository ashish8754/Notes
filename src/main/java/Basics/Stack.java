package Basics;

public class Stack {

    private int maxSize;
    private int top;
    private int[] arr;

    public Stack(int maxSize)
    {
        this.maxSize=maxSize;
        this.top=-1;
        this.arr=new int[maxSize];
    }

    public int getMaxSize()
    {
        return this.maxSize;
    }

    public boolean isEmpty()
    {
        return top==-1;
    }

    public boolean isFull()
    {
        return top == maxSize-1;
    }

    public void push (int val)
    {
        if(isFull())
        {
            System.out.println("Stack is full.");
            return;
        }

        arr[++top]=val;
    }


    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty.");
            return -1;
        }

        return arr[top--];
    }

}
