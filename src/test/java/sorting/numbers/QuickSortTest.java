package sorting.numbers;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import search.numbers.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class QuickSortTest {

    private static QuickSort quickSort = new QuickSort();

    @DataProvider(name = "data")
    private Object[][] dataProvider() {
        return new Object[][] {
                {new int[]{3, 2, 1}, new int[]{1, 2, 3}},
                {new int[]{}, new int[]{}},
                {new int[]{3, 2, 1, 6, -5, 40}, new int[]{-5, 1, 2, 3, 6, 40}},
        };
    }

    @Test(dataProvider = "data")
    public static void getIndex(int[] a, int[] expectedResult) {
        System.out.println(String.format("Check array - <%s>", getArrayList(a)));
        System.out.println(String.format("Expected - <%s>", getArrayList(expectedResult)));
        assertEquals(quickSort.sortTonyHoare(getArrayList(a)), getArrayList(expectedResult));
    }

    private static ArrayList<Integer> getArrayList(int[] a) {
        ArrayList result = new ArrayList();
        for (int i: a) {
            result.add(i);
        }
        return result;
    }
}
