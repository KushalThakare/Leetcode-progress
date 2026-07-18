class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];

        for(int i=0; i<nums.length;i++){
            freq[nums[i]]++;
        }
        int sum =0;
        for(int i=0; i<freq.length;i++){
            int num = freq[i]*(freq[i]-1);
            sum =sum + num/2;
        }

        return sum;
    }
}