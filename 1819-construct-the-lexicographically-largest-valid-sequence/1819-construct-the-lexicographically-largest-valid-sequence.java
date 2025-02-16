class Solution {
    public int[] constructDistancedSequence(int n) {
        int len = 2 * n - 1;
        int[] result = new int[len];
        boolean[] used = new boolean[n + 1]; 
        backtrack(result, used, n, 0);
        return result;
    }

    private boolean backtrack(int[] result, boolean[] used, int n, int index) {
        int len = result.length;
        while (index < len && result[index] != 0) index++; 
        if (index == len) return true; 

        for (int num = n; num >= 1; num--) {
            if (used[num]) continue; 
            
            int secondIndex = (num == 1) ? index : index + num; 
            if (secondIndex >= len || result[secondIndex] != 0) continue; 

            result[index] = num;
            if (num > 1) result[secondIndex] = num; 
            used[num] = true; 

            if (backtrack(result, used, n, index + 1)) return true; 

            result[index] = 0;
            if (num > 1) result[secondIndex] = 0;
            used[num] = false;
        }
        return false;
    }
}
