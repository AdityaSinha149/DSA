class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int happyCustomers=0;
        for(int i=0;i<minutes;i++){
            happyCustomers+=customers[i];
        }
        for(int i=minutes;i<customers.length;i++){
            if(grumpy[i]==0) happyCustomers+=customers[i];
        }
        //Now we got the no of happy customers if not grumpy at first n mins
        int temp=happyCustomers;
        for(int i=minutes;i<customers.length;i++){
            if(grumpy[i-minutes]==1) temp-=customers[i-minutes];
            if(grumpy[i]==1) temp+=customers[i];
            if(temp>happyCustomers) happyCustomers=temp;
        }
        return happyCustomers;
    }
}