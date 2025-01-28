import java.util.*;

class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<Integer>[] Ancestor = new ArrayList[n];
        List<List<Integer>> AncestorFinal = new ArrayList<>();

        // Initialize Ancestor array
        for (int i = 0; i < n; i++) {
            Ancestor[i] = new ArrayList<>();
        }

        // Populate Ancestor lists based on edges
        for (int j = 0; j < edges.length; j++) {
            int parent = edges[j][0];
            int child = edges[j][1];
            Ancestor[child].add(parent);
        }

        // Compute ancestors for each node
        for (int i = 0; i < n; i++) {
            List<Integer> ancestorListFinal = new ArrayList<>();
            Set<Integer> visited = new HashSet<>();
            computeAncestors(i, Ancestor, ancestorListFinal, visited);
            Collections.sort(ancestorListFinal);
            AncestorFinal.add(ancestorListFinal);
        }

        return AncestorFinal;
    }

    private void computeAncestors(int node, List<Integer>[] Ancestor, List<Integer> ancestorList, Set<Integer> visited) {
        if (visited.contains(node)) return;

        visited.add(node);

        List<Integer> ancestors = Ancestor[node];
        for (int parent : ancestors) {
            if (!ancestorList.contains(parent)) {
                ancestorList.add(parent);
                computeAncestors(parent, Ancestor, ancestorList, visited);
            }
        }
    }
}
