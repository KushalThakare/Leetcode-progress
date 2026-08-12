class Solution {

    public boolean isValid(char[][] board, int i, int j) {

        // Down
        int ip = i + 1;

        while(ip < 9){
            if(board[ip][j] != '.' && board[i][j] == board[ip][j]){
                return false;
            }
            ip++;
        }

        // Right
        int jp = j + 1;

        while(jp < 9){
            if(board[i][jp] != '.' && board[i][j] == board[i][jp]){
                return false;
            }
            jp++;
        }

        // 3 x 3 box
        int startRow = (i / 3) * 3;
        int startCol = (j / 3) * 3;

        for(int r = startRow; r < startRow + 3; r++){
            for(int c = startCol; c < startCol + 3; c++){

                if(r == i && c == j){
                    continue;
                }

                if(board[r][c] != '.' && board[r][c] == board[i][j]){
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){

                if(board[i][j] == '.'){
                    continue;
                }

                if(!isValid(board, i, j)){
                    return false;
                }
            }
        }

        return true;
    }
}