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
    public boolean nextIsCritical(ListNode head){
        if(head.next!=null&&head.next.next!=null){
            if(head.val<head.next.val&&head.next.val>head.next.next.val){
                return true;
            }
            if(head.val>head.next.val&&head.next.val<head.next.next.val){
                return true;
            }
        }
        return false;
    }
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> list=new ArrayList();
        int[] res=new int[2];
        int i=1;
        while(head!=null){
            boolean check=nextIsCritical(head);
            head=head.next;
            i++;
            if(check==true){
                list.add(i);
            }
        }
        if(list.size()<2){
            res[0]=-1;
            res[1]=-1;
            return res;
        }
        res[1]=list.get(list.size()-1)-list.get(0);
        res[0]=list.get(1)-list.get(0);
        for(i=1;i<list.size()-1;i++){
            if(list.get(i+1)-list.get(i)<res[0]) res[0]=list.get(i+1)-list.get(i);
        }
        return res;
    }
}