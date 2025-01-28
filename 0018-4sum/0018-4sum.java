class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> possibilities = new ArrayList<>();
        Arrays.sort(nums);
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < nums.length - 3) {
            int rightStart = nums.length - 1;
            while (rightStart > left + 2) {
                int left2 = left + 1;
                int right2 = rightStart - 1;
                
                while (left2 < right2) {
                    long sum = (long)nums[left] + nums[left2] + nums[right2] + nums[rightStart];
                    
                    if (sum == target) {
                        possibilities.add(Arrays.asList(nums[left], nums[left2], nums[right2], nums[rightStart]));
                        
                        while (left2 < right2 && nums[left2] == nums[left2 + 1]) left2++;
                        left2++;
                        
                        while (left2 < right2 && nums[right2] == nums[right2 - 1]) right2--;
                        right2--;
                    } else if (sum < target) {
                        left2++;
                    } else {
                        right2--;
                    }
                }
                
                while (rightStart > left + 2 && nums[rightStart] == nums[rightStart - 1]) rightStart--;
                rightStart--;
            }
            
            while (left < nums.length - 3 && nums[left] == nums[left + 1]) left++;
            left++;
        }
        
        return possibilities;
    }
}
