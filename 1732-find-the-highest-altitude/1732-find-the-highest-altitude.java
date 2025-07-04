class Solution {
    public int largestAltitude(int[] gain) {
        int pre[]=new int[gain.length +1];
        pre[0]=0;
        int res=0;
        for(int i=0;i<gain.length;i++)
        {
            pre[i+1]=pre[i]+gain[i];
            if(res<pre[i+1])
            {
                res=pre[i+1];
            }
        }
        return res;
    }
}