class MRUQueue {
    Queue<Integer> q;
    public MRUQueue(int n) {
        q=new LinkedList<>();
        for(int i=1;i<=n;i++)
            q.add(i);
    }
    
    public int fetch(int k) {
        int ans=0;
        int size=q.size();
        for(int i=0;i<size;i++){
            int out=q.poll();
            if(i!=k-1)q.add(out);
            else ans=out;
        }
        q.add(ans);
        return ans;
    }
}

/**
 * Your MRUQueue object will be instantiated and called as such:
 * MRUQueue obj = new MRUQueue(n);
 * int param_1 = obj.fetch(k);
 */