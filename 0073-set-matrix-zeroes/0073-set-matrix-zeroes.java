class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        boolean fr = false;
        boolean fc = false;

            //first pass for marking
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 && matrix[i][j] == 0) {
                    fr = true;
                }
                if (j == 0 && matrix[i][j] == 0) {
                    fc = true;
                }

                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        for(int i=1; i<r; i++){
            for(int j =1; j<c; j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(fr==true){
            for(int j=0; j<c; j++){
                matrix[0][j]=0;
            }
        }
        if(fc==true){
            for(int i=0; i<r; i++){
                matrix[i][0]=0;
            }
        }

    }
}