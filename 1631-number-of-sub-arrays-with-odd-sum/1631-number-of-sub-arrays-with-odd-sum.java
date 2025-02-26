class Solution {
    public int numOfSubarrays(int[] arr) {
        int odds=0;
        int evens=0;
        int sum=0;
        int count=0;
        for(int n:arr){
            sum+=n;
            if((sum&1)==0){
                evens++;
                count=(count+odds)%(int)(1e9+7);
            }
            else{
                odds++;
                count=(count+evens+1)%(int)(1e9+7);
            }
        }
        return count;
    }
}