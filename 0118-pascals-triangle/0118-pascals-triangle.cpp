class Solution {
public:
    vector<int> generateLine(int n){
        vector<int> line;
        int num=1;
        int k=n-1;
        line.push_back(num);
        for(int i=1;i<n;i++){
            num=num*k;
            num/=i;
            k--;
            line.push_back(num);
        }
        return line;
    }
    
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> triangle;
        for(int i=1;i<=numRows;i++){
            triangle.push_back(generateLine(i));
        }
        return triangle;
    }
};