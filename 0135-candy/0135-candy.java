class Solution {
    public int candy(int[] ratings) {
        int[] arr=new int[ratings.length];
        for(int i=0;i<arr.length;i++) arr[i]=1;
        for(int i=0;i<arr.length-1;i++) 
            if(ratings[i+1]>ratings[i]) arr[i+1]=arr[i]+1;
        for(int i=arr.length-1;i>0;i--)
            if(ratings[i-1]>ratings[i]) arr[i-1]=Math.max(arr[i-1],arr[i]+1);
        int sum=0;
        for(int i=0;i<arr.length;i++) sum+=arr[i];
        return sum;
    }
}