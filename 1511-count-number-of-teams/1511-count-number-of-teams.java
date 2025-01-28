class Solution {
    public int numTeams(int[] rating) {
        int count=0;
        for(int i=1;i<rating.length-1;i++){
            int left=0;
            int right=0;
            for(int j=0;j<i;j++){
                if(rating[j]<rating[i])left++;
            }
            for(int j=i+1;j<rating.length;j++){
                if(rating[j]>rating[i])right++;
            }

            count+=left*right+(i-left)*(rating.length-i-right-1);
        }
        return count;
    }
}