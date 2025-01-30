class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        int el1=INT_MIN;
        int el2=INT_MIN;
        int cnt1=0;
        int cnt2=0;

        int n=nums.size();

        for(int i=0;i<n;i++){
            if(cnt1==0&&nums[i]!=el2){
                cnt1++;
                el1=nums[i];
            }
            else if(cnt2==0&&nums[i]!=el1){
                cnt2++;
                el2=nums[i];
            }
            else if(nums[i]==el1)cnt1++;
            else if(nums[i]==el2)cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int n:nums){
            if(n==el1)cnt1++;
            if(n==el2)cnt2++;
        }

        vector<int> ans;
        if(cnt1>n/3)ans.push_back(el1);
        if(cnt2>n/3)ans.push_back(el2);
        return ans;
    }
};