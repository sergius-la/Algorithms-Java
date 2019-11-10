package arrays.merge;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;

public class MergeSortedArraysTest {
    
    private static MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();

    @DataProvider(name = "merge-arrays")
    private Object[][] dataProvider() {
        return new Object[][] {
                {new int[]{1, 2, 3}, new int[]{1, 2, 3}, new int[]{1, 1, 2, 2, 3, 3}},
                {new int[]{1, 3}, new int[]{1, 2, 3}, new int[]{1, 1, 2, 3, 3}},
        };
    }

    @Test(dataProvider = "merge-arrays")
    public static void mergeArray(int[] a, int[] b, int[] expectedResult) {

        System.out.println(String.format("Array #1 - <%s>", getArrayList(a)));
        System.out.println(String.format("Array #2 - <%s>", getArrayList(b)));
        System.out.println(String.format("Expected result - <%s>", getArrayList(expectedResult)));
        assertEquals(mergeSortedArrays.mergeArray(a, b), expectedResult);
    }

    @Test(dataProvider = "merge-arrays")
    public static void mergeQueue(int[] a, int[] b, int[] expectedResult) {

        System.out.println(String.format("Array #1 - <%s>", getArrayList(a)));
        System.out.println(String.format("Array #2 - <%s>", getArrayList(b)));
        System.out.println(String.format("Expected result - <%s>", getArrayList(expectedResult)));
        assertEquals(mergeSortedArrays.mergeQueue(getArrayList(a), getArrayList(b)), getArrayList(expectedResult));
    }

    private static ArrayList<Integer> getArrayList(int[] a) {
        ArrayList result = new ArrayList();
        for (int i: a) {
            result.add(i);
        }
        return result;
    }
}
