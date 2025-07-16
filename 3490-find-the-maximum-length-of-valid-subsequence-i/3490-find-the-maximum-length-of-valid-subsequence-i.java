class Solution {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        int[] maxNoAlt = new int[2];
        int[] maxAlt = new int[2];

        for (int i = 0; i < n; i++) {
            int parity = nums[i] % 2;
            maxNoAlt[parity]++;
            maxAlt[parity] = Math.max(maxAlt[parity], maxAlt[parity ^ 1] + 1);
            maxAlt[parity] = Math.max(maxAlt[parity], 1);
        }

        return Math.max(Math.max(maxNoAlt[0], maxNoAlt[1]), Math.max(maxAlt[0], maxAlt[1]));
    }
}
