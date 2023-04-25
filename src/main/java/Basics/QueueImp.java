package Basics;

public class QueueImp {

    private int maxSize;
    private int front;
    private int end;
    private int[] arr;
    private int currentSize;

    public QueueImp(int size)
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
}
