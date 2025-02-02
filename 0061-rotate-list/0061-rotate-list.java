class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;

        ListNode p = head;
        int n = 1;
        while (p.next != null) {
            p = p.next;
            n++;
        }

        k %= n;
        if (k == 0) return head;

        p.next = head;

        for (int i = 0; i < n - k; i++) {
            p = p.next;
        }

        head = p.next;
        p.next = null;

        return head;
    }
}
