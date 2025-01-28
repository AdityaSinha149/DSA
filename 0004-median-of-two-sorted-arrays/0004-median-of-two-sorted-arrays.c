double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
 int arr[nums1Size+nums2Size];
        int a=0,b=0;
        for (int i = 0; i < nums1Size + nums2Size; i++) {
        if (a < nums1Size && (b >= nums2Size || nums1[a] <= nums2[b])) {
            arr[i] = nums1[a];
            a++;
        } else {
            arr[i] = nums2[b];
            b++;
        }
    }

        if ((nums1Size+nums2Size) %2 ==0){
            int l = (nums1Size+nums2Size) /2;
            return (arr[l]+arr[l-1])/2.00000;
        }
        else {
            return arr[(nums1Size+nums2Size)/2];
        }
}