class Solution {
    public int[][] generateMatrix(int n) {
        int res[][]=new int[n][n];
        int count=1;
        int left=0,right=n-1;
        int up=0,down=n-1;
        while(left<=right && up<=down)
        {
            for(int i=left;i<=right;i++)
            {
                res[up][i]=count++;
            }
            up++;
            for(int i=up;i<=down;i++)
            {
                res[i][right]=count++;
            }
            right--;
            if(left<=right)
            {
                for(int i=right;i>=left;i--)
                {
                    res[down][i]=count++;
                }
                down--;
            }
            if(up<=down)
            {
                for(int i=down;i>=up;i--)
                {
                    res[i][left]=count++;
                }
                left++;
            }
        }

        return res;
    }
}