class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& m) {
        vector<int> ans;
        
        if (m.empty() || m[0].empty()) return ans;
        
        int n1 = m.size();
        int n2 = m[0].size();
        int top = 0, bottom = n1 - 1;
        int left = 0, right = n2 - 1;

        while (ans.size() < n1 * n2) {
            for (int i = left; i <= right; i++) {
                ans.push_back(m[top][i]);
            }
            top++;
            
            for (int j = top; j <= bottom; j++) {
                ans.push_back(m[j][right]);
            }
            right--;
            
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.push_back(m[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int j = bottom; j >= top; j--) {
                    ans.push_back(m[j][left]);
                }
                left++;
            }
        }
        return ans;
    }
};