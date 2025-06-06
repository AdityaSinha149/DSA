class Solution {
    public int jump(int[] nums) {
        int pos = 0, jumps = 0;

        while (pos < nums.length - 1) {
            if (pos + nums[pos] >= nums.length - 1) {
                jumps++;
                break;
            }

            int bestNext = pos, maxReach = 0;

            for (int i = pos + 1; i <= pos + nums[pos]; i++) {
                if (i + nums[i] > maxReach) {
                    maxReach = i + nums[i];
                    bestNext = i;
                }
            }

            pos = bestNext;
            jumps++;
        }

        return jumps;
    }
}
