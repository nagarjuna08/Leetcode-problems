class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int low=0,high=n-1;
        int mid,res=0;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(mid%2==0)
            {
                if(mid>0 && nums[mid]==nums[mid-1])
                {
                    high=mid-1;
                }
                else if(mid<n-1 && nums[mid]==nums[mid+1])
                {
                    low=mid+1;
                }
                else
                {
                    return nums[mid];
                }
            }
            else
            {
                if(mid>0 && nums[mid]==nums[mid-1])
                {
                    low=mid+1;
                }
                else if(mid<n-1 && nums[mid]==nums[mid+1])
                {
                    high=mid-1;
                }
                else
                {
                    return nums[mid];
                }
            }
            res=nums[mid];
        }
        return res;
    }
}