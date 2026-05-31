class Solution {
    public int maxProduct(int[] nums) {
        int lpro=1,rpro=1;;
        int mpro=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            lpro*=nums[i];
            rpro*=nums[n-i-1];
            mpro=Math.max(mpro,Math.max(lpro,rpro));
            if(lpro==0)
            {
                lpro=1;
            }
            if(rpro==0)
            {
                rpro=1;
            }
        }
        return mpro;
    }
}