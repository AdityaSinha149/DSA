class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int curr=asteroids[i];
            if(st.isEmpty()){
                st.push(curr);
                continue;
            }
            int top=st.peek();
            while(!st.isEmpty() && curr<0 && top>0){
                if(Math.abs(curr)>Math.abs(top)){
                    st.pop();
                    if(!st.isEmpty())top=st.peek();
                }
                else{
                    if(Math.abs(curr)==Math.abs(top))
                        st.pop();
                    curr=0;
                    break;
                }
            }
            if(curr!=0)st.push(curr);
        }
        int[] res=new int[st.size()];
        for(int i=res.length-1;i>=0;i--)
            res[i]=st.pop();
        return res;
    }
}