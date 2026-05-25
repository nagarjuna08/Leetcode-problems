class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int ele=nums[0];
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]==ele)
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count<0)
            {
                count=0;
                ele=nums[i];
            }
        }
        return ele;
    }
}