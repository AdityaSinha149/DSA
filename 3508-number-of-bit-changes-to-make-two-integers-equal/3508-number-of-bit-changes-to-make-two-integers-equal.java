class Solution {
    public int minChanges(int n, int k) {
        int res = n ^ k;
        if((res&n)!=res)return -1;
        int count = 0;
        while (res > 0) {
            res &= (res - 1);
            count++;
        }
        return count;
    }
}