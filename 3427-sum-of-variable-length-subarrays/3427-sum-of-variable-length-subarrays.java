class Solution {
    public int subarraySum(int[] nums) {
        int n=nums.length;
        int start=0;
        int prefix[]=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            start=Math.max(0,i-nums[i]);
            int sum=0;
            for(int j=start;j<=i;j++)
            {
                sum+=nums[j];
            }
            prefix[i]=prefix[i-1]+sum;
        }
        return prefix[n-1];
    }
}