class Solution {

    public boolean isSafe(int ind, int j, char[][] board, int n){
        int row = ind-1;
        int col = j;
        int offset =1;

        while(row>=0){
            if(board[row][col]=='Q' ||(col-offset>=0 && board[row][col-offset]=='Q')||(col+offset<n && board[row][col+offset]=='Q')){
                return false;
            }
            row--;
            offset++;
        }

        return true;
    }

    public void solve(List<List<String>> ans, char[][] board, int ind, int n){
        //base case
        if(ind==n){
            List<String> row = new ArrayList<>();
            for(int i=0; i<n; i++){
                row.add(new String(board[i]));
            }
            ans.add(row);
            return;
        }

        //for every cell put the queen if safe...
        for(int j =0; j<n; j++){
            if(isSafe(ind, j, board, n)==true){
                //put
                board[ind][j] = 'Q';
                //recurse to next
                solve(ans, board, ind+1, n);
                //remove
                board[ind][j] = '.';
            }
        }

        return;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i=0; i<board.length; i++){
           Arrays.fill(board[i], '.');
        }
        int ind =0;

        solve(ans, board, ind, n);

        return ans;
 
    }
}