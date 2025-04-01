class Solution {
    public int maxProfit(int[] prices) {
        int a = prices.length;
        int profit =0;
        int current = prices[0];
        for(int i=1; i<a; i++){
            if(current > prices[i]){
                current = prices[i];
            }
            profit = Math.max(profit,prices[i] - current);
        }
        return profit;
    }
}