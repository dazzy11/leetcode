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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        if(head==null){
            return null;
        }
        ListNode curr1=head.next;
        while(curr!=null&&curr1!=null){
            if(curr.val==curr1.val){
                curr.next=curr1.next;
                curr1=curr.next;
            }
            else{
            curr=curr.next;
            curr1=curr1.next;
            }
        }
        return head;
    }
}