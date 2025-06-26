class Solution {
    public boolean isAnagram(String s, String t) {
        int n=0;
        for(int i=0;i<s.length();i++)
        {
            n=n^s.charAt(i);
        }
        for(int i=0;i<t.length();i++)
        {
            n=n^t.charAt(i);
        }
        return n==0;
    }
}