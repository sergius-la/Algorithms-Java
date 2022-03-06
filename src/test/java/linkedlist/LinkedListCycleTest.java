package linkedlist;

import linkedlist.cycle.LinkedListCycle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkedListCycleTest {

    static LinkedListCycle.Solution solution = new LinkedListCycle.Solution();

    @Test
    private void unitTestOne() {
        ListNode three = new ListNode(3);
        ListNode two = new ListNode(2);
        ListNode zero = new ListNode(0);
        ListNode four = new ListNode(4);
        three.next = two;
        two.next = zero;
        zero.next = four;
        four.next = two;

        Assert.assertTrue(solution.hasCycle(three));
    }

    @Test
    private void unitTestTwo() {
        ListNode one = new ListNode(1);

        Assert.assertFalse(solution.hasCycle(one));
    }

    @Test
    private void unitTestFree() {
        Assert.assertFalse(solution.hasCycle(null));
    }

    @Test
    private void unitTestFour() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        one.next = two;

        Assert.assertFalse(solution.hasCycle(one));
    }

    @Test
    private void unitTestFive() {
        ListNode xOne = new ListNode(1);
        ListNode xTwo = new ListNode(1);
        ListNode xFree = new ListNode(1);
        ListNode xFour = new ListNode(1);
        xOne.next = xTwo;
        xTwo.next = xFree;
        xFree.next = xFour;

        Assert.assertFalse(solution.hasCycle(xOne));
    }
}
