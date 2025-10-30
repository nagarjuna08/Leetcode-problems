class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        if(n==1) return nums;
        int l=0;
        int r=0;
        while(l<=r && r<n)
        {
            if(nums[l]%2==0)
            {
                l++;
                r++;
            }
            else
            {
                while(r<n && nums[r]%2!=0)
                {
                    r++;
                }
                if(l<n && r<n)
                {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
                }
                l++;
            }
        }
        return nums;
    }
}