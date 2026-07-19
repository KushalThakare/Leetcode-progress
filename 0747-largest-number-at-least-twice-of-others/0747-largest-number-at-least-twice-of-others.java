class Solution {
    public int dominantIndex(int[] nums) {
        int ind=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>nums[ind]){
                ind =i;
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(i!=ind && nums[i]*2>nums[ind]){
                return -1;
            }
        }

        return ind;
    }
}