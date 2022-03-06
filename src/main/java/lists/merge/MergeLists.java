package lists.merge;

import linkedlist.ListNode;

import java.util.PriorityQueue;

public class MergeLists {

    public static void main(String[] args) {
        ListNode[] listNodes = new ListNode[3];
        ListNode one1 = new ListNode(1);
        ListNode one2 = new ListNode(4);
        ListNode one3 = new ListNode(5);
        one1.next = one2;
        one2.next = one3;
        listNodes[0] = one1;
    }

    /**
     * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
     *
     * Example:
     *
     * Input:
     * [
     *   1->4->5,
     *   1->3->4,
     *   2->6
     * ]
     * Output: 1->1->2->3->4->4->5->6
     *
     * Challenge - https://leetcode.com/problems/merge-k-sorted-lists/
    * */
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (ListNode head: lists) {
            while (head != null) {
                minHeap.add(head.val);
                head = head.next;
            }
        }

        ListNode container = new ListNode(-1);
        ListNode head = container;
        while (!minHeap.isEmpty()) {
            head.next = new ListNode(minHeap.remove());
            head = head.next;
        }
        return container;
    }
}
