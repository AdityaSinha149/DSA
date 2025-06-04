class Solution {
    public String answerString(String word, int numFriends) {
        if(numFriends==1)return word;
        char c = 'z';
        while (c >= 'a') {
            int idx = word.indexOf(c);
            String max = "";
            while (idx != -1) {
                int rem = numFriends - 1 - idx;
                int longest = rem <= 0 ? word.length() - idx : Math.max(0, word.length() - idx - rem);
                String curr = word.substring(idx, idx + longest);
                if (lexi(max, curr)) max = curr;
                idx = word.indexOf(c, idx + 1);
            }
            if (!max.isEmpty()) return max;
            c--;
        }
        return "";
    }

    private boolean lexi(String a, String b) {
        if (a.isEmpty()) return true;
        if (b.isEmpty()) return false;
        int i = 0;
        while (i < a.length() && i < b.length() && a.charAt(i) == b.charAt(i)) i++;
        if (i == a.length()) return true;
        if (i == b.length()) return false;
        return a.charAt(i) < b.charAt(i);
    }
}
