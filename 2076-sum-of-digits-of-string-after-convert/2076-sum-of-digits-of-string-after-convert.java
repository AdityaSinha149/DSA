class Solution {
    public int getLucky(String s, int k) {
        StringBuilder digits = new StringBuilder();
        for (char c : s.toCharArray()) {
            int value = c - 'a' + 1;
            digits.append(value);
        }
        
        int num = 0;
        for (char d : digits.toString().toCharArray()) {
            num += d - '0';
        }

        for (int i = 1; i < k; i++) {
            int temp = 0;
            while (num > 0) {
                temp += num % 10;
                num /= 10;
            }
            num = temp;
        }
        
        return num;
    }
}

