class Solution {
    public String clearDigits(String s) {
        int idx=0;
        StringBuilder sb=new StringBuilder(s);
        while(sb.length()>idx){
            if(Character.isDigit(sb.charAt(idx))){
                sb.delete(idx-1,idx+1);
                idx-=2;
            }
            idx++;
        }
        return sb.toString();

    }
}