class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int length=nums.length;
        if(length>4){
            int min=nums[length-1-3]-nums[0];
            int i=3;
            for(;i>=0;i--){
                int minTemp=nums[length-1-i]-nums[3-i];
                min=Math.min(min,minTemp);
            }
            return min;
        }
        return 0;
    }
}