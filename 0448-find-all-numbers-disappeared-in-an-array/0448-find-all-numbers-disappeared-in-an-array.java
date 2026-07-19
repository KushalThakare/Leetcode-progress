class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        //marking
        for(int i=0; i<nums.length; i++){
            int ind = Math.abs(nums[i])-1;
            nums[ind] = (-1)*Math.abs(nums[ind]);
        }
        //finding ans
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }

        return ans;
    }
}