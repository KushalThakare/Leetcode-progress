class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[2];

        int countmax = 0;

        for (int m = mat.length - 1; m >= 0; m--) {
            int curcount = 0;
            for (int i = 0; i < mat[0].length; i++) {
                if (mat[m][i] == 1) {
                    curcount++;
                }
            }

            if (curcount >=countmax) {
                ans[0] = m;
                countmax = curcount;
            }

        }

        ans[1] = countmax;

        return ans;

    }
}