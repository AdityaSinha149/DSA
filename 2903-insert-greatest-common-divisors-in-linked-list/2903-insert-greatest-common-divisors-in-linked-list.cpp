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
    int gcd(int n,int m){
        if(m!=0)return gcd(m,n%m);
        return n;
    }
    ListNode* insertGreatestCommonDivisors(ListNode* head) {
        ListNode* curr=head;
        ListNode* next=head->next;
        while(curr->next!=nullptr){
            ListNode* mid=new ListNode();
            mid->val=gcd(curr->val,next->val);
            
            curr->next=mid;
            mid->next=next;
            curr=next;
            if(curr->next!=nullptr)next=curr->next;
        }
        return head;
    }
};