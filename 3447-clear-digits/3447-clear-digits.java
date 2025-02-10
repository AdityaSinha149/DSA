class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
            if(Character.isDigit(c))
                sb.delete(sb.length()-1, sb.length());
            else
                sb.append(c);
        return sb.toString();

    }
}