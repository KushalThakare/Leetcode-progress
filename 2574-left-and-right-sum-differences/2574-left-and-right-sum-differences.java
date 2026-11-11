class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totsum = 0;
        int leftsum = 0;
        for (int i = 0; i < nums.length; i++) {
            totsum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            totsum -= nums[i];
            int diff = Math.abs(totsum - leftsum);
            leftsum += nums[i];
            nums[i] = diff;
        }

        return nums;
    }
}