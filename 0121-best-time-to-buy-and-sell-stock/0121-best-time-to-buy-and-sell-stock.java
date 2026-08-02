class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int maxprof = Integer.MIN_VALUE;

        for(int price:prices){
            minprice = Math.min(minprice, price);
            maxprof = Math.max(maxprof, price-minprice);
        }

        return maxprof;
        
    }
}