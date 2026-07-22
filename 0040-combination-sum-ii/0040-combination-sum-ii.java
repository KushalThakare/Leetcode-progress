class Solution {
    static void solve(int[] candidates, int ind, int target, List<Integer> outp, List<List<Integer>> ans) {
        //basecase
        //target completed

        if (target < 0) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<>(outp));
            return;
        }
        //index>=size
        if (ind >= candidates.length) {
            return;
        }

        // include
        outp.add(candidates[ind]);
        solve(candidates, ind + 1, target - candidates[ind], outp, ans);
        outp.remove(outp.size() - 1);

        // skip duplicates before exclude
        while (ind < candidates.length - 1 &&
                candidates[ind] == candidates[ind + 1]) {
            ind++;
        }

        // exclude
        solve(candidates, ind + 1, target, outp, ans);
        return;

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> outp = new ArrayList<>();

        solve(candidates, 0, target, outp, ans);
        return ans;
    }
}