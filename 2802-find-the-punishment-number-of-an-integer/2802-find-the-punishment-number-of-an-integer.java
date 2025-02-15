class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (check(i)) {
                sum += i * i;
            }
        }
        return sum;
    }

    private boolean check(int i) {
        return canPartition(Integer.toString(i * i), 0, i);
    }

    private boolean canPartition(String s, int index, int target) {
        if (index == s.length()) return target == 0;
        
        int num = 0;
        for (int j = index; j < s.length(); j++) {
            num = num * 10 + (s.charAt(j) - '0');
            if (num > target) break;  
            if (canPartition(s, j + 1, target - num)) return true;
        }
        return false;
    }
}
