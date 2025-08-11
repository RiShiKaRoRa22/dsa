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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        int i=0;
        while(i<k && temp!=null){
            temp=temp.next;
            i++;
        }

        if(i<k){
            return head;
        }
        ListNode index= reverse(head, temp);
        head.next=reverseKGroup(temp,k);
        return index;


        
    }
    public ListNode reverse(ListNode head, ListNode tail){
        ListNode curr=head;
        ListNode next;
        ListNode prev=null;
        while(curr!=tail){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        return prev;
    }
}