class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int re[]={-1,-1};
        int low=0;
        int high=n-1;
        int mid;
       while(low<=high)
        {
            mid=(low+high)/2;
            if(nums[mid]==target)
            {
                if(mid>0 && nums[mid-1]==target)
                {
                    high=mid-1;
                }
                else
                {
                    re[0]=mid;
                    break;
                }
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else 
            {
                low=mid+1;
            }
        }
        low=0;
        high=n-1;
        mid=(low+high)/2;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(nums[mid]==target)
            {
                if(mid< n-1 && nums[mid+1]==target)
                {
                    low=mid+1;
                }
                else
                {
                    re[1]=mid;
                    break;
                }
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else 
            {
                low=mid+1;
            }
        }
        return re;
    }
}