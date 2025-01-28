class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp1 = head;
        ListNode temp2 = head;
        int size = 0;
        
        while (temp1 != null) {
            size++;
            temp1 = temp1.next;
        }
        
        int to_del = size - n;
        
        if (to_del == 0) {
            return head.next;
        }
        
        for (int i = 0; i < to_del - 1; i++) {
            temp2 = temp2.next;
        }
        
        temp2.next = temp2.next.next;
        
        return head;
    }
}
