class Solution {
    public String getSmallestString(String s) {
        char[] c=s.toCharArray();
        int done=0;
        for(int i=0;i<c.length-1&&done==0;i++){
            if(Character.getNumericValue(c[i])>Character.getNumericValue(c[i+1])&&Character.getNumericValue(c[i])%2==Character.getNumericValue(c[i+1])%2){
                char temp=c[i+1];
                c[i+1]=c[i];
                c[i]=temp;
                done=1;
            }
        }
        
        return new String(c);
    }
}