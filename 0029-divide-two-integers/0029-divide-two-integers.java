class Solution {
    public int divide(int n, int d) {
        if(n==d)return 1;
        boolean sign=true;
        if(n>=0 && d<0)sign=false;
        if(n<0 && d>0)sign=false;

        long ans=0;
        long n1=Math.abs((long) n);
        long d1=Math.abs((long) d);

        while(n1>=d1){
            int cnt=0;
            while(n1>=d1<<(cnt+1))cnt++;
            ans+=(1L<<cnt);
            n1-=(d1<<cnt);
        }

        if(ans>Integer.MAX_VALUE)return sign==true ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        return sign==true ? (int)ans:-1*(int)ans;
    }
}