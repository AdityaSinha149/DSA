class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int n : answers) {
            mp.putIfAbsent(n, 0);
            mp.put(n, mp.get(n) + 1);
        }
        int c = 0;
        for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
            int key = e.getKey();
            int v = e.getValue();
            if (key == 0)
                c += v;
            else {
                int n = key + 1;
                int groups = (v + n - 1) / n;
                c += groups * n;
            }
        }
        return c;
    }
}