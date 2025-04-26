class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int badIndex = -1, lastMin = -1, lastMax = -1;
        long count = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < minK || nums[i] > maxK) badIndex = i;
            if(nums[i] == minK) lastMin = i;
            if(nums[i] == maxK) lastMax = i;
            int minLast = Math.min(lastMin, lastMax);
            if(minLast > badIndex) count += minLast - badIndex;
        }
        
        return count;
    }
}