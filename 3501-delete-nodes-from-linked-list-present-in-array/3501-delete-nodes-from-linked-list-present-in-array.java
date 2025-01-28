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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ListNode p=new ListNode();
        p.next=head;
        ListNode ans=p;
        while(p.next!=null){
            if(set.contains(p.next.val)){
                p.next=p.next.next;
            }
            else p=p.next;
        }
        return ans.next;
    }
}