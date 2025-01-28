class Solution {
    public int minSteps(int n) {
        if (n == 1) return 0;
        int check = 0;
        int count = 1;
        int step = 0;

        while (count < n) {
            if (n % count == 0) {
                check = count;
                step++; 
            }
            step++; 
            count += check;
        }
        return step;
    }
}