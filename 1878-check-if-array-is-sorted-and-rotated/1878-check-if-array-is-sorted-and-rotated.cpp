class Solution {
public:
    bool check(vector<int>& nums) {
        vector<int> sorted=nums;
        sort(sorted.begin(),sorted.end());
        for(int i=0;i<nums.size();i++){
            int found=1;
            for(int j=0;j<nums.size();j++){
                if(sorted[j]!=nums[(j+i)%nums.size()]){
                    found=0;
                    break;
                }
            }
            if(found==1)return true;
        }
        return false;
    }
};