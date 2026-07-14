class Solution {
    public int majorityElement(int[] nums) {
        int candidate =0;
        int freq=0; 

        for(int num:nums){
            if(freq == 0){
                candidate = num;
            }
            if(num==candidate){
                freq++;
            }
            else{
                freq--;
            }

        }

        return candidate;
    }
}