package DSA;

public class CeilandFloorofnumber {
    public static void main(String[] args) {
    int[] arr={2,3,5,9,14,16,18};
    int target=15;

    System.out.println("ceil for target :"+ceilOfNumber(arr,target));
    System.out.printf("floor of the target: "+floorOfNumber(arr,target));

    }

    private static int floorOfNumber(int[] arr, int target) {
        int floor = Integer.MIN_VALUE;
        int start = 0;
        int end = arr.length -1;
        while(start<=end)
        {
            int mid= start + (end-start)/2;
            if(arr[mid]==target)
                return arr[mid];

            if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                floor=arr[mid];
                start=mid+1;
            }
        }
        return arr[end];
    }

    static int ceilOfNumber(int[] arr, int target) {

        int ceil = Integer.MAX_VALUE;
        int start = 0;
        int end = arr.length -1;
        while(start<=end)
        {
            int mid= start + (end-start)/2;
            if(arr[mid]==target)
                return arr[mid];

            if(arr[mid]>target)
            {
                ceil=arr[mid];
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return arr[start];
    }
}
