class Solution {
    public boolean divideArray(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++)
            if(!st.add(nums[i])) st.remove(nums[i]);
        return st.size()==0;
    }
}