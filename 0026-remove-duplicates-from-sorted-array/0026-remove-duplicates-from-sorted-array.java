class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        // for(int i=0;i<n;i++)
        // {
        //     int j=i+1;
        //     while(j<n)
        //     {
        //         if(nums[i]==nums[j])
        //         {
        //             for(int k=j;k<n-1;k++)
        //             {
        //                 nums[k]=nums[k+1];
        //             }
        //             n--;
        //             j=i+1;
        //         }
        //         else
        //         {
        //             j++;
        //         }
        //     }
        // }
        // return n;
        int j=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}