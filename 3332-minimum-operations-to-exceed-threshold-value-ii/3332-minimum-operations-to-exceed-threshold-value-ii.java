class Solution {
    public int minOperations(int[] nums, int k) {
        int ops=0;
        Queue<Long> q=new PriorityQueue<>();
        for(int n:nums)
            q.add(Long.valueOf(n));
        while(q.size()>1){
            Long n1=q.poll();
            if(n1>=k)return ops;
            Long n2=q.poll();
            q.add(n1*2+n2);
            ops++;
        }
        return ops;
    }
}