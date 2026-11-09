class Solution {
    public boolean check(int n){
        int og = n;
        while(n!=0){
            int dig = n%10;
            if(dig==0){
                return false;
            }
            if(og%dig!=0){
                return false;
            }

            n/=10;
        }

        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = left; i<=right; i++){
            if(check(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}