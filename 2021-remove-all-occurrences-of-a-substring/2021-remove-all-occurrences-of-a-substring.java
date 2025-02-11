class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        int n=part.length();
        while(sb.toString().contains(part)){
            int idx=sb.indexOf(part);
            sb.delete(idx, idx+n);
        }
        return sb.toString();
    }
}