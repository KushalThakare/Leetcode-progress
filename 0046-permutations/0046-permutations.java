class Solution {

    public void solve(int[] nums, List<Integer> out, List<List<Integer>> ans){
        //if out size is equal to ans, then we found a permut...add in ans
        if(out.size()==nums.length){
            ans.add(new ArrayList<>(out));
        }
        for(int i = 0; i<nums.length; i++){
            if(out.indexOf(nums[i])==-1){
                out.add(nums[i]);
                solve(nums, out, ans);
                out.remove(out.size()-1);
            }
        }

        return;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> out = new ArrayList<>();

        solve(nums, out, ans);
        return ans;
    }
}