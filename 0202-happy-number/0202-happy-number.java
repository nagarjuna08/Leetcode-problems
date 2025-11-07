import java.util.Hashtable;
class Solution {
    Hashtable<Integer,Integer> h=new Hashtable<>();
    public boolean isHappy(int n) {
        return happy(n);
    }
    public boolean happy(int n)
    {
        int m=n;
        if(n==1)
        {
            return true;
        }
        int sum=0;
        while(n>0)
        {
            int x=n%10;
            sum=sum+x*x;
            n=n/10;
        }
        if(h.containsKey(m))
        {
            return false;
        }
        else
        {
            h.put(m,sum);
        }
        return happy(sum);
    }
}