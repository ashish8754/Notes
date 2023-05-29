package DSA;

public class SearchinRotatedArray {

    public static void main(String[] args) {
    int[] arr={7, 8, 9, 0, 3, 5, 6};
    int target=3;
    int ans=search(arr,target);
    System.out.println(ans);
    }


    public static int search(int[] nums, int target) {
        int pivot=findPivot(nums);
        if(pivot == -1)
            return binarySearch(nums,target,0,nums.length-1);

        if(nums[pivot]==target)
            return pivot;

        if(target>=nums[0])
            return binarySearch(nums,target,0,pivot-1);


        return binarySearch(nums,target,pivot+1,nums.length-1);

    }

    public static int findPivot(int[] nums)
    {
        int start=0;
        int end=nums.length-1;
        while(start <= end)
        {
            //Here we take 3 cases
            //case1- that the value after mid is less than the mid value in which case mid is the pivot
            int mid=start + (end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
                return mid;
            //case2 if the mid<mid-1 then the mid is the pivot
            if(mid>start && nums[mid]< nums[mid-1])
                return mid-1;

            //case 3 if above 2 cases are not hit then if the start value <= mid value then since its a rotated sorted array
            //the pivot cannot be in the 2nd half since all the values will be smaller than the start value
            //else the pivot will lie in the 2nd half of array
            if(nums[mid]<=nums[start])
                end=mid-1;
            else
                start=mid+1;

        }
        return -1;
    }

    public static int binarySearch(int[] arr,int target,int start,int end)
    {

        while(start<=end)
        {
            int mid=start + (end-start)/2;
            if(arr[mid]==target)
                return mid;

            if(arr[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
}
