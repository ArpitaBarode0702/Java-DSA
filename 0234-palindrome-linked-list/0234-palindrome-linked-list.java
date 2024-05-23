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
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middleNode(head);
        ListNode reverse=reverse(mid);
        ListNode secondhead=reverse;
        
        while(head!=null && secondhead!=null){
         if(head.val!=secondhead.val){
             break;
         }
            head=head.next;
            secondhead=secondhead.next;
        }
        
        return head==null || secondhead==null;
        
        
    }
    public ListNode middleNode(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
          
           
            
        }
             return s;
        
    }
    public ListNode reverse(ListNode node){
        if(node==null){
            return node;
        }
        ListNode prev=null;
        ListNode pres=node;
        ListNode next=pres.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }
        }
        node=prev;
        return prev;
        
    }
}