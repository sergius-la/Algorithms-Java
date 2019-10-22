package string_manipulation.first_uppercase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import string_manipulation.balanced_parentheses.BalancedParentheses;

import static org.testng.Assert.assertEquals;

public class FirstUpperCaseTest {

    private static FirstUpperCase firstUpperCase = new FirstUpperCase();

    @DataProvider(name = "isUpperCase")
    private Object[][] dataProviderIsPresent() {
        return new Object[][] {
                {"Abcd", 'A'},
                {"AAbcd", 'A'},
                {"abcD", 'D'},
                {"", ' '},
                {"AAA", 'A'},
                {"aBc", 'B'},
        };
    }

    @Test(dataProvider = "isUpperCase")
    public static void firstUpperCaseLetter(String str, char expectedResult) {
        System.out.println(String.format("Check string - <%s>", str));
        System.out.println(String.format("Expected result - <%s>", expectedResult));
        assertEquals(firstUpperCase.getFirstUppercase(str), expectedResult);
    }
}
