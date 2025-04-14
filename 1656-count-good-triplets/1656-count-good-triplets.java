class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        int len=arr.length;
        for(int l=0;l<len;l++){
            int i=arr[l];
            for(int m=l+1;m<len;m++){
                int j=arr[m];
                for(int n=m+1;n<len;n++){
                    int k=arr[n];
                    if(Math.abs(i-j)<=a && Math.abs(j-k)<=b && Math.abs(i-k)<=c)count++;
                }
            }
        }
        return count;

    }
}