class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> ballToColor=new HashMap<>();
        HashMap<Integer,HashSet<Integer>> colorToBall=new HashMap<>();

        int ans[]=new int[queries.length];
        int i=0;

        for(int[] query:queries){
            int ball=query[0];
            int newColor=query[1];

            if (ballToColor.containsKey(ball)) {
                int oldColor=ballToColor.get(ball);
                ballToColor.remove(ball);
                
                HashSet<Integer> oldColorSet=colorToBall.get(oldColor);
                if (oldColorSet != null){
                    oldColorSet.remove(ball);
                    if (oldColorSet.isEmpty())
                        colorToBall.remove(oldColor);
                }
            }

            ballToColor.put(ball, newColor);
            colorToBall.putIfAbsent(newColor, new HashSet<>());
            colorToBall.get(newColor).add(ball);

            ans[i++]=colorToBall.size();
        }

        return ans;
    }
}