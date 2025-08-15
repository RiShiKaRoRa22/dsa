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
    public int pairSum(ListNode head) {
        int max=head.val;
        ListNode dummy= new ListNode(0);
        ListNode temp1=head;
        ListNode copy= dummy;
        while(temp1!=null){
            copy.next=new ListNode(temp1.val);
            copy=copy.next;
            temp1=temp1.next;
        }
        ListNode rev= reverseLL(dummy.next);
        ListNode temp= head;
        
        while(rev!=null && temp!=null){
            int sum=rev.val + temp.val;
            max=Math.max(max,sum);
            rev=rev.next;
            temp=temp.next;

        }
        return max;
        
    }
    public ListNode reverseLL(ListNode head){
        ListNode curr= head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}