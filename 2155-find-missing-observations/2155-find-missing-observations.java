class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum=0;
        for(int n1:rolls)sum+=n1; 
        int left=mean*(n+rolls.length)-sum;
        if(left>n*6)return new int[0];

        int[] arr=new int[n];
        int i=0;
        while(left>6){
            arr[i++]=6;
            left-=6;
        }
        arr[i++]=left;
        int j=0;
        int end=i;
        while(j<end&&i<n){
            while(arr[j]>1&&i<n){
                arr[j]--;
                arr[i++]=1;
            }
            j++;
        }
        if(i<n)return new int[0];
        return arr;
    }
}