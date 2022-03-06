package linkedlist;

/**
 * Middle of the Linked List
 * https://leetcode.com/problems/middle-of-the-linked-list/
 *
 * Tests: LinkedListMiddleTest
* */
public class LinkedListMiddle {

    static class Solution {

        /**
         * time O(n)
         * space O(1)
        * */
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
}
