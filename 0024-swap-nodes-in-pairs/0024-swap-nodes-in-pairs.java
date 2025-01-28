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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode q = head;
        ListNode p = head.next;
        head = p; // The new head will be the second node

        while (true) {
            q.next = p.next;
            p.next = q;
            if (q.next == null || q.next.next == null) {
                break;
            }
            ListNode temp = q.next;
            q.next = q.next.next;
            q = temp;
            p = q.next;
        }

        return head;
    }
}
