class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int numOdd=0;
        for(int num : arr){
            if((num&1)==0) numOdd=0;
            else numOdd++;
            if(numOdd==3) return true;
        }
        return false;
    }
}