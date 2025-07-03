class Solution {
    public char kthCharacter(int k) {
        return kth("a",k);
    }
    public char kth(String a,int k)
    {
        if(a.length()<=k)
        {
        StringBuilder d=new StringBuilder();
        for(int i=0;i<a.length();i++)
        {
            char x=a.charAt(i);
            x++;
            d.append(x);
        }
        String r=d.toString();
        a=a+r;
        return kth(a,k);
        }
        return a.charAt(k-1);
    } 
}