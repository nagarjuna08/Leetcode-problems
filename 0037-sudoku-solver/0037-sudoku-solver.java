class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char x=board[i][j];
                if(x=='.')
                {
                    for(char k='1';k<='9';k++)
                    {
                        if(valid(board,k,i,j))
                        {
                            board[i][j]=k;
                            if(solve(board)) return true;
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean valid(char[][] board,char k,int row,int col)
    {
        for(int i=0;i<9;i++)
        {
            if(board[i][col]==k) return false;
            if(board[row][i]==k) return false;
            if(board[3*(row/3) + i/3][3*(col/3)+i%3]==k) return false;
        }
        return true;
    }
}