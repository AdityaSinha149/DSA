class Solution {
    public int search(int[] nums, int target) {
        int k=0;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[nums.length-1])low=mid+1;
            else high=mid-1;
        }
        k=low;
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int m=(mid+k)%nums.length;
            if(nums[m]==target)return m;
            else if(nums[m]>target) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
}