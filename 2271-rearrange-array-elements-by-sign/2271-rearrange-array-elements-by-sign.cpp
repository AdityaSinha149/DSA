class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int> ans(nums.size());
        int pos=0;int neg=1;
        for(int n : nums){
            if(n>0){
                ans[pos]=n;
                pos+=2;
            }
            else{
                ans[neg]=n;
                neg+=2;
            }
        }
        return ans;
    }
};