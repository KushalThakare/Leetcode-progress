class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> exp = new ArrayList<>();
        for(int i = nums[0]; i<=nums[nums.length-1]; i++){
            exp.add(i);
        }
        List<Integer> ans = new ArrayList<>();
        int ind = 0;

        for(int i=0; i<exp.size(); i++){
            if(ind<nums.length && exp.get(i)!=nums[ind]){
                ans.add(exp.get(i));
            }
            else{
                ind++;
            }
        }

        return ans;
    }
}