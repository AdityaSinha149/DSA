class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> multToTimesMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                multToTimesMap.put(nums[i] * nums[j], multToTimesMap.getOrDefault(nums[i] * nums[j], 0) + 1);
            }
        }
        
        int cnt = 0;
        for (int value : multToTimesMap.values()) {
            cnt += 8 * nC2(value);
        }
        return cnt;
    }

    private int nC2(int n) {
        return n * (n - 1) / 2;
    }
}