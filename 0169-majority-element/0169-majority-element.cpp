class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int majority=nums[0];
        int cnt=0;
        for(int n : nums){
            if(cnt==0){
                cnt=1;
                majority=n;
            }

            else if(n==majority)cnt++;
            else cnt--;
        }
        return majority;
    }
};
