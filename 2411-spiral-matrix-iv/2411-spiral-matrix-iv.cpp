/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> spiralMatrix(int m, int n, ListNode* head) {
        vector<vector<int>> mat(m,vector<int>(n,-1));

        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;

        while(head!=NULL){
            for (int i = left; i <= right&&head!=NULL; i++) {
                mat[top][i] = head->val;
                head=head->next;
            }
            top++;
            
            for (int i = top; i <= bottom&&head!=NULL; i++) {
                mat[i][right] = head->val;
                head=head->next;
            }
            right--;
            
            if (top <= bottom) {
                for (int i = right; i >= left&&head!=NULL; i--) {
                    mat[bottom][i] = head->val;
                    head=head->next;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top&&head!=NULL; i--) {
                    mat[i][left] = head->val;
                    head=head->next;
                }
                left++;
            }
        }
        return mat;
    }
};