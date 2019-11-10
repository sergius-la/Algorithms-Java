package sorting.numbers;

import java.util.ArrayList;

public class QuickSort {

    /**
     *  Quick sort by Tony Hoare
     * */
    public ArrayList<Integer> sortTonyHoare(ArrayList<Integer> a) {
        if (a.size() <= 1) {
            return a;
        }
        int barrier = a.get(0);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> middle = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for (int i: a) {
            if (i < barrier) {
                left.add(i);
            } else if (i == barrier) {
                middle.add(i);
            } else {
                right.add(i);
            }
        }
        ArrayList<Integer> leftSort = sortTonyHoare(left);
        ArrayList<Integer> rightSort = sortTonyHoare(right);

        a = new ArrayList<>();
        a.addAll(leftSort);
        a.addAll(middle);
        a.addAll(rightSort);
        return a;
    }
}
