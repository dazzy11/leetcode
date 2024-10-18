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
        Stack <Integer> s=new Stack<>();
        ListNode curr=head;
        ListNode t=head;
        int count=0,max=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        curr=head;
        for(int i=0;i<count/2;i++){
            s.push(head.val);
            head=head.next;
        }
        while(head!=null){
            int sum=head.val+s.pop();
            max=Math.max(sum,max);
            head=head.next;
        }
        return max;
    }
}