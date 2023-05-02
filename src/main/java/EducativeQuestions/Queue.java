package EducativeQuestions;

public class Queue<V> {

    private int maxSize;
    private int front;
    private int end;
    private V[] arr;
    private int currentSize;

    public Queue(int size)
    {
        this.maxSize=size;
        this.front=0;
        this.end=-1;
        this.arr=(V[]) new Object[maxSize];
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

    public V top() {
        return arr[front];
    }

    public void enqueue(V value) {
        if (isFull())
            return;
        end = (end + 1) % maxSize; //to keep the index in range
        arr[end] = value;
        currentSize++;
    }

    public V dequeue() {
        if (isEmpty())
            return null;

        V temp = arr[front];
        front = (front + 1) % maxSize; //to keep the index in range
        currentSize--;

        return temp;
    }
}
