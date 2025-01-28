class Solution {
    public int maxDistance(int[] position, int m) {
        int length=position.length;
        Arrays.sort(position);
        int low=1;
        int high=position[length-1]-position[0];
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(CanFormDivisions(position,mid,m)){
                low=mid+1;
                ans=mid;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    public boolean CanFormDivisions(int[] position,int num,int m){
        int prevValue=position[0];
        int count=1;
        int length=position.length;
        for(int i=1;i<length;i++){
            if(position[i]-prevValue>=num) {
                count++;
                prevValue=position[i];
                if(count==m){
                    return true;
                }
            }
        }
        return false;
    }
}