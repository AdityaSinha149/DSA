class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int size = colors.length;
        int count = 0;
        int first = 0;
        int second = 1;
        int i = 2;

        while (colors[first % size] == colors[second % size] && i < size + 2) {
            i++;
            first++;
            second++;
        }

        for (; i < size + 2; i++) {
            int third = i % size;
            if (colors[third] == colors[first])
                count++;
            first++;
            second++;
            while (colors[first % size] == colors[second % size] && i < size + 2) {
                i++;
                first++;
                second++;
            }
        }
        return count;
    }
}