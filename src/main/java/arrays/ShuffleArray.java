package arrays;

import java.util.Random;

public class ShuffleArray {

    /**
     * Shuffle an Array - https://leetcode.com/problems/shuffle-an-array/
     *
     * Given an integer array nums, design an algorithm to randomly shuffle the array.
     * All permutations of the array should be equally likely as a result of the shuffling.
    * */
    class Solution {

        int[] input;
        int[] nums;

        public Solution(int[] nums) {
            this.input = nums.clone();
            this.nums = nums;
        }

        public int[] reset() {
            return input;
        }

        public int[] shuffle() {
            Random random = new Random();
            for (int i = 0; i < nums.length; i++) {
                int j = random.nextInt(i + 1);
                swap(i, j);
            }
            return nums;
        }

        private void swap(int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
