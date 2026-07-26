class Solution {
    public void solve(int n, int k, List<List<Integer>> ans, List<Integer> comb, int ind){
        //base case
        if(comb.size()==k){
            ans.add(new ArrayList<>(comb));
            return;
        }

        for(int i= ind; i<=n; i++){
            comb.add(i);
            solve(n, k, ans, comb, i+1);
            comb.remove(comb.size()-1);
        }
        return;
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        solve(n, k, ans, comb, 1);
        return ans;
    }
}