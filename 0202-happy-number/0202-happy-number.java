class Solution 
{
    public boolean isHappy(int n) 
    {
        Set<Integer> hs=new HashSet<>();
        return happy(n,hs);
    }
    public boolean happy(int n,Set<Integer> hs)
    {
        if(n==1)
        {
            return true;
        }
        int res=0;
        while(n>0)
        {
            int x=n%10;
            res+=x*x;
            n/=10;
        }
        if(!hs.contains(res))
        {
            hs.add(res);
            return happy(res,hs);
        }
        return false;
    }
}