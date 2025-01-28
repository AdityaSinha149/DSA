class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long edgeNo[]=new long[n];
        for(int[]road:roads){
            edgeNo[road[0]]++;
            edgeNo[road[1]]++;
        }

        Arrays.sort(edgeNo);

        long importance=0;

        for(int i=0;i<n;i++){
            importance+=edgeNo[i]*(i+1);
        }
        return importance;
    }
}