class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        StringBuilder res=new StringBuilder();
        while(i<sb.length()){
            while(i<sb.length() && sb.charAt(i)==' '){
                i++;
                continue;
            }
            StringBuilder temp=new StringBuilder();
            while(i<sb.length() && sb.charAt(i)!=' ') temp.append(sb.charAt(i++));
            if(res.length()!=0 && temp.length()>0)temp.append(' ');
            res.insert(0,temp);
        }
        return res.toString();
    }
}