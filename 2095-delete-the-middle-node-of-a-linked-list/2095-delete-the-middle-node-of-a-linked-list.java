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
    public ListNode deleteMiddle(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        ListNode l=head;
        if(head.next==null){
           return head=null;
        }
        while(f!=null && f.next!=null){
            f=f.next.next;
            l=s;
            s=s.next;
        }
        l.next=s.next;
        return head;
    }
}