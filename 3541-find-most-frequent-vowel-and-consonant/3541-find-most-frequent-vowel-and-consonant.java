class Solution {
    public int maxFreqSum(String s) {
        int vcount=0,ccount=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(hm.containsKey(x))
            {
                int v=hm.get(x);
                v++;
                hm.put(x,v);
            }
            else
            {
                hm.put(x,1);
            }
        }
        for( char x : hm.keySet())
        {
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
            {
                vcount=Math.max(vcount,hm.get(x));
            }
            else
            {
                ccount=Math.max(ccount,hm.get(x));
            }
        }
        return vcount+ccount;
    }
}