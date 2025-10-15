class Solution {
    int count=0;
    public int totalNQueens(int n) {
        int arr[][]=new int[n][n];
        solve(arr,n,0);
        return count; 
    }
    public void solve(int [][] arr,int n, int row)
    {
        if(row==n)
        {
            count++;
            return ;
        }
        for(int col=0;col<n;col++)
        {
            if(issafe(row,col,arr,n))
            {
                arr[row][col]=1;
                solve(arr,n,row+1);
                arr[row][col]=0;
            }
        }
    }
    public boolean issafe(int row,int col,int arr[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i][col]==1) return false;
        }
        int r=row,c=col;
        while(r>=0 && c>=0)
        {
            if(arr[r][c]==1) return false;
            r--;
            c--;
        }
        r=row;c=col;
        while(r>=0 && c<n)
        {
            if(arr[r][c]==1) return false;
            r--;
            c++;
        }
        return true;
    }
}