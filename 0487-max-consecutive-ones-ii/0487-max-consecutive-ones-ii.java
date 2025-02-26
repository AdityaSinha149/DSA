class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        int next=0;
        while(true){
            int i=next;
            while(i<nums.length && nums[i]==1){
                count++;
                i++;
            }
            if(i>=nums.length){
                max=Math.max(max,count);
                return max;
            }
            i++;
            count++;
            next=i;
            while(i<nums.length && nums[i]==1){
                count++;
                i++;
            }
            max=Math.max(max,count);
            count=0;
        }        
    }
}