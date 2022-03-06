package linkedlist.cycle;

import linkedlist.ListNode;

public class LinkedListCycle {
    /**
     * Linked List Cycle
     * https://leetcode.com/problems/linked-list-cycle/
     *
     * Tests: LinkedListCycleTest
    * */
    public static class Solution {

        /**
         * time O(n)
         * space O(1)
        * */
        public boolean hasCycle(ListNode head) {
            if (head == null) return false;
            if (head.next == null) return false;

            ListNode slow = head;
            ListNode fast = head.next;

            // Check the end of the node
            while (slow != null && fast.next != null) {
                // If node has cycle pointers will meet
                if (slow == fast) {
                    return true;
                } else {
                    if (fast.next.next == null) return false;

                    // Initiate next iteration
                    slow = slow.next;
                    fast = fast.next.next;
                }
            }
            return false;
        }
    }
}
