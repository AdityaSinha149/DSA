class Solution {
    public int findTheWinner(int n, int k) {
        if(n==1) return 1;
        if(k==1) return n;
        ArrayList<Integer> friends = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            friends.add(i+1);
        }
        int initial=0;
        while(friends.size()>1){
            int remove=(initial+k-1)%friends.size();
            initial=remove;
            friends.remove(remove);
        }
        return friends.get(0);
    }
}