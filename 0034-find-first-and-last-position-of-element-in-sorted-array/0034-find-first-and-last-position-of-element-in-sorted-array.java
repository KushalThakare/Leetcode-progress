class Solution {
    public int[] searchRange(int[] nums, int target) {

        if(nums.length==0){
            return new int[] {-1, -1};
        }
        int str = 0;
        int end = nums.length-1;
        int i=0,j=0;

        while(str<=end){
            int mid = str + (end - str)/2;
            if(nums[mid]==target){
                i = mid;
                j=mid;
                break;
            }
            if(nums[mid]>target){
                end = mid-1;
            }
            else{
                str = mid+1;
            }
        }

        if(str>end){
            return new int[] {-1,-1};
        }

        while(i>0&&nums[i-1]==target){
            i--;
        }
        while(j<nums.length-1&&nums[j+1]==target){
            j++;
        }

        return new int[] {i,j};
    }
}