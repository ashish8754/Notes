package Basics;

public class Queue {

    private int maxSize;
    private int front;
    private int end;
    private int[] arr;
    private int currentSize;

    public Queue(int size)
    {
        this.maxSize=size;
        this.front=0;
        this.end=-1;
        this.arr=new int[maxSize];
        this.currentSize=0;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public boolean isEmpty()
    {
        return currentSize==0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public int top() {
        return arr[front];
    }

    public void enqueue(int value) {
        if (isFull())
            return;
        end = (end + 1) % maxSize; //to keep the index in range
        arr[end] = value;
        currentSize++;
    }

    public int dequeue() {
        if (isEmpty())
            return Integer.MIN_VALUE;

        int temp = arr[front];
        front = (front + 1) % maxSize; //to keep the index in range
        currentSize--;

        return temp;
    }
}
