package search.numbers;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import string_manipulation.anagram.Anagram;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class BinarySearchTest {

    private static BinarySearch binarySearch = new BinarySearch();

    @DataProvider(name = "binarySearch")
    private Object[][] dataProvider() {
        return new Object[][] {
                {new int[]{1, 3, 5, 7}, 7, 3},
                {new int[]{1, 3, 5, 7}, 1, 0},
                {new int[]{1, 3, 5, 7}, 2, -1},
        };
    }

    @Test(dataProvider = "binarySearch")
    public static void getIndex(int[] a, int target, int expectedResult) {
        System.out.println(String.format("Check array - <%s>", Arrays.toString(a)));
        System.out.println(String.format("Target - <%s>", target));
        System.out.println(String.format("Expected index - <%s>", expectedResult));
        assertEquals(binarySearch.getIndex(a, target), expectedResult);
    }
}
