class Solution {
    public boolean canPermutePalindrome(String s) {
        Set<Character> st=new HashSet<>();
        for(char c:s.toCharArray()){
            if (!st.add(c)) st.remove(c);
        }
        return st.size()<=1;
    }
}