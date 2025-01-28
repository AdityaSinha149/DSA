import java.util.Arrays;

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        // Sort difficulty and profit arrays based on profit in descending order
        for (int i = 1; i < profit.length; i++) {
            for (int j = i; j > 0 && profit[j] < profit[j - 1]; j--) {
                int temp = profit[j];
                profit[j] = profit[j - 1];
                profit[j - 1] = temp;
                
                temp = difficulty[j];
                difficulty[j] = difficulty[j - 1];
                difficulty[j - 1] = temp;
            }
        }

        // Sort the worker array
        Arrays.sort(worker);

        
        int profit_max = 0;

        // Iterate over the workers from the end to the start
        for (int i = worker.length - 1; i >= 0; i--) {
            int j = difficulty.length - 1;
            // Find the most profitable job the worker can do
            while (j >= 0 && worker[i] < difficulty[j]) {
                j--;
            }
            if (j >= 0) {
                profit_max += profit[j];
            }
        }
        return profit_max;
    }
}
