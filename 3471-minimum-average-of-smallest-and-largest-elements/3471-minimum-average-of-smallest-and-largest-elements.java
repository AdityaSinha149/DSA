class Solution {
    public double minimumAverage(int[] nums) {
        double[] average=new double[nums.length/2];
        int left=0;
        int right=nums.length-1;
        int i=0;
        Arrays.sort(nums);
        while(left<right){
            average[i]=(double)(nums[left]+nums[right])/2;
            left++;
            right--;
            i++;
        }
        double smallest=average[0];
        for(i=1;i<average.length;i++){
            if(smallest>average[i]) smallest=average[i];
        }
        return smallest;
        
    }
}