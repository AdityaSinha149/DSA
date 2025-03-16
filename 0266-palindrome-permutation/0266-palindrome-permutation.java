class Solution {
    public boolean canPermutePalindrome(String s) {
        Set<Character> st=new HashSet<>();
        for(char c:s.toCharArray()){
            if(st.contains(c)) st.remove(c);
            else st.add(c);
        }
        return st.size()<=1;
    }
}