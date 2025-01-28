import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        int currClosest = Integer.MAX_VALUE; // Use Integer.MAX_VALUE for initialization
        int result = nums[0] + nums[1] + nums[2]; // Initialize with the sum of the first three elements

        for (int small = 0; small < length - 2; small++) {
            if (small > 0 && nums[small] == nums[small - 1]) continue;

            int mid = small + 1;
            int big = length - 1;

            while (mid < big) {
                int sum = nums[small] + nums[mid] + nums[big];
                int temp = Math.abs(sum - target);

                if (temp < currClosest) {
                    currClosest = temp;
                    result = sum; // Update result with the current closest sum
                }

                if (sum < target) {
                    mid++;
                } else if (sum > target) {
                    big--;
                } else {
                    return sum; // If the sum is exactly equal to target, return it immediately
                }
            }
        }
        return result; // Return the closest sum found
    }
}
