package DSA.Sorts;

import java.util.Random;

public class QuickSort {


    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int choosePivot(int left, int right) {
        Random rand = new Random();
        // note Pick 3 random numbers within the range of the array and take their median
        int i1 = left + (rand.nextInt(right - left + 1));
        int i2 = left + (rand.nextInt(right - left + 1));
        int i3 = left + (rand.nextInt(right - left + 1));

        return Math.max(Math.min(i1, i2), Math.min(Math.max(i1, i2), i3));
    }

    public static int partition(int arr[], int left, int right) {
        int pivotInd = choosePivot(left, right); // note Index of pivot
        swap(arr, right, pivotInd);
        int pivot = arr[right];
        int i = (left - 1); // note All the elements less than or equal to the pivot go before or at i

        for (int j = left; j <= right - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right); //note Putting the pivot back in place
        return (i + 1);
    }

    public static void quickSort(int arr[], int left, int right) {
        if (left < right) {
            //note pi is where the pivot is at
            int pi = partition(arr, left, right);

            //note Separately sort elements before and after partition
            quickSort(arr, left, pi - 1);
            quickSort(arr, pi + 1, right);
        }
    }
    public static void main(String args[]) {
        int arr[] = {5,4,1,0,5,95,4,-100,200,0};
        int arrSize = 10;
        quickSort(arr, 0, arrSize - 1);
        System.out.print("Sorted array: ");
        printArray(arr, arrSize);
    }

    private static void printArray(int[] arr, int arrSize) {
        for(int i = 0 ;i <arr.length;i++){
            System.out.println(arr[i]+",");
        }
    }
}
