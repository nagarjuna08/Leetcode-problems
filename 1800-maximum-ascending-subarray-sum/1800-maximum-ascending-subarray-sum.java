class Solution {
    public int maxAscendingSum(int[] nums) {
       int n=nums.length;
       int msum=nums[0];
       for(int i=0;i<n;i++)
       {
        int sum=nums[i];
        for(int j=i+1;j<n;j++)
        {
            if(nums[j]>nums[j-1])
            {
                sum=sum+nums[j];
                msum=Math.max(sum,msum);
            }
            else
            {
                break;
            }
        }
       } 
       return msum;
    }
}