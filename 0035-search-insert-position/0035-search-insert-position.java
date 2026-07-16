class Solution {
    public int searchInsert(int[] nums, int target) {
        int str =0;
        int end = nums.length-1;

        while(end>=str){
            int mid = str + (end-str)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                str = mid+1;
            }
        }

        return str;
    }
}