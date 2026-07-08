class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> ans = new ArrayList<>();

        int i = 0;
        int j = 1;

        while (j < intervals.length) {

            
            if (intervals[j][0] <= intervals[i][1]) {
                intervals[i][1] = Math.max(intervals[i][1], intervals[j][1]);
            }
           
            else {
                ans.add(intervals[i]);
                i = j;
            }

            j++;
        }

        ans.add(intervals[i]);

        return ans.toArray(new int[ans.size()][]);
    }
}