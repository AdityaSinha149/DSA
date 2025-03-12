class Solution {
    private boolean valid(Map<Character, Integer> v) {
        return v.containsKey('a') && v.containsKey('b') && v.containsKey('c');
    }

    public int numberOfSubstrings(String s) {
        int n = s.length();
        Map<Character, Integer> charCount = new HashMap<>();
        int left = 0;
        int right = 0;
        int count = 0;
        while (right<n || valid(charCount)) {
            if (valid(charCount)) {
                count += n - right+1;
                char l = s.charAt(left);
                charCount.put(l, charCount.get(l) - 1);
                if (charCount.get(l) == 0)
                    charCount.remove(l);
                left++;
            } else {
                char r = s.charAt(right);
                charCount.put(r, charCount.getOrDefault(r,0)+1);
                right++;
            }
        }
        return count;
    }
}