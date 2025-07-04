class Solution {
    public int subarraySum(int[] nums) {
        int n=nums.length;
        int start=0;
        int prefix=0;
       // prefix[0]=nums[0];
        for(int i=0;i<n;i++)
        {
            start=Math.max(0,i-nums[i]);
            for(int j=start;j<=i;j++)
            {
                prefix+=nums[j];
            }
            //prefix[i]=prefix[i-1]+sum;
        }
        return prefix;
    }
}