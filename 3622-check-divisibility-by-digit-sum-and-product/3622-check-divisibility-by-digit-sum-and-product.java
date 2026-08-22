class Solution {
    public boolean checkDivisibility(int n) {
        int product =1;
        int sum = 0;
        int num =n;

        while(n!=0){
            int dig = n%10;
            product *=dig;
            sum+=dig;
            

            n/=10;
        }

        return num%(sum+product)==0;
    }
}