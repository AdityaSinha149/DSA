class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Pair<Integer, Integer>, Integer> map = new HashMap<>();
        int count = 0;
        for (int[] d : dominoes) {
            int low = Math.min(d[0], d[1]);
            int high = Math.max(d[0], d[1]);
            Pair<Integer, Integer> key = new Pair<>(low, high);
            count += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return count;
    }
}
