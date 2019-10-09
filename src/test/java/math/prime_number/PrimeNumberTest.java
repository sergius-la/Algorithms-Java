package math.prime_number;

import math.two_sum.TwoSum;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class PrimeNumberTest {
    
    private static PrimeNumber primeNumber = new PrimeNumber();
    private static ArrayList<Integer> primeNumbers = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));

    @DataProvider(name = "is-prime")
    private Object[][] dataProviderIsPresent() {
        return unitTestsDataGenerator();
    }

    private Object[][] unitTestsDataGenerator() {
        Object[][] testData = new Object[30][];
        for (int i = 0; i < 30; i++) {
            testData[i] = testDataGenerator(i);
        }
        return testData;
    }

    private Object[] testDataGenerator(int number) {
        Object[] testData = {number, primeNumbers.contains(number)};
        return testData;
    }

    @Test(dataProvider = "is-present")
    public static void isPresentTest(ArrayList<Integer> numbers, int target, boolean expectedResult) {
        System.out.println(String.format("Numbers - <%s>", numbers));
        System.out.println(String.format("Target - <%d>", target));
//        assertEquals(twoSum.isPresentBruteForce(numbers, target), expectedResult);
    }
}
