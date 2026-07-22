class Solution {

    static void solve(int k, int n, List<List<Integer>> ans, List<Integer> out, int i){
        if(n<0){
            return;
        }
        if(out.size()==k){
            if(n==0){
                ans.add(new ArrayList<>(out));
                return;
            }
            else{
                return;
            }
        }
        if(i==10){
            return;
        }

        // include
        out.add(i);
        solve(k, n-i, ans, out, i+1);
        //backtrack
        out.remove(out.size()-1);
        //exclude
        solve(k, n, ans, out, i+1);
        return;
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> out = new ArrayList<>();

        solve(k, n, ans, out, 1);
        return ans;
    }
}