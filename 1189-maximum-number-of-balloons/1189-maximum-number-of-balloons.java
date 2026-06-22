class Solution {
    public int maxNumberOfBalloons(String text) {
        int res=0;
        int n=text.length();
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char ch=text.charAt(i);
            hm.put(ch,hm.getOrDefault(ch, 0) + 1);
        }
        boolean x=true;
        while(x)
        {
            if((hm.containsKey('b')&&hm.get('b')>=1)&&(hm.containsKey('a')&&hm.get('a')>=1)&&(hm.containsKey('l')&&hm.get('l')>=2)&&(hm.containsKey('o')&&hm.get('o')>=2)&&(hm.containsKey('n')&&hm.get('n')>=1))
            {
                res++;
                int b=hm.get('b');
                b--;
                hm.put('b',b);
                int a=hm.get('a');
                a--;
                hm.put('a',a);
                int l=hm.get('l');
                l=l-2;
                hm.put('l',l);
                int o=hm.get('o');
                o=o-2;
                hm.put('o',o);
                int nf=hm.get('n');
                nf--;
                hm.put('n',nf);
            }
            else
            {
                x=false;
            }
        }
        return res;
    }
}