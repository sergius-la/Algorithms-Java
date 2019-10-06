package math.two_sum;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class TwoSumTest {
    
    private static TwoSum twoSum = new TwoSum();

    @DataProvider(name = "is-present")
    private Object[][] dataProviderIsPresent() {
        return new Object[][] {
                {new ArrayList<Integer>(Arrays.asList(1, 2, 3)), 4, true},
                {new ArrayList<Integer>(Arrays.asList(1, 2, 3)), 8, false},
        };
    }

    @Test(dataProvider = "is-present")
    public static void isPresentTest(ArrayList<Integer> numbers, int target, boolean expectedResult) {
        System.out.println(String.format("Numbers - <%s>", numbers));
        System.out.println(String.format("Target - <%d>", target));
        assertEquals(twoSum.isPresentBruteForce(numbers, target), expectedResult);
    }
}
