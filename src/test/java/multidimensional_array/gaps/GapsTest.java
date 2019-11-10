package multidimensional_array.gaps;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class GapsTest {

    private static Gaps gaps = new Gaps();

    @DataProvider(name = "data")
    private Object[][] dataProvider() {
        return new Object[][] {
                {new int[][] {{1, 2}, {2, 10}, {10, 15}}, false},
                {new int[][] {{1, 2}, {5, 10}, {10, 15}}, true},
                {new int[][] {{1, 2}, {5, 10}, {18, 15}}, true},
                {new int[][] {{1, 2}, {5, 10}}, true},
                {new int[][] {{1, 2}, {2, 10}}, false},
                {new int[][] {{1, 2}}, false},
                {new int[][] {{}}, false}
        };
    }

    @Test(dataProvider = "data")
    public static void hasGapsTest(int[][] a, boolean expectedResult) {
        System.out.println(String.format("Array #1 - <%s>", Arrays.deepToString(a)));
        System.out.println(String.format("Expected result - <%s>", expectedResult));
        assertEquals(gaps.hasGap(a), expectedResult);
    }
}
