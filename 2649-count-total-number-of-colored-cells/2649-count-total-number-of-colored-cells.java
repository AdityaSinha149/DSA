class Solution {
    public long coloredCells(int n) {
        long num=1;
        int four=4;
        for(int i=2;i<=n;i++){
            num+=four;
            four+=4;
        }
        return num;
    }
}