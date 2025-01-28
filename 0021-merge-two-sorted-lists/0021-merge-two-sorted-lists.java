/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p=new ListNode();
        ListNode q=p;
        
        while(list1!=null&&list2!=null){
           q.next = (list1.val < list2.val) ? list1 : list2;
            q = q.next;
            list1 = (q == list1) ? list1.next : list1;
            list2 = (q == list2) ? list2.next : list2;
        }
        q.next = (list1 != null) ? list1 : list2;
        return p.next;
    }
}