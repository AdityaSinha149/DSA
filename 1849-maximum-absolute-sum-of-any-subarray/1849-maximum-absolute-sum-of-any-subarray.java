class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=0;
        int sum1=0,sum2=0;
        for(int n:nums){
            sum1+=n;
            sum2-=n;
            max=Math.max(max, sum1);
            max=Math.max(max, sum2);
            if(sum1<0)sum1=0;
            if(sum2<0)sum2=0;
        }
        return max;
    }
}