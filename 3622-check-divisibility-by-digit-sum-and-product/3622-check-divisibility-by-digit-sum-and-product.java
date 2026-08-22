class Solution {
    public boolean checkDivisibility(int n) {
        int pro=1,sum=0;
        int m=n;
        while(n>0)
        {
            int l=n%10;
            pro=pro*l;
            sum+=l;
            n/=10;
        }
        return m%(pro+sum)==0;
    }
}