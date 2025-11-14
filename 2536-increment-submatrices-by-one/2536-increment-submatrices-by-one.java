class Solution {
    public int[][] rangeAddQueries(int n, int[][] q) {
        int res[][]=new int[n][n];
        int m=q.length;
        for(int[] qu: q)
        {
            int x1=qu[0];
            int y1=qu[1];
            int x2=qu[2];
            int y2=qu[3];
            for(int i=x1;i<=x2;i++)
            {
                for(int j=y1;j<=y2;j++)
                {
                    res[i][j]+=1;
                }
            }
        }
        return res;
    }
}