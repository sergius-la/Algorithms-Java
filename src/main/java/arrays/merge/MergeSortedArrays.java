package arrays.merge;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class MergeSortedArrays {

    /**
     * Merge sorted arrays with with Queue
    * */
    public ArrayList<Integer> mergeQueue(ArrayList arrOne, ArrayList arrTwo) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        Queue<Integer> queueOne = new ArrayDeque<Integer>();
        queueOne.addAll(arrOne);
        Queue<Integer> queueTwo = new ArrayDeque<Integer>();
        queueTwo.addAll(arrTwo);

        while (queueOne.size() > 0 && queueTwo.size() > 0) {
            if (queueOne.peek() < queueTwo.peek()) {
                result.add(queueOne.peek());
                queueOne.remove();
            } else {
                result.add(queueTwo.peek());
                queueTwo.remove();
            }
        }

        if (queueOne.size() > 0) {
            result.addAll(queueOne);
        } else if (queueTwo.size() > 0) {
            result.addAll(queueTwo);
        }

        return result;
    }

    /**
     * Merge sorted arrays
    * */
    public int[] mergeArray(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIdx = 0, bIdx = 0, resIdx = 0;
        while (aIdx < a.length - 1 || bIdx < b.length - 1) {
            if (a[aIdx] < b[bIdx]) {
                result[resIdx] = a[aIdx];
                resIdx++;
                aIdx++;
            } else {
                result[resIdx] = b[bIdx];
                resIdx++;
                bIdx++;
            }
        }

        while (aIdx < a.length) {
            result[resIdx] = a[aIdx];
            resIdx++;
            aIdx++;
        }

        while (bIdx < b.length) {
            result[resIdx] = b[bIdx];
            resIdx++;
            bIdx++;
        }
        return result;
    }
}
