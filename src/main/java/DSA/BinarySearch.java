package DSA;

public class BinarySearch {
    public static void main(String[] args) {
    int[] arr={1,5,7,9,24,28,36,57,65,93};
    int[] arr2={93,65};
    int target =65;
    System.out.println("Element found at index : "+binarySearch(arr2,target));

    }

    static int binarySearch(int[] arr, int target)
    {

        int start =0;
        int end =arr.length -1;

        boolean isAsc= arr[start]<arr[end];

        while(start<=end)
        {
            int mid=start + (end-start)/2;//to avoid the possibility of exceeding the int range when adding 2 very large number

            if(arr[mid]==target)
                return mid;

            if(isAsc)
            {
                if(arr[mid]< target)
                {
                    start = mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
            else {
                if(arr[mid]> target)
                {
                    start = mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }

        }
        return -1;

    }
}
