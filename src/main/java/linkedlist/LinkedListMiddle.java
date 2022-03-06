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
            // Pointers from head
            ListNode slow = head;
            ListNode fast = head;

            // Check for null head
            // Exit at the end of list
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            // Slow pointer will be in the middle
            return slow;
        }
    }
}
