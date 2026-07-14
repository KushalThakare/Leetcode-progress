class Solution {
    public int maxFrequencyElements(int[] nums) {
        int hash[] = new int[101];
        int ans = 0;
        int freq=0;

        for(int num:nums){
            hash[num]++;

            if(hash[num]>freq){
                freq=hash[num];
                ans=1;
            }
            else if(hash[num]==freq){
                ans++;
            }
            
        }

        return ans*freq;


    }
}