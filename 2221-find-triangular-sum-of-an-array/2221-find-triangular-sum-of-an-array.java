class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            int j=0;
            for(int k=0;k<n-1;k++)
            {
                nums[j]=(nums[k]+nums[k+1])%10;
                j++;
            }
            n=n-1;
        }
        return nums[0];
    }
}