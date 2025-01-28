class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] sums = new int[n * (n + 1) / 2];
        
        int next = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                sums[next++] = sum;
            }
        }
        
        Arrays.sort(sums);
        long ans = 0;
        for (int i = left - 1; i < right; i++) {
            ans += sums[i];
        }
        
        return (int)(ans % (1e9 + 7));
    }
}
