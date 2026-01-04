class Solution {
    public boolean isAnagram(String s, String t) {
        int n=0;
        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();
        Arrays.sort(sA);
        Arrays.sort(tA);
        int i=0,j=0;
        if(sA.length!=tA.length)
        {
            return false;
        }
        while(i<sA.length && j<tA.length)
        {
            if(sA[i]!=tA[j])
            {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}