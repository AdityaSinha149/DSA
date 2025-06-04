import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Collections.reverse(Arrays.asList(arr).subList(0, n - k));
        Collections.reverse(Arrays.asList(arr).subList(n - k, n));
        Collections.reverse(Arrays.asList(arr));
        
        for (int i = 0; i < n; i++)
            nums[i] = arr[i];
    }
}
