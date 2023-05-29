package EducativeQuestions;

public class SearchInsertPosition {
    public static int insertPosition(int arr[], int target)
    {
        // write your code here
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        int[] iparr1={0, 1, 2, 5};
        int[] iparr2={1, 3, 5, 6};
        int[] iparr3={2, 4, 7, 9};

        int[] keys={5,3,4,20};

        int result=insertPosition(iparr3, 20);
    }

}
