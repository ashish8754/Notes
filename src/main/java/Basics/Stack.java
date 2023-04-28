package Basics;

public class Stack<V> {

    private int maxSize;
    private int top;
    private V[] arr;

    public Stack(int maxSize)
    {
        this.maxSize=maxSize;
        this.top=-1;
        this.arr=(V[]) new Object[maxSize];
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

    public void push (V val)
    {
        if(isFull())
        {
            System.out.println("Stack is full.");
            return;
        }

        arr[++top]=val;
    }


    public V pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty.");
            return null;
        }

        return arr[top--];
    }

}
