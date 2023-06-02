package EducativeQuestions;

import DSA.MinHeap;

public class MinCostToJoinPipes {


    public static int minCost(int[] pipes) {
        int cost = 0;
        sort(pipes, pipes.length);
        int currentcost = 0;
        for (int i = 0; i < pipes.length - 1; i++) {
            if (i == 0) {
                currentcost = pipes[i] + pipes[i + 1];
                cost = cost + currentcost;
            } else {
                currentcost = currentcost + pipes[i + 1];
                cost += currentcost;
            }
        }
        return cost;
    }

    /*
    Note Solution using minheap
        We use a MinHeap to solve this problem (implementation is given in MinHeap.java file).
        Start by creating a minHeap of a capacity equal to n and put all the pipes in it (line 6).
        Then iterate through the minHeap until its size equals one (line 8).
        While iterating, extract two minimum length pipes from the minHeap (lines 10-11).
        Then, update the total cost (line 13).
        Next, insert a new pipe in minHeap with a length equal to the sum of the two extracted minimum lengths.
        Finally, return the total minimum cost for connecting all pipes (line 18).
    */


//    static int minCost(int pipes[], int n) {
//
//        int cost = 0;
//        int minimum, secondMinimum;
//        MinHeap minHeap = new MinHeap(pipes, n);
//
//        while (!minHeap.SizeIsOne()) {
//
//            minimum = minHeap.extractMin();
//            secondMinimum = minHeap.extractMin();
//
//            cost += (minimum + secondMinimum);
//
//
//            minHeap.insertKey(minimum + secondMinimum);
//        }
//        return cost;
//    }


    public static void sort(int[] arr,int arrSize){
        int ele, j;
        //Traverse through 1 to size of the array
        for (int i = 1; i < arrSize; i++) {
            ele = arr[i]; // Element to be inserted
            j = i - 1;

            //shifts elements back to create space for the element to be inserted
            while (j >= 0 && arr[j] > ele) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = ele;
        }
    }

    public static void main(String[] args) {
        int[] input={4,3,2,6};
        int result=minCost(input);
        System.out.println(result);
    }
}
