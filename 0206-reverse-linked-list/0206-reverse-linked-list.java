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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        Stack <Integer> st=new Stack<>();
        ListNode curr=head;
        while(curr.next!=null){
            st.push(curr.val);
            curr=curr.next;
        }
        st.push(curr.val);
        ListNode an=new ListNode(curr.val);
        ListNode pre=an;
        st.pop();
        while(!st.isEmpty()){
            ListNode temp=new ListNode(st.pop());
            an.next=temp;
            an=an.next;
        }
        return pre;
    }
}