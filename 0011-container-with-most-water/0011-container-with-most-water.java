class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int maxArea=0;
        while(i<j){
            if(height[i]>height[j]){
                if((j-i)*height[j]>maxArea){
                    maxArea=(j-i)*height[j];
                }
                j--;
            }
            else{
                if((j-i)*height[i]>maxArea){
                    maxArea=(j-i)*height[i];
                }
                i++;
            }
        }
        return maxArea;
    }
}