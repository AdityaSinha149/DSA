class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=0;
        int i=0;
        while(i<nums.length){
            int cnt=1;
            while(i+1<nums.length && nums[i+1]>nums[i]){
                i++;
                cnt++;
            }
            if(cnt!=1){
                max=Math.max(max, cnt);
                continue;
            }
            while(i+1<nums.length && nums[i+1]<nums[i]){
                i++;
                cnt++;
            }
            max=Math.max(max, cnt);
            if(cnt==1)i++;
        }
        return max;
    }
}