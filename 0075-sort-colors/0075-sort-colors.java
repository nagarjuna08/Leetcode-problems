class Solution {
    public void sortColors(int[] nums) 
    {
        int n=nums.length;
        int l=0,m=0,r=n-1;
        while(l<=r && m<=r)
        {
            if(nums[m]==0)
            {
                int temp=nums[l];
                nums[l]=nums[m];
                nums[m]=temp;
                l++;
                m++;
            }
            else if(nums[m]==2)
            {
                int temp=nums[r];
                nums[r]=nums[m];
                nums[m]=temp;
                r--;
            }
            else
            {
                m++;
            }

        }    
    }
}