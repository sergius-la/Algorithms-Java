package linkedlist;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkedListMiddleTest {

    static LinkedListMiddle.Solution solution = new LinkedListMiddle.Solution();

    @Test
    public void unitTestOne() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3); // Expected
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        one.next = two;
        two.next = three;
        three.next = four;

        Assert.assertEquals(three, solution.middleNode(one));
    }

    @Test
    public void unitTestTwo() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4); // Expected
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        Assert.assertEquals(four, solution.middleNode(one));
    }
}
