#include <climits>

class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int original = x;
        int reversed = 0;

        while (x > 0) {
            if (reversed > (INT_MAX - x % 10) / 10) return false;

            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return reversed == original;
    }
};
