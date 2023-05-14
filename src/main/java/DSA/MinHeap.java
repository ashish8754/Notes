package DSA;

import java.util.Arrays;

public class MinHeap {

    public void minHeapify(int[] HeapArray,int index,int heapSize){

        int smallest=index;

        while(smallest< heapSize/2)
        {
            int left=(2*index)+1;
            int right=(2*index)+2;
            //note : checking if the child value is lesser than parent in which case we swap
            if(left<heapSize && HeapArray[left]<HeapArray[smallest])
                smallest=left;

            if(right < heapSize && HeapArray[right]<HeapArray[smallest])
                smallest=right;

            //note: Swap parent with smallest child node
            if(smallest!=index){
                int temp=HeapArray[index];
                HeapArray[index]=HeapArray[smallest];
                HeapArray[smallest]=temp;
                index=smallest;
            }else
                break;

        }
    }

    public void buildMinHeap(int[] heapArray,int heapSize){
        for(int i=(heapSize-1)/2;i>=0;i--)
            minHeapify(heapArray,i,heapSize);
    }


    public static void main(String[] args) {
        int[] heapArray = { 31, 11, 7, 12, 15, 14, 9, 2, 3, 16 };

        System.out.println("Before heapify: "+ Arrays.toString(heapArray));
        new MinHeap().buildMinHeap(heapArray, heapArray.length);
        System.out.println("After heapify: "+Arrays.toString(heapArray));
    }
}
