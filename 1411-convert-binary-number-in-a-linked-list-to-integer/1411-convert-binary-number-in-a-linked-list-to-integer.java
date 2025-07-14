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
    public int getDecimalValue(ListNode head) {
        int c=0,sum=0;
        ListNode hari=head;
        while(hari!=null){
            c++;
            hari=hari.next;
        }
        while(head!=null){
            sum=sum+head.val*(int)Math.pow(2,c-1);
            c--;
            head=head.next;
        }
        return sum;
    }
}