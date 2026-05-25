class Solution {
    public int[] shuffle(int[] nums, int m) {
        int n=nums.length;
        int res[]=new int[n];
        int e=0,o=1;
        for(int i=0;i<m;i++)
        {
            res[e]=nums[i];
            res[o]=nums[m+i];
            e+=2;
            o+=2;
        }
        return res;

    }
}