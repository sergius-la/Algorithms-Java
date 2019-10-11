package arrays.merge;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class MergeSortedArrays {

    public ArrayList<Integer> merge(ArrayList arrOne, ArrayList arrTwo) {
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
    }
