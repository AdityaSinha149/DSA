class Solution {
    public double averageWaitingTime(int[][] customers) {
        int finishTime=0;
        long sum=0;
        for(int[] customer : customers){
            finishTime=Integer.max(finishTime,customer[0])+customer[1];
            sum+=finishTime-customer[0];
        }
        return (double)sum/customers.length;
    }
}