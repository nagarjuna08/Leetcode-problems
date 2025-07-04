class Solution {
    public int maxScore(String s) {
        int n=s.length();
        String []pre=new String[n];
        String []suf=new String[n];
        for(int i=0;i<n;i++)
        {
            String p=s.substring(0,i+1);
            String su=s.substring(i+1,n);
            pre[i]=p;
            suf[i]=su;
        }
        int res=0;
        for(int i=0;i<n;i++)
        {
            int zeros=findzeros(pre[i]);
            int ones=findones(suf[i]);
            System.out.println(pre[i]+" "+suf[i]);
            if(!(pre[i].isEmpty() || suf[i].isEmpty()))
            {
                res=Math.max(res,zeros+ones);
            }
        }
        return res;
    }
    public int findzeros(String x)
    {
        int count=0;
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='0')
            {
                count++;
            }
        }
        return count;
    }
    public int findones(String x)
    {
        int count=0;
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='1')
            {
                count++;
            }
        }
        return count;
    } 
}