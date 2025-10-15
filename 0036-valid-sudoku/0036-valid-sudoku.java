class Solution {
    public boolean isValidSudoku(char[][] board) {
        return solve(board);
    }
    boolean solve(char[][] board)
    {
       for(int i=0;i<9;i++)
       {
        for(int j=0;j<9;j++)
        {
            if(board[i][j]!='.')
            {
                char x=board[i][j];
                for(int k=0;k<9;k++)
                {
                    if(k!=i && board[k][j]==x) return false;
                    if(k!=j && board[i][k]==x) return false;
                    if((3*(i/3)+k/3)!=i && (3*(j/3)+k%3)!=j )
                    {
                    if(board[3*(i/3)+k/3][3*(j/3)+k%3]==x) return false;
                    }
                }
            }
        }
       }
       return true;
    }
}