class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int low=Integer.MIN_VALUE,high=0;
        for(int x: nums)
        {
            high+=x;
            if(x>low)
            {
                low=x;
            }
        }
        int mid=0;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(valid(nums,mid,k))
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return low;
    }
    public boolean valid(int[] nums,int mid, int k)
    {
        int count=1;
        int sum=0;
        for(int x: nums)
        {
            if(sum+x<=mid)
            {
                sum+=x;
            }
            else
            {
                sum=x;
                count++;
            }
        }
        return count>k;
    }
}