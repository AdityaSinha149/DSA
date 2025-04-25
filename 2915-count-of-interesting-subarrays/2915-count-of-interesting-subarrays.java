class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);

        int prefixMod = 0;
        long count = 0;

        for (int num : nums) {
            if (num % modulo == k) prefixMod++;

            int rem = (prefixMod - k) % modulo;
            if (rem < 0) rem += modulo;

            count += freq.getOrDefault(rem, 0);

            int curMod = prefixMod % modulo;
            freq.put(curMod, freq.getOrDefault(curMod, 0) + 1);
        }

        return count;
    }
}
