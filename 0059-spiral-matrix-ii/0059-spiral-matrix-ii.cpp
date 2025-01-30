class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>> mat(n, vector<int>(n));
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;

        int num = 1;
        while (num <= n * n) {
            for (int i = left; i <= right; i++) {
                mat[top][i] = num++;
            }
            top++;
            
            for (int i = top; i <= bottom; i++) {
                mat[i][right] = num++;
            }
            right--;
            
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    mat[bottom][i] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    mat[i][left] = num++;
                }
                left++;
            }
        }
        return mat;
    }
};
