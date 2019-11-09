package search.numbers;

public class BinarySearch {

    /**
     * Returns the index of the target value in a sorted array using binary search. Returns -1 if the target value is not in the array.
     * The array will have a length >= 1 and does not contain any duplicate values.
     * Challenge - https://codingbat.com/prob/p212935
     * */
    public int getIndex(int[] a, int target) {
        int left = -1;
        int right = a.length;
        while ((right - left) > 1) {
            int middle = (left + right) / 2;
            if (a[middle] == target) {
                return middle;
            }
            if (a[middle] < target) {
                left = middle;
            } else {
                right = middle;
            }
        }
        return -1;
    }
}
