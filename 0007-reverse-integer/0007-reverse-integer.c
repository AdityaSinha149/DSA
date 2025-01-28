int reverse(int x) {
    long int a = 0, y;
    if (x >= pow(2, 31) - 1 || x <= -pow(2, 31)) {
        return 0;
    } else {
        if (x < 0) {
            y = -x;
        } else
            y = x;
        while (y > 0) {
            a = a * 10 + y % 10;
            y = y / 10;
        }
        int k =a;
        
        if (x > 0 && a <= pow(2, 31) - 1 && a >= -pow(2, 31)) {
            return k;
        } else if (x < 0 && a <= pow(2, 31) - 1 && a >= -pow(2, 31)) {
            return -k;
        } else
            return 0;
    }
}