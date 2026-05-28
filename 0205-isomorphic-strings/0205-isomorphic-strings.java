class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h1=new HashMap<>();
        HashMap<Character,Character> h2=new HashMap<>();
        int n=s.length();
        int m=t.length();
        if(n!=m)
        {
            return false;
        }
        for(int i=0;i<n;i++)
        {
            char x=s.charAt(i);
            char y=t.charAt(i);
            if((h1.containsKey(x) && h1.get(x)!=y)||(h2.containsKey(y) && h2.get(y)!=x ))
            {
                return false;
            }
            else
            {
                h1.put(x,y);
                h2.put(y,x);
            }
        }
        return true;
    }
}