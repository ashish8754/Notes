package DSA;

public class FirstandLastPosofElem {
    public static void main(String[] args) {

    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int first=searchIndex(nums,target,true);
        int last=searchIndex(nums,target,false);
        ans[0]=first;
        ans[1]=last;

        return ans;
    }

    static int[] searchRangeInfiniteArr(int[] nums,int target)
    {
        int start=0;
        int end=1;
        int [] ans={-1,-1};

        while(target > nums[end])
        {
            start=end+1;
            end=end + (end-start+1)*2;
            ans[0]=searchIndexInfinite(nums,target,start,end,true);
            ans[1]=searchIndexInfinite(nums,target,start,end,false);
        }
        return ans;
    }

    static int searchIndex(int[] nums,int target , boolean isFirstOcc)
    {
        int start=0;
        int end=nums.length -1;
        int ans=-1;
        while(start <=end)
        {
            int mid=start+ (end-start)/2;
            if(nums[mid]< target)
            {
                start=mid+1;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                ans=mid;
                if(isFirstOcc)
                    end=mid-1;
                else
                    start=mid+1;

            }

        }
        return ans;
    }

    static int searchIndexInfinite(int[] nums,int target ,int start,int end, boolean isFirstOcc)
    {

        int ans=-1;
        while(start <=end)
        {
            int mid=start+ (end-start)/2;
            if(nums[mid]< target)
            {
                start=mid+1;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                ans=mid;
                if(isFirstOcc)
                    end=mid-1;
                else
                    start=mid+1;

            }

        }
        return ans;
    }
}
