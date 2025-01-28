class Solution {
    public int passThePillow(int n, int time) {
        int curr=1;
        int direction=1;
        while(time>0){
            if(curr==1) direction=1;
            if(curr==n) direction=-1;

            curr+=direction;
            time--;
        }
        return curr;
    }
}