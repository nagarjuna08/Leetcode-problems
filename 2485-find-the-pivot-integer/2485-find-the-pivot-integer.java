class Solution {
    public int pivotInteger(int n) {
        int pre[]=new int[n];
        int suf[]=new int[n];
        pre[0]=1;
        suf[n-1]=n;
        for(int i=1;i<n;i++)
        {
            pre[i]=pre[i-1]+(i+1);
            suf[n-i-1]=suf[n-i]+(n-i);
        }
        for(int i=0;i<n;i++)
        {
            if(pre[i]==suf[i])
            {
                return i+1;
            }
        }
        return -1;
    }
}