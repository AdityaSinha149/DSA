class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
                
        int left=0;
        int right= nums[nums.length-1]-nums[0];
        
        while (left<=right){
            int mid= left+ (right-left)/2;
            
            boolean bool= check(nums,p,mid);
            if (bool){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        
        return left;
    }
    
    private boolean check(int[] nums, int p, int ans){
        for(int i=0;i<nums.length-1;i++)
            if(nums[i+1]-nums[i]<=ans){
                p--;
                i++;
            }
        return p<=0;
    }
}