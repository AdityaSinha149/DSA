class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer,Integer> multToTimesMap=new HashMap<>();
        for(int n:nums)
            for(int m:nums)
                multToTimesMap.put(n*m,multToTimesMap.getOrDefault(n*m, 0)+1);

        int cnt=0;
        for(int value:multToTimesMap.values())
            cnt+=8*nC2(value/2);
        return cnt;
    }

    private int nC2(int n){
        return n*(n-1)/2;
    }
}