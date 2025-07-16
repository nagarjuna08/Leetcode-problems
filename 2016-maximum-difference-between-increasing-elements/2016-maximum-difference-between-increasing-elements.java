class Solution {
    public int maximumDifference(int[] nums) {
        int i=0,j=1;
        int mdiff=0;
        while(j<nums.length)
        {
            if(nums[i]<nums[j])
            {
                mdiff=Math.max(mdiff,nums[j]-nums[i]);
            }
            else
            {
                i=j;
            }
            j++;
        }
        return mdiff>0 ? mdiff : -1;
    }
}