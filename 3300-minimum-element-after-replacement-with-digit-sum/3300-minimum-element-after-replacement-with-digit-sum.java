class Solution {
    public int minElement(int[] nums) {
        int res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int x=nums[i];
            int sum=0;
            while(x>0)
            {
                sum+=x%10;
                x=x/10;
            }
            res=Math.min(res,sum);
        }
        return res;
    }
}