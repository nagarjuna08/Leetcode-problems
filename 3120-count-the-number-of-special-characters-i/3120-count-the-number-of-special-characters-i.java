class Solution {
    public int numberOfSpecialChars(String word) 
    {
        int cap[]=new int[26];
        int sam[]=new int[26];
        for(int i=0;i<word.length();i++)
        {
            char x=word.charAt(i);
            if(x>=65 && x<=90)
            {
                cap[x-65]++;
            }
            else
            {
                sam[x-97]++;
            }
        }
        int count=0;
        for(int i=0;i<26;i++)
        {
            if(cap[i]>0 && sam[i]>0)
            {
                //count+=Math.min(cap[i],sam[i]);
                count++;
            }
        }
        return count;
    }
}