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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int len=1;
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            len++;
        }
        k=k%len;
        if(k==0)
        {
            return head;
        }
        temp.next=head;
        int count=len-k;
        ListNode temp2=head;
        while(count!=1)
        {
            temp2=temp2.next;
            count--;
        }
        ListNode temp3=temp2.next;
        temp2.next=null;
        return temp3;
    }
}