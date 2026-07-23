class Solution {

    public void solve(int[] nums, boolean[] used, List<Integer> out, List<List<Integer>> ans) {

        // Base case
        if (out.size() == nums.length) {
            ans.add(new ArrayList<>(out));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // If already used, skip
            if (used[i]) {
                continue;
            }

            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            // Include
            used[i] = true;
            out.add(nums[i]);

            solve(nums, used, out, ans);

            // Backtrack
            out.remove(out.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        solve(nums, used, out, ans);

        return ans;
    }
}