class Solution {
    public int countDigits(int num) {
        int dup=num;
        int ans = 0;
        while(dup!=0){
            int cur = dup%10;
            if(num%cur==0){
                ans++;
            }
            dup/=10;
        }

        return ans;
    }
}