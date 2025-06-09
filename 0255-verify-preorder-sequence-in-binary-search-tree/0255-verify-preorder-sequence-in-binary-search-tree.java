class Solution {
    public boolean verifyPreorder(int[] preorder) {
        Stack<Integer> stack = new Stack<>();
        int min=-1;
        stack.push(Integer.MAX_VALUE);
        for(int node:preorder){
            if(node<min) return false;
            if(node<stack.peek()) stack.push(node);
            else{
                while(!stack.isEmpty() && stack.peek()<node)
                    min=stack.pop();
                if(stack.isEmpty() && min>node) return false;
                stack.push(node);
            }
        }
        return true;
    }
}