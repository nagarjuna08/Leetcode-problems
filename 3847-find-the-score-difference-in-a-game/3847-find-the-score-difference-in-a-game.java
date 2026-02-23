class Solution {
    public int scoreDifference(int[] nums) {
        int fp=0,sp=0;
        boolean f=true,s=false;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
                f=!f;
                s=!s;
                if((i+1)%6==0)
            {
                f=!f;
                s=!s;
                if(f)
                {
                    fp+=nums[i];
                }
                else
                {
                    sp+=nums[i];
                }
            }
                else if(f)
                {
                    fp+=nums[i];
                }
                else
                {
                    sp+=nums[i];
                }
            }
            else
            {
                if((i+1)%6==0)
                {
                f=!f;
                s=!s;
                if(f)
                {
                    fp+=nums[i];
                }
                else
                {
                    sp+=nums[i];
                }
                }
                else
                {

                if(f)
                {
                    fp+=nums[i];
                }
                else
                {
                    sp+=nums[i];
                }
                }
            }
        }
        return fp-sp;
    }
}