class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.size()==0)return 0;
        unordered_set<int> st;
        for(int n:nums){
            st.insert(n);
        }
        
        int max=1;
        for(auto elem :st){
            if(st.find(elem-1)!=st.end())continue;
            int cnt=1;
            int x=elem;
            while(st.find(x)!=st.end()){
                x++;
                cnt++;
            }
            if(cnt-1>max)max=cnt-1;
        }

        return max;
    }
};