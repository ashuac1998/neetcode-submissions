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
        ListNode pt1 = null;
        ListNode pt2 = head;

        while(pt2 != null){
            ListNode temp = pt2.next;
            pt2.next = pt1;
            pt1 = pt2;
            pt2 = temp;
        }
        return pt1;
    }
}
