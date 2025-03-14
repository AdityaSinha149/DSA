class Solution {
    private boolean helper(int[] candies,long m,long k){
        long k1=0;
        for(int n:candies){
            k1+=n/m;
        }
        return k1>=k;
    }
    public int maximumCandies(int[] candies, long k) {
        long sum=0;
        int max=0;
        for(int n:candies){
            sum+=n;
            max=Math.max(max,n);
        }

        int l=1;
        int h=max;
        if(sum<k)return 0;
        while(l<=h){
            int m=l+(h-l)/2;
            if(helper(candies,m,k)) l=m+1;
            else h=m-1;
        }
        return h;
    }
}