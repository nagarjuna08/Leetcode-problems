class Solution {
    public int longestConsecutive(int[] nums) {
        int res=1;
        int n=nums.length;
        if(n==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int count=1;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                continue;
            }
            else if(nums[i+1]-nums[i]==1)
            {
                count++;
                res=Math.max(res,count);
            }
            else
            {
                res=Math.max(res,count);
                count=1;
            }
        }
        return res;
    }
}