import java.util.PriorityQueue;
import java.util.Comparator;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Integer> maxProfitHeap = new PriorityQueue<>(Comparator.reverseOrder());

        Project[] projects = new Project[profits.length];
        for (int i = 0; i < profits.length; i++) {
            projects[i] = new Project(capital[i], profits[i]);
        }

        Arrays.sort(projects, Comparator.comparingInt(p -> p.capital));

        int index = 0;
        for (int i = 0; i < k; i++) {
            while (index < projects.length && projects[index].capital <= w) {
                maxProfitHeap.add(projects[index].profit);
                index++;
            }

            if (maxProfitHeap.isEmpty()) {
                break;
            }

            w += maxProfitHeap.poll();
        }

        return w;
    }

    static class Project {
        int capital;
        int profit;

        Project(int capital, int profit) {
            this.capital = capital;
            this.profit = profit;
        }
    }
}