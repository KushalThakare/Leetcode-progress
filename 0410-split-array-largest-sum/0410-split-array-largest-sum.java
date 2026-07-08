class Solution {

    public boolean isValid(int mid, int[] nums, int k){
        int i=0;
        int ki =1;
        int sum =0;
        while(ki<=k&&i<nums.length){
            if(sum+nums[i]>mid){
                ki++;
                sum=0;
            }
            else{
                sum+=nums[i];
                i++;
            }
        }

        if(i<nums.length){
            return false;
        }
        else{
           return true;
        }
    };
    public int splitArray(int[] nums, int k) {
        int start =0;
        int n = nums.length;
        int ans =-1;
        int sum =0;

        for(int i =0; i<n;i++){
            sum+=nums[i];
        }

        int end = sum;


        while(start<=end){
            int mid = start +(end-start)/2;
            if(isValid(mid, nums, k)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return ans;
    }
}