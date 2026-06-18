class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        long sum=0,ssum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            ssum+=(long)nums[i]*nums[i];
        }
        long asum=(long)(n)*(n+1)/2;
        long assum=(long)(n)*(n+1)*(2*n+1)/6;
        long o=0,r=0;
        long s=(assum-ssum);
        long su=(asum-sum);
        long or=s/su;
        r=(su+or)/2;
        o=(or-su)/2;
        return new int[]{(int)o,(int)r};

    }
}