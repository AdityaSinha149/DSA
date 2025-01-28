bool isPalindrome(int x) {
    long int reversed = 0,original;
    if (x < 0) {
        return false;
    } else {
        original=x;
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        if (reversed == original && reversed>=-pow(2,31) && reversed<=pow(2,31)-1) {
            return true;
        } else
            return false;
    }
}