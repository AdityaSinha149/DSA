public class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums)
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        int longest = 0;

        for (int num : freqMap.keySet()) {
            if (freqMap.containsKey(num + 1)) {
                int length = freqMap.get(num) + freqMap.get(num + 1);
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
