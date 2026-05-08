class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int res=Integer.MAX_VALUE;
        int i=0;
        for(;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                res=Math.min(Math.abs(i-start),res);
            }
        }
        return res;
    }
}