package DSA.Sorts;public class MergeSort {

    public static void merge(int arr[], int left, int mid, int right){

        int i,j,k;
        int sizeLeft=mid-left+1;
        int sizeRight=right-mid;

        //note initialising temp arrays left and right
        int[] leftArr=new int[sizeLeft];
        int[] rightArr=new int[sizeRight];

        //note Copying the values from original array to left and right accordingly
        for(i=0;i<sizeLeft;i++)
            leftArr[i]=arr[left+i];
        for(i=0;i<sizeRight;i++)
            rightArr[i]=arr[mid+1+i];

        //note : Now we will merge the left and right temp arrays while ordering the values
        i=0;
        j=0;
        k=left;

        while(i<sizeLeft && j<sizeRight){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }else{
                arr[k]=rightArr[j];
                j++;
            }
            k++;
        }

        //note now we will add remaining values from the left and right array if there are any
        while(i<sizeLeft)
        {
            arr[k]=leftArr[i];
            i++;
            k++;
        }
        while(j<sizeRight)
        {
            arr[k]=rightArr[j];
            j++;
            k++;
        }


    }


    public static void mergeSort(int arr[], int leftIndex, int rightIndex){
        if(leftIndex<0 || rightIndex<0)
            return;


        if(rightIndex>leftIndex)
        {
           int mid=leftIndex + (rightIndex-leftIndex)/2;
            //note recursively split the array into left and right
           mergeSort(arr,leftIndex,mid);
           mergeSort(arr,mid+1,rightIndex);
            //note then we proceed to merge where the actual sorting happens
           merge(arr,leftIndex,mid,rightIndex);
        }

    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,0,5,95,4,-100,200,0};
        int arrSize = 10;
        mergeSort(arr, 0, arrSize - 1);
        System.out.println("MergeSort");
        for(int ele:arr)
        {
            System.out.println(ele+ ",");
        }

    }
}
