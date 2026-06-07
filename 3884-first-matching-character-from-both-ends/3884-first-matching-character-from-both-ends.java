class Solution {
    public int firstMatchingIndex(String s) 
    {
        int i=0,n=s.length();
        while(i<=s.length()/2)
        {
            char st=s.charAt(i);
            char en=s.charAt(n-i-1);
            if(st==en)
            {
                return i;
            }
            i++;
        }    
        return -1;
    }
}