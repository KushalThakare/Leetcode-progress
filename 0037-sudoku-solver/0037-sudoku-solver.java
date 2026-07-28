class Solution {
    public boolean isSafe(char[][] board, int[] cell, int val){
        //row
        for(int i=0; i<9; i++){
            if(board[cell[0]][i]==(char)(val+'0')){
                return false;
            }
        }
        //column
        for(int i=0; i<9; i++){
            if(board[i][cell[1]]==(char)(val+'0')){
                return false;
            }
        }
        //subbox;

        int strrow = cell[0]-cell[0]%3;
        int strcol = cell[1]-cell[1]%3;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int acrow = strrow + i;
                int accol = strcol + j;

                if(board[acrow][accol]==(char) (val+'0')){
                    return false;
                }
            }
        }

        return true;
    }
    public boolean findempty(char[][] board, int[] cell) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    cell[0] = i;
                    cell[1] = j;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean helper(char[][] board) {
        //base case//if no empty cell...then the soduko is solved
        int[] cell = new int[2];
        if (findempty(board, cell) == false) {
            return true;
        }

        //we add each number from 1 to 9
        for (int val = 1; val < 10; val++) {
            if (isSafe(board, cell, val)) {
                board[cell[0]][cell[1]] = (char) (val + '0');
                if (helper(board)) {
                    return true;
                }
                board[cell[0]][cell[1]] = '.';

            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {

        helper(board);
    }
}