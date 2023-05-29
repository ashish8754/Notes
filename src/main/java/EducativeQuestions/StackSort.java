package EducativeQuestions;

public class StackSort {

    public static void main(String[] args) {
        Stack<Integer> input=new Stack<>(7);
        input.push(23);
        input.push(60);
        input.push(12);
        input.push(42);
        input.push(4);
        input.push(97);
        input.push(2);

        sortStack(input);

        while(!input.isEmpty()){
            System.out.println(input.pop());
        }
    }

    public static void sortStack(Stack<Integer> stack) {
        // Write -- Your -- Code
        if(stack.isEmpty())
            return;
        //Stack<Integer> tempStack=new Stack<>();
        int[] result=new int[stack.getMaxSize()];
        int i=0;
        //transferring the values to array from stack
        while(!stack.isEmpty()){
            result[i]=stack.pop();
            i++;
        }
        mergeSort(result,0,result.length-1);
        for(int ele:result){
            stack.push(ele);
        }


    }

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

//        while(i<sizeLeft && j<sizeRight){
//            if(leftArr[i]<=rightArr[j]){
//                arr[k]=leftArr[i];
//                i++;
//            }else{
//                arr[k]=rightArr[j];
//                j++;
//            }
//            k++;
//        }

        while(i<sizeLeft && j<sizeRight){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=rightArr[j];
                j++;
            }else{
                arr[k]=leftArr[i];
                i++;
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
}
