class Solution {
    private boolean helper(int n,int pow){
        if(n<0)return false;
        if(n==0)return true;
        boolean pick=helper(n-pow, pow*3);
        boolean notPick=false;
        if(pow*3<=n)notPick=helper(n, pow*3);
        return pick||notPick;
    }
    public boolean checkPowersOfThree(int n) {
        return helper(n, 1);
        
    }
}