import java.util.Arrays;

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for (int i = nums.length - 2; i >= 0; i--) {
                int take = 1;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] < nums[j]) {
                        take = Math.max(take, 1 + dp[j]);
                    }
                }
                dp[i] = take;
        }

        int max = 0;
        for (int val : dp) {
            max = Math.max(max, val);
        }

        return max;
    }
}
