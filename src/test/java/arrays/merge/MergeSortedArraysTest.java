package arrays.merge;

import math.prime_number.PrimeNumber;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class MergeSortedArraysTest {
    
    private static MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();

    @DataProvider(name = "merge-arrays")
    private Object[][] dataProviderIsPresent() {
        return new Object[][] {
                {new ArrayList<Integer>(Arrays.asList(1, 2, 3)), new ArrayList<Integer>(Arrays.asList(1, 2, 3)), new ArrayList<Integer>(Arrays.asList(1, 1, 2, 2, 3, 3))},
                {new ArrayList<Integer>(Arrays.asList(1, 3)), new ArrayList<Integer>(Arrays.asList(1, 2, 3)), new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 3))},
        };
    }

    /**
     * TODO: Add data test data generator
    * */
    private Object[][] unitTestsDataGenerator() {
        Object[][] testData = new Object[30][];
        for (int i = 0; i < 30; i++) {
            testData[i] = testDataGenerator(i);
        }
        return testData;
    }

    private Object[] testDataGenerator(int number) {
        Object[] testData = {};
        return testData;
    }

    @Test(dataProvider = "merge-arrays")
    public static void isPrimeTest(ArrayList<Integer> arrOne, ArrayList<Integer> arrTwo, ArrayList<Integer> expectedResult) {
        System.out.println(String.format("Array #1 - <%s>", arrOne));
        System.out.println(String.format("Array #2 - <%s>", arrTwo));
        System.out.println(String.format("Expected result - <%s>", expectedResult));
        assertEquals(mergeSortedArrays.merge(arrOne, arrTwo), expectedResult);
    }
}
