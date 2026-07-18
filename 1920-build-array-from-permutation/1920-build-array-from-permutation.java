class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length;i++){

            int val = nums[i];
            arr[i] = nums[val];
        }

        return arr;
    }
}