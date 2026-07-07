class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        int sum=0;
        long x=0;
        StringBuffer str=new StringBuffer();
        while(n>0)
        {
            int y=n%10;
            sum+=y;
            if(y!=0)
            {
            str.append(y);
            }
            n=n/10;
        }
        x=Long.parseLong(str.reverse().toString());
        return x*sum;
    }
}