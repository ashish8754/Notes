package DSA;

//https://leetcode.com/problems/rotate-array/description/
public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        rotate(arr,k);
    }


    public static void rotate(int[] nums, int k) {
        int len=nums.length;
        int peak=k%nums.length;
        reverse(nums,0,peak-1);
        reverse(nums,peak,nums.length-1);
        reverse(nums,0,nums.length-1);

    }
    public static void reverse(int[] nums,int start,int end)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
