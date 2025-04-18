class Solution {
    public String countAndSay(int n) {
        return helper(n);
    }

    private String helper(int n){
        if(n==1)return "1";
        String m=helper(n-1);
        int len=m.length();
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<len){
            char curr=m.charAt(i);
            i++;
            int count=1;
            while(i<len && m.charAt(i)==curr){
                count++;
                i++;
            }

            sb.append(count);
            sb.append(curr);
        }
        return sb.toString();
    }
}