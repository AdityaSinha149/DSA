class Solution {
    public long coloredCells(int m) {
        long n=m;
        n--;
        return 1+2*(n*n+n);
    }
}