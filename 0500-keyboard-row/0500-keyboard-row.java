class Solution {
    public String[] findWords(String[] words) {
        int[] rowno = {1,2,2,1,0,1,1,1,0,1,1,1,2,2,0,0,0,0,1,0,0,2,0,2,0,2};

        String[] ans = new String[words.length];
        int ind = 0;

        for (int i = 0; i < words.length; i++) {
            String upper = words[i].toUpperCase();

            int start = rowno[upper.charAt(0) - 'A'];
            boolean flag = true;

            for (int j = 1; j < upper.length(); j++) {
                if (rowno[upper.charAt(j) - 'A'] != start) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                ans[ind++] = words[i];
            }
        }

        return Arrays.copyOf(ans, ind);
    }
}