bool judgeSquareSum(int c) {
    for (int i = 0; i <= sqrt(c); ++i) {
        int a = i;
        double b = sqrt(c - a * a);
        a=b;
        if (b == a) {
            return true;
        }
    }
    return false;
}
