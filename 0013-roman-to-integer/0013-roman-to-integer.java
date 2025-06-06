class Solution {
    static Map<Character, Integer> map = new HashMap<>();
    static {
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
    }
    public int romanToInt(String s) {
        int state = 0;
        int total = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = map.get(s.charAt(i));
            if (curr < state) {
                total -= curr;
            } else {
                total += curr;
                state = curr;
            }
        }

        return total;
    }
}
