class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int low=0,high=n-1;
        int mid,res=0;
        if(n==1) return 0;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(mid>0 && nums[mid]>nums[mid-1] && mid<n-1 && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            else if(mid<n-1 && nums[mid]<nums[mid+1])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
               
            }
            res=mid;
        }
        return res;
    }
}