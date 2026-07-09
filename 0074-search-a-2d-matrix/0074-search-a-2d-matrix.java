class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        int n = totalRow*totalCol;


        int s=0;
        int e = n-1;

        while(s<=e){
            int mid = s + (e-s)/2;

            int rowInd = mid/totalCol;
            int colInd = mid%totalCol;

            if(matrix[rowInd][colInd]==target){
                return true;
            }
            else if(matrix[rowInd][colInd]>target){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return false;
    }
}