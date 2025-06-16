class Solution {
    public int maximumDifference(int[] nums) {
        int min=nums[0];
        int d=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=min){
                min=nums[i];
            }
            else{
                d=Math.max(nums[i]-min, d);
            }
        }
        return d;
    }
}