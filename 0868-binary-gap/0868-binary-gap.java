class Solution {
    public int binaryGap(int n1) {
        if(Integer.bitCount(n1)==1)
        {
            return 0;
        }
        String bin=Integer.toBinaryString(n1);
        int j=0;
        int maxgap=0;
        int n=bin.length();
        int i=0;
        while(i<n && j<n)
        {
            if(bin.charAt(i)=='1')
            {
                j=i+1;
                while(j<n && bin.charAt(j)=='0')
                {
                    j++;
                }
                if(j==n && bin.charAt(j-1)=='0')
                {
                    continue;
                }
                maxgap=Math.max(maxgap,j-i);
                i=j;
            }
            else 
            {
                i++;
            }
        }
        return maxgap;
    }
}