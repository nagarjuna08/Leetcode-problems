class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int res[]=new int[2];
        int n=nums.length;
        int q=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    res[q]=nums[i];
                    q++;
                }
            }
        }
        return res;
    }
}