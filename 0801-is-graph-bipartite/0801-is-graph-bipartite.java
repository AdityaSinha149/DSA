class Solution {
    int n;
    int[] color;

    boolean isBipartiteDFS(int[][] graph, int node, int c) {
        color[node] = c;

        for (int neighbor : graph[node]) {
            if (color[neighbor] == -1) {
                if (!isBipartiteDFS(graph, neighbor, 1 - c))
                    return false;
            } else if (color[neighbor] == color[node]) {
                return false;
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        n = graph.length;
        color = new int[n];

        for (int i = 0; i < n; i++) 
            color[i] = -1;

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (!isBipartiteDFS(graph, i, 0))
                    return false;
            }
        }

        return true;
    }
}
