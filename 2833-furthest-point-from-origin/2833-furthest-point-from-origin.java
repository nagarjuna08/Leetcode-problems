class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int fre[]=new int[3];
        int n=moves.length();
        for(int i=0;i<n;i++)
        {
            char x=moves.charAt(i);
            if(x=='L')
            {
                fre[0]++;
            }
            else if(x=='R')
            {
                fre[1]++;
            }
            else
            {
                fre[2]++;
            }
        }
        if(fre[0]>fre[1])
        {
            return fre[0]+fre[2]-fre[1];
        }
        return fre[1]+fre[2]-fre[0];
    }
}