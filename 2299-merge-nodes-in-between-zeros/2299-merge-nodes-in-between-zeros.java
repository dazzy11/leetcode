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
    public ListNode mergeNodes(ListNode head) {
        ListNode an=new ListNode();
        ListNode temp=an;
       while(head!=null){
        int sum=0;
        while(head.val!=0){
            sum=sum+head.val;
            head=head.next;
        }
        if(sum!=0){
        ListNode n=new ListNode(sum);
        an.next=n;
        an=an.next;
        }
        head=head.next;
       } 
       return temp.next;
    }
}