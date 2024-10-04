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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev=head,curr=head.next;
        while(curr!=null){
            ListNode temp= new ListNode(gcd(prev.val,curr.val));
            temp.next=curr;
            prev.next=temp;
            prev=curr;
            curr=curr.next;
        }
        return head;
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}