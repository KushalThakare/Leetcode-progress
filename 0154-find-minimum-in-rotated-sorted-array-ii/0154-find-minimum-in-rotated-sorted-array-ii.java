class Solution {
    public int findMin(int[] nums) {
        int str = 0;
        int end = nums.length - 1;

        while (str < end) {
            int mid = str + (end - str) / 2;

            if (nums[mid] > nums[end]) {
                str = mid + 1;
            } else if (nums[mid] < nums[end]) {
                end = mid;
            } else {
                end--;      // discard one duplicate
            }
        }

        return nums[str];
    }
}