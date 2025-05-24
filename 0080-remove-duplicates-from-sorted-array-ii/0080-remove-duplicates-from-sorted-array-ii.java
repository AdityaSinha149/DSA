class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 2;
        int j = 2;
        for (; j < nums.length; j++)
            if (nums[j]==nums[i-2])
                continue;
            else
                nums[i++] = nums[j];
        return i;
    }
}
