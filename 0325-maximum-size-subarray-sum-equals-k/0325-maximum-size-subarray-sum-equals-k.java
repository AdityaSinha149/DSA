class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        int sum = 0, maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            
            if (sum == k) {
                maxLen = j + 1;
            }
            
            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, j - map.get(sum - k));
            }
            
            if (!map.containsKey(sum)) {
                map.put(sum, j);
            }
        }
        
        return maxLen;
    }
}
