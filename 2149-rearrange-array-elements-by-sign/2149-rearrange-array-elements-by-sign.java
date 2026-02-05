class Solution {
    public int[] rearrangeArray(int[] nums) {
        int po=0,ne=1;
        int n=nums.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                res[po]=nums[i];
                po+=2;
            }
            else
            {
                res[ne]=nums[i];
                ne+=2;
            }
        }
        return res;
    }
}