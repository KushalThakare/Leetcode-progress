class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> result = new ArrayList<>();

        int startingRow = 0;
        int endingRow = m - 1;
        int startingCol = 0;
        int endingCol = n - 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {
            //rowwise left to right - print starting row from starting col to ending col

            for (int col = startingCol; col <= endingCol; col++) {
                result.add(matrix[startingRow][col]);
            }
            startingRow++;

            //col wise top to bottom - print ending col form startingrow to endingrow

            for (int row = startingRow; row <= endingRow; row++) {
                result.add(matrix[row][endingCol]);
            }
            endingCol--;
            //row wise right to bottom - print ending row from ending column ot start colum
            //valid ending row -> starting row<=endingRow

            if (startingRow <= endingRow) {
                for (int col = endingCol; col >= startingCol; col--) {
                    result.add(matrix[endingRow][col]);
                }
                endingRow--;
            }

            //col wise bottom to top - print starting column from ending row to starting row
            //valid starting col present or not

            if (startingCol <= endingCol) {
                for (int row = endingRow; row >= startingRow; row--) {
                    result.add(matrix[row][startingCol]);
                }

                startingCol++;
            }
        }

        return result;
    }
}