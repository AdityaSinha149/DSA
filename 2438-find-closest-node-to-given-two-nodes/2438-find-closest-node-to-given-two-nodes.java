class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int[] valid1=new int[edges.length];
        int[] valid2=new int[edges.length];
        int[] length=new int[edges.length];
        int steps=0;
        while(node1!=-1 && valid1[node1]==0){
            length[node1]=steps;
            valid1[node1]++;
            node1=edges[node1];
            steps++;
        }
        steps=0;
        while(node2!=-1 && valid2[node2]==0){
            length[node2]=Math.max(steps,length[node2]);
            valid2[node2]++;
            node2=edges[node2];
            steps++;
        }

        int min=Integer.MAX_VALUE;
        int n=-1;
        for(int i=edges.length-1;i>=0;i--){
            if(valid1[i]==1 &&valid2[i]==1 && length[i]<=min){
                min=length[i];
                n=i;
            }
        }
        return n;
    }
}