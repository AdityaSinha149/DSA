class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();

        for (int n : nums) {
            if (n < pivot)
                l1.add(n);
            else if (n > pivot)
                l2.add(n);
            else
                l3.add(n);
        }

        l1.addAll(l3);
        l1.addAll(l2);

        return l1.stream().mapToInt(i -> i).toArray();
    }
}
