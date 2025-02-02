class Solution {
    public String countAndSay(int n) {
        return helper(n).toString();
    }

    private StringBuilder helper(int n){
        if(n==1)return new StringBuilder("1");
        StringBuilder prev=helper(n-1);
        StringBuilder curr=new StringBuilder();
        for(int i=0;i<prev.length();i++){
            int cnt=0;
            while(i+1<prev.length() && prev.charAt(i)==prev.charAt(i+1)){
                i++;
                cnt++;
            }
            curr.append(cnt+1);
            curr.append(prev.charAt(i));
        }
        return curr;
    }
}