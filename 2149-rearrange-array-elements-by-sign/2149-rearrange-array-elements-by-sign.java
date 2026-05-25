class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int e=0,o=1;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                res[e]=nums[i];
                e+=2;
            }
            else
            {
                res[o]=nums[i];
                o+=2;
            }
        }
        return res;
    }
}