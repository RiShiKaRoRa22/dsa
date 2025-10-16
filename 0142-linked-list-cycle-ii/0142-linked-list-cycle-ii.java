/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }

        List<ListNode> list= new ArrayList<>();

        ListNode temp=head;
        while(temp!=null && !list.contains(temp) ){
            list.add(temp);
            temp=temp.next;
        }
        return temp;
        
    }
}