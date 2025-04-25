class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        int n = nums.size();
        long count = 0;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++)
            prefix[i + 1] = prefix[i] + ((nums.get(i) % modulo == k) ? 1 : 0);

        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);

        for (int i = 1; i <= n; i++) {
            int rem = (prefix[i] - k) % modulo;
            if (rem < 0) rem += modulo;
            count += freq.getOrDefault(rem, 0);
            int curRem = prefix[i] % modulo;
            freq.put(curRem, freq.getOrDefault(curRem, 0) + 1);
        }

        return count;
    }
}
