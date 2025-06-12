class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<s.length() && !(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)))) i++;
        while(j>=0 && !(Character.isAlphabetic(s.charAt(j)) || Character.isDigit(s.charAt(j)))) j--;
        while(i<=j && Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))){
            i++;j--;
            while(i<s.length() && !(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)))) i++;
            while(j>=0 && !(Character.isAlphabetic(s.charAt(j)) || Character.isDigit(s.charAt(j)))) j--;
        }
        return i>j;
    }
}