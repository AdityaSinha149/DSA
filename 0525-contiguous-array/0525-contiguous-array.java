class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        int len = 0;
        int sum = 0;
        prefixMap.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            int diff = 2*sum - i-1;
            if (prefixMap.containsKey(diff)) {
                int start = prefixMap.get(diff);
                len = Math.max(len, i-start);
            } 
            else prefixMap.put(diff, i);
        }
        return len;
    }
}