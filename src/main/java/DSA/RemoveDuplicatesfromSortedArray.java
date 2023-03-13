package DSA;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        int ans = removeDuplicates(arr);
    }
    public static int removeDuplicates(int[] nums) {
        int k=0;

        if(nums.length==0)
        {
            return 0;
        }
        else
        {

            int curEle=nums[0];
            int counter=0;
            for(int i =0;i<nums.length;i++)
            {
                if(nums[i]!=curEle)
                {
                    k++;
                    nums[k]=nums[i];
                }
            }
        }

//        for(int i=0;i<nums.length;i++)
//        {
//            int swapCount=0;
//            for(int j=1;j<nums.length-i;j++)
//            {
//                if(nums[j]<nums[j-1])
//                {
//                    int temp=nums[j-1];
//                    nums[j-1]=nums[j];
//                    nums[j]=temp;
//                    swapCount++;
//                }
//            }
//            if(swapCount==0)
//                break;
//        }

        return k+1;

    }
}
