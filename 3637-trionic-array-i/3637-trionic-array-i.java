class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        int p=0;
        int q=0;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                p=i;
                break;
            }
            if(nums[i]==nums[i+1])
            {
                return false;
            }
        }
        if(p==0)
        {
            return false;
        }
        for(int i=p+1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
            {
                q=i;
                break;
            }
            if(nums[i]==nums[i-1])
            {
                return false;
            }
        }
        for(int i=n-1;i>q;i--)
        {
            if(nums[i]<nums[i-1])
            {
                return false;
            }
             if(nums[i]==nums[i-1])
            {
                return false;
            }
        }
        return p!=0 && q!=0 && q<n&&p>0;
    }
}