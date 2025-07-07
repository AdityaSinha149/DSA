import java.util.*;

class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = events.length;
        int i = 0, day = 1, count = 0;

        int lastDay = 0;
        for (int[] e : events) lastDay = Math.max(lastDay, e[1]);

        while (day <= lastDay) {
            while (i < n && events[i][0] == day) {
                pq.offer(events[i][1]);
                i++;
            }

            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }

            if (!pq.isEmpty()) {
                pq.poll();
                count++;
            }

            day++;
        }

        return count;
    }
}
