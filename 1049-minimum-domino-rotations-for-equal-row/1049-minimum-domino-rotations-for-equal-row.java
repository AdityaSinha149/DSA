class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n = tops.length;
        int result = check(tops, bottoms, tops[0]);
        if (result != -1) return result;
        return check(tops, bottoms, bottoms[0]);
    }

    private int check(int[] tops, int[] bottoms, int target) {
        int countTop = 0, countBottom = 0;
        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != target && bottoms[i] != target) return -1;
            if (tops[i] != target) countTop++;
            if (bottoms[i] != target) countBottom++;
        }
        return Math.min(countTop, countBottom);
    }
}
