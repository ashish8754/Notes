package DSA.Sorts;

public class SelectionSort {

    static int findMin(int[] arr,int start,int end){
        if(end<=0 || start<0)
            return 0;

        int minInd=start;
        for(int i=start+1;i<= end;i++){
            if(arr[minInd]>arr[i])
                minInd=i;
        }

        return minInd;
    }

    static int findMax(int[] arr, int start, int end) {
        if (end <= 0 || start < 0)
            return 0;

        int maxInd = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[maxInd] < arr[i])
                maxInd = i;
        }
        return maxInd;
    }

    static void SelectSort(int[] arr)
    {
        int minIndex;

        for(int i=0;i<arr.length;i++)
        {
            minIndex=findMin(arr,i,arr.length-1);
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;

        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,0,5,95,4,-100,200,0};
        SelectSort(arr);
        printArray(arr);
    }

}
