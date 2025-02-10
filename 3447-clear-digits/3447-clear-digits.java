class Solution {
    public String clearDigits(String s) {
        int idx=0;
        StringBuilder sb=new StringBuilder(s);
        while(true){
            if(Character.isDigit(sb.charAt(idx))){
                sb.delete(idx-1,idx+1);
                idx-=2;
            }
            idx++;
            if(sb.length()<=idx)break;
        }
        return sb.toString();

    }
}