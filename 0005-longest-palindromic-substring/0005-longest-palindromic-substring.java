class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int max = 0;
        String longest = "";
        int left = 0;
        int right = s.length();

        while (left < s.length()) {
            while (right > left) {
                String check = s.substring(left, right);
                if (checkPalin(check) && check.length() > max) {
                    max = check.length();
                    longest = check;
                    break;
                }
                right--;
            }
            left++;
            right = s.length(); // Reset right pointer
        }
        
        return longest;
    }

    public boolean checkPalin(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
