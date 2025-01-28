class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> oddCountMap = new HashMap<>();
        // HashMap for knowing how many indices contain a certain number of odd numbers
        oddCountMap.put(0, 1); // Initialize with 0 odd numbers seen once
        int noOfOdds = 0;
        int count = 0;
        
        for (int num : nums) {
            // Calculate the number of odd numbers encountered so far
            noOfOdds += (num % 2 == 0) ? 0 : 1;
            
            // Update the HashMap with the current count of odd numbers seen so far
            oddCountMap.put(noOfOdds, oddCountMap.getOrDefault(noOfOdds, 0) + 1);
            
            // If you get the number of odds till an index and subtract the number of odd nums needed
            // you can check how many indices had that number of odd number subarrays
            int diff = noOfOdds - k;
            count += oddCountMap.getOrDefault(diff, 0);
        }
        
        return count;
    }
}
