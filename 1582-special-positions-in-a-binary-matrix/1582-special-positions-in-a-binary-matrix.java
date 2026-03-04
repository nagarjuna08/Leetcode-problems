class Solution {
    public int numSpecial(int[][] mat) {
        int one=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    if(check(mat,mat.length,mat[0].length,i,j))
                    {
                        one++;
                    }
                }
            }
        }
        return one;

    }
        public boolean check(int[][] mat,int m,int n,int r,int c)
        {
            int anscol=0;
            int ansrow=0;
            for(int i=0;i<m;i++)
            {
                if(mat[i][c]==1)
                {
                    anscol++;
                }
            }
            for(int i=0;i<n;i++)
            {
                if(mat[r][i]==1)
                {
                    ansrow++;
                }
            }
            return ansrow==1 && anscol==1;
        }
}