class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        int[] hash = new int[n];
        int cnt = 0;

        for (int i = 2; i < n; i++) {
            if (hash[i] == 0) {
                cnt++;

                for (int j = i * 2; j < n; j += i) {
                    hash[j] = 1;
                }
            }
        }

        return cnt;
    }
}