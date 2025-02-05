class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(n>first){
                third=second;
                second=first;
                first=n;
            }
            else if(n>second && n!=first){
                third=second;
                second=n;
            }
            else if(n>third &&  n!=first && n!=second){
                third=n;
            }
        }
        return (int)( third==Long.MIN_VALUE ? first : third);
    }
}