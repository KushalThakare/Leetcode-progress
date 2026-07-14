class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> scores = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        int ans = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = scores.get(s.charAt(i));

            if (curr < prev) {
                ans -= curr;
            } else {
                ans += curr;
            }

            prev = curr;
        }

        return ans;
    }
}
