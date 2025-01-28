class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles + helper(numBottles, numExchange);
    }
    
    private int helper(int emptyBottles, int numExchange) {
        if (emptyBottles < numExchange) {
            return 0;
        }
        int newBottles = emptyBottles / numExchange;
        int remainingEmptyBottles = emptyBottles % numExchange;
        return newBottles + helper(newBottles + remainingEmptyBottles, numExchange);
    }
}
