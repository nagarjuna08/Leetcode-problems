class Solution {
    public int smallestDivisor(int[] nums, int th) {
        Arrays.sort(nums);
        int n=nums.length;
        int low=1,high=nums[n-1];
        int mid;
        int res=Integer.MAX_VALUE;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(solve(nums,mid,th))
            {
                res=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
    public boolean solve(int[] nums, int mid,int t)
    {
        long sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=(nums[i]+mid-1)/mid;
        }
        return sum<=t;
    }
}