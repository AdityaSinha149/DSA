class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i]-i,map.getOrDefault(nums[i]-i,0)+1);
        
        long cnt=0;
        for(int n:map.values())
            cnt+=n*(nums.length-n);
        return cnt/2;
    }
}