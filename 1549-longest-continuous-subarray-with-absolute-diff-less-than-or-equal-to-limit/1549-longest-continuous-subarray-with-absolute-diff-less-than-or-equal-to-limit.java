class Solution {
    public int longestSubarray(int[] nums, int limit) {
        // Deques to store the indices of max and min elements in the current window
        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();
        
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < nums.length; right++) {
            // Maintain maxDeque in decreasing order
            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] <= nums[right]) {
                maxDeque.pollLast();
            }
            maxDeque.offerLast(right);
            
            // Maintain minDeque in increasing order
            while (!minDeque.isEmpty() && nums[minDeque.peekLast()] >= nums[right]) {
                minDeque.pollLast();
            }
            minDeque.offerLast(right);
            
            // Check the condition: if the difference between max and min exceeds the limit
            while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > limit) {
                // Move the left pointer to shrink the window
                left++;
                // Remove the indices that are out of the new window
                if (maxDeque.peekFirst() < left) {
                    maxDeque.pollFirst();
                }
                if (minDeque.peekFirst() < left) {
                    minDeque.pollFirst();
                }
            }
            
            // Update the maximum length of the window
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
