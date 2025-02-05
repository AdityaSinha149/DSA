class Solution {
    public int[] distinctNumbers(int[] nums, int k) {
        Map<Integer,Integer> numTotimes=new HashMap<>();
        for(int i=0;i<k;i++)
            numTotimes.put(nums[i],numTotimes.getOrDefault(nums[i],0)+1);
        int n=nums.length;
        int ans[]=new int[n-k+1];
        ans[0]=numTotimes.size();
        for(int i=k;i<n;i++){
            if(numTotimes.get(nums[i-k])==1)numTotimes.remove(nums[i-k]);
            else numTotimes.put(nums[i-k], numTotimes.get(nums[i-k])-1);
            numTotimes.put(nums[i],numTotimes.getOrDefault(nums[i],0)+1);
            ans[i-k+1]=numTotimes.size();
        }
        return ans;
    }
}