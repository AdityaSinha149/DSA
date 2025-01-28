class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length)
            return -1;

        int left = bloomDay[0];;
        int result = -1;
        int right = bloomDay[0];
        for (int i = 1; i < bloomDay.length; i++){
            right = Math.max(right, bloomDay[i]);
            left = Math.min(left, bloomDay[i]);
        }
        int mid = left + (right - left) / 2;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (canBloom(bloomDay, mid, m, k)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public boolean canBloom(int[] bloomDay, int day, int m, int k) {
        int count = 0;
        int adjacent = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                adjacent++;
                if (adjacent == k) {
                    count++;
                    adjacent = 0;
                }
            } else {
                adjacent = 0;
            }
        }

        return count >= m;
    }
}