class Solution {
    public int maxHeightByColour(int red,int blue){
        int n=1;
        while(red>=0&&blue>=0){
            if(n%2==0) red-=n;
            else blue-=n;
            n++;
        }
        return n-2;
    }
    public int maxHeightOfTriangle(int red, int blue) {
        int r1=maxHeightByColour(red,blue);
        int r2=maxHeightByColour(blue,red);
        return Math.max(r1,r2);
    }
}
