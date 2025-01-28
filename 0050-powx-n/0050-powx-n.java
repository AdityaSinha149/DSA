class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;

        long power = n;
        if (power < 0) {
            power = -power;
            x = 1 / x;
        }

        return powerHelper(x, power);
    }

    private double powerHelper(double x, long n) {
        if (n == 0) return 1.0;

        double half = powerHelper(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}