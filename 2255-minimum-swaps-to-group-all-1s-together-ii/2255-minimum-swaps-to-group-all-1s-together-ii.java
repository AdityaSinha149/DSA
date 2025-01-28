class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int[]nums_new=new int[2*n];
        int k=0;
        for(int j=0;j<2;j++){
            for(int num:nums){
                nums_new[k]=num;
                k++;
            }
        }
        int num1 = 0;
        for (int num : nums) {
            if (num == 1) num1++;
        }
        if (num1 == 0 || num1 == nums.length) return 0;

        int count=0;
        int max_count=0;

        for (int i = 0; i < num1; i++) {
            if (nums_new[i] == 1) count++;
        }
        max_count = count;
        for(int i=1;i<2*n-num1;i++){
            if(nums_new[i-1]==1)count--;
            if(nums_new[i+num1-1]==1)count++;
            if(count>max_count)max_count=count;
        }
        return num1-max_count;
    }
}