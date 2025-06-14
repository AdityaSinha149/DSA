class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        int l=0,h=numbers.length-1;
        while(l<h){
            if(numbers[l]+numbers[h]==target){
                ans[0]=l+1;
                ans[1]=h+1;
                break;
            }
            else if(numbers[l]+numbers[h]<target) l++;
            else h--;
        }
        return ans;
    }
}