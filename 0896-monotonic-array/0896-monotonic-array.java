class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc=true,dec=true;
        int n=nums.length;
        if(n==1)
        {
            return true;
        }
        for(int i=1;i<n;i++)
        {
            if(!inc && !dec)
            {
                return false;
            }
            if(nums[i-1]>nums[i])
            {
                inc=false;
            }
            if(nums[i-1]<nums[i])
            {
                dec=false;
            }
        }
        return inc||dec;
    }
}