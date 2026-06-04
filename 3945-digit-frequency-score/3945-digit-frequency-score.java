class Solution {
    public int digitFrequencyScore(int n) {
        int res=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(n>0)
        {
            int x=n%10;
            hm.put(x,hm.getOrDefault(x,0)+1);
            n=n/10;
        }
        for(int x:hm.keySet())
        {
            res+=x*hm.get(x);
        }
        return res;
    }
}