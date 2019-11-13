package arrays.in_place;

import java.util.HashMap;

public class RemoveElement {
    /**
     *
     * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
     *
     * Example:
     * Given nums = [3,2,2,3], val = 3,
     * Your function should return length = 2, with the first two elements of nums being 2.
     * It doesn't matter what you leave beyond the returned length.
     *
     * [LeetCode] - https://leetcode.com/problems/remove-element/description/
    * */
    public int removeElement(int[] nums, int val) {
        int resIndex = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] != val) {
                nums[resIndex] = nums[i];
                resIndex++;
            }
        }

        HashMap<Character, Integer> rest = new HashMap<>();
        int res = Integer.MAX_VALUE;
        for (int i: rest.values()) {
            if (i != -1 && i < res) {
                res = i;
            }
        }
        return resIndex;
    }
}
