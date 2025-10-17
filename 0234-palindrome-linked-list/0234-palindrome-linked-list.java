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
        ListNode og=head;
    
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode temp= reverse(slow.next);
        
        

        while(temp!=null){
            if(og.val !=temp.val){
                return false;
            }
            og=og.next;
            temp=temp.next;
        }
        return true;  

        
    }

    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        

        ListNode curr= head;
        ListNode prev=null;
        //ListNode next= head;
        while(curr!=null){
           ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}