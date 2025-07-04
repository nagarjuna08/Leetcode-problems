class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        int sufix[]=new int [n];
        prefix[0]=nums[0];
        sufix[n-1]=nums[n-1];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
            System.out.println(prefix[i]);
        }
        for(int i=1;i<n;i++)
        {
            sufix[n-i-1]=sufix[n-i]+nums[n-i-1];
            System.out.println(sufix[i]);
        }
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            System.out.println(prefix[i]-sufix[i+1]);
            if((prefix[i]-sufix[i+1])%2==0)
            {
                count++;
            }
        }
        return count;
    }
}