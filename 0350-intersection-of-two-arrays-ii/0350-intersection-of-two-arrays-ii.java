class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         int max1 = nums1[0];
        for (int i = 1; i < nums1.length; i++) {
            if (nums1[i] > max1) {
                max1 = nums1[i];
            }
        }
        int max2=nums2[0];
        for (int i = 1; i < nums2.length; i++) {
            if (nums2[i] > max2) {
                max2 = nums2[i];
            }
        }
        int[] count=new int[Math.max(max1,max2)+1];
        int[] ans=new int[Math.max(max1,max2)+1];
        for(int i=0;i<nums1.length;i++){
            count[nums1[i]]++;
        }
        int j=0;
        for(int i=0;i<nums2.length;i++){
            if(count[nums2[i]]-- >0){
                ans[j++]=nums2[i];
            }
        }
        return Arrays.copyOf(ans,j);
    }
}