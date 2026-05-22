class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int [][] res=new int[m][n];
        long left=1,right=1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                res[i][j]=(int)left;
                left=(left*grid[i][j])%12345;
            }
        }
        for(int i=m-1;i>=0;i--)
        {
            for(int j=n-1;j>=0;j--)
            {
                res[i][j]=(int)((long)res[i][j]*right)%12345;
                right=(right*grid[i][j])%12345;
            }
        }
        return res;

    }
}