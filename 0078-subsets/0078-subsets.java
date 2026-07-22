class Solution {
    static void solve(int[] nums, int index, List<Integer> output, List<List<Integer>> ans){
        //base case
        if(index>=nums.length){
            //subsequence is ready
            ans.add(new ArrayList<>(output));
            return;
        }

        //include-exclude
         int curValue = nums[index];
        //include
        output.add(curValue);
        solve(nums, index+1, output, ans);
        //backtracking step: call se waps jate hue we have to remove the curvalue we added in the output
        //so output me se curValue remove;
        output.remove(output.size()-1);

        //exclude
        solve(nums, index+1, output, ans);

       return;

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        solve(nums, 0, output, ans);
        return ans;
    }
}