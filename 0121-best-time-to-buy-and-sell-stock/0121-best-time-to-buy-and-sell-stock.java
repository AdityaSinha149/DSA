class Solution {
    public int maxProfit(int[] prices) {
        int diff=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            min=Math.min(prices[i],min);
            diff=Math.max(prices[i]-min,diff);
        }
        return diff;
    }
}