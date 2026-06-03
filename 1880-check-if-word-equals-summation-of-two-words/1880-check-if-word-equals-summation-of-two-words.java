class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int fir=Strvalue(firstWord);
        int sec=Strvalue(secondWord);
        int tar=Strvalue(targetWord);
        return fir+sec==tar;
    }
    public int Strvalue(String str)
    {
        int res=0;
        for(int i=0;i<str.length();i++)
        {
            res=res*10+(int)(str.charAt(i)-'a');
        }
        return res;
    }
}