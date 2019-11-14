package string_manipulation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.text.MessageFormat;

import static org.testng.Assert.assertEquals;

public class DetectCapitalTest {

    private static DetectCapital detectCapital = new DetectCapital();

    @DataProvider(name = "dataProvider")
    private Object[][] dataProvider() {
        return new Object[][] {
                {"USA", true},
                {"FlaG", false},
                {"leetcode", true},
                {"Leetcode", true},
        };
    }

    @Test(dataProvider = "dataProvider")
    public static void detectCapital(String word, boolean expectedResult) {
        System.out.println(MessageFormat.format("Check word - {0}}", word));
        System.out.println(MessageFormat.format("Expected result - {0}", expectedResult));
        assertEquals(detectCapital.detectCapitalUse(word), expectedResult);
    }
}
