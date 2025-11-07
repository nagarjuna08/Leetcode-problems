class Solution {
    public int strStr(String h, String ne) {
            int l1=h.length();
            int l2=ne.length();
            int i=0;
            int j=0;
            if(l2>l1) return -1;
            while(i<l1 && j<l2)
            {
                char hx=h.charAt(i);
                char nex=ne.charAt(j);
                if(hx==nex)
                {
                    i++;
                    j++;
                }
                else
                {
                    i=i-j+1;
                    j=0;
                }

            }
            if(j==l2) return i-j;
            return -1;
    }
}