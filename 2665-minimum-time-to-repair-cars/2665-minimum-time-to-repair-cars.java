class Solution {
    private boolean possible(int[] ranks, int cars, long target){
        long c=0;
        for(int r:ranks){
            long part=(long)Math.sqrt(target/r);
            c+=part;
        }
        return c>=cars;
    }
    public long repairCars(int[] ranks, int cars) {
        long l=0;
        int min=ranks[0];
        for(int r:ranks)
            min=Math.min(min, r);
        long h=(long)min*cars*cars;

        while(l<=h){
            long m=l+(h-l)/2;
            if(!possible(ranks, cars, m)) l=m+1;
            else h=m-1;
        }

        return h+1;
    }
}