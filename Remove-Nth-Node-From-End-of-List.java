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
    public int size(ListNode head){
        int c = 0;
        ListNode current = head;
        while(current != null){
            current = current.next;
            c++;
        }
        return c;   
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = size(head);


        if (n == size) {
            head = head.next;
            return head;
        }

        int removeAfter = size - n -1;
        ListNode prev = head;
        for (int i = 0; i < removeAfter; i++) {
            prev = prev.next;
        }

        ListNode current = prev.next;
        prev.next = current.next;
        current.next = null;

        return head;
    }
}
