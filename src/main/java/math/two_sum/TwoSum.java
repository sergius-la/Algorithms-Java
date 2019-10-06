package math.two_sum;

import java.util.ArrayList;

public class TwoSum {

    /**
     * You are given an array of n integers and a number k. Determine whether there is a pair
     * of elements in the array that sums to exactly k. For example, given the array [1, 3, 7] and
     * k = 8, the answer is “yes,” but given k = 6 the answer is “no.”
    * */
    public boolean isPresentBruteForce(ArrayList<Integer> numbers, int target) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
