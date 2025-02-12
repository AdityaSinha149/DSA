class Solution {
    public int maximumSum(int[] nums) {
        PriorityQueue<node> q=new PriorityQueue<>((a,b)->{
            if(a.sum==b.sum) return b.value-a.value;
            else return b.sum-a.sum;
        });
        for(int n:nums){
            node m=new node(n);
            q.add(m);
        }
        int sum=-1;
        while(q.size()>1){
            node n1=q.poll();
            node n2=q.peek();
            if(n1.sum==n2.sum){
                sum=Math.max(sum, n1.value+n2.value);
                q.poll();
            }
        }
        return sum;
    }
}

class node{
    int value;
    int sum;

    node(int n){
        value=n;
        sum=sum(n);
    }

    private int sum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}