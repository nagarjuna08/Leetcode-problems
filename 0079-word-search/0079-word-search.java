class Solution {
    boolean ans=false;
    public boolean exist(char[][] board, String word) {
        boolean arr[][]=new boolean[board.length][board[0].length];
        for(int i = 0; i <board.length ; i++){
            for(int j = 0; j <board[0].length; j++){
                if(board[i][j] == word.charAt(0)){ 
                    find(board, arr, word, i, j, 0);
                    if(ans) return true;
                }
            }
        }
        return ans;
    }
    public void find(char[][] b,boolean arr[][],String word,int i,int j,int si)
    {
        if(si==word.length())
        {
            ans=true;
            return;
        }
        if(i>=0 && i<b.length && j>=0 && j<b[0].length && !arr[i][j] && b[i][j]==word.charAt(si))
        {
            arr[i][j]=true;
           find(b,arr,word,i+1,j,si+1); 
           find(b,arr,word,i,j+1,si+1);
           find(b,arr,word,i-1,j,si+1);
           find(b,arr,word,i,j-1,si+1);
           arr[i][j]=false; 
        }
    }
}