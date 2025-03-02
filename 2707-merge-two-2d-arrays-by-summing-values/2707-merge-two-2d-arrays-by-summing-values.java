import java.util.*;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Arrays.sort(nums1, (a, b) -> a[0] - b[0]);
        Arrays.sort(nums2, (a, b) -> a[0] - b[0]);
        int i = 0, j = 0;
        List<int[]> ans = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) {
                ans.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                ans.add(nums1[i]);
                i++;
            } else {
                ans.add(nums2[j]);
                j++;
            }
        }

        while (i < nums1.length) ans.add(nums1[i++]);
        while (j < nums2.length) ans.add(nums2[j++]);

        return ans.toArray(new int[ans.size()][]);
    }
}
