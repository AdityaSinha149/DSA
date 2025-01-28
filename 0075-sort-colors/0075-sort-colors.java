class Solution {
    public void sortColors(int[] nums) {
        int l=nums.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}