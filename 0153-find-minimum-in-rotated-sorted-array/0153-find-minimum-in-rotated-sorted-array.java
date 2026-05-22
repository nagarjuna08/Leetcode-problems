class Solution {
    public int findMin(int[] nums) 
    {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int mid;    
        int minele=Integer.MAX_VALUE;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(nums[mid]>=nums[low])
            {
                if(nums[mid]>=nums[high])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
            else
            {
                if(nums[mid]<=nums[high])
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            minele=Math.min(minele,nums[mid]);
        }
        return minele;
    }
}