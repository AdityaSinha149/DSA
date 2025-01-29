class Solution {
    public long subsequenceSumOr(int[] nums) {
        long or = 0, sum = 0;
        for (int n : nums) {
            sum += n;
            or |= n;
            or |= sum;
        }
        return or;
    }
}