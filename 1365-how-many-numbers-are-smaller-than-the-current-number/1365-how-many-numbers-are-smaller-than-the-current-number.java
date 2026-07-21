class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] allnum = new int[101];
        int[] res = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            allnum[nums[i]]++;
        }

        for(int i=1; i<101;i++){
            allnum[i] += allnum[i-1];
        }

        for(int i=0; i<nums.length;i++){
            if(nums[i]==0){
                res[i]=0;
            }
            else{
                res[i]=allnum[nums[i]-1];
            }
        }
        return res;
        
    }
}