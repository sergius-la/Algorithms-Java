package string_manipulation.balanced_parentheses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import string_manipulation.anagram.Anagram;

import static org.testng.Assert.assertEquals;

public class BalancedParenthesesTest {

    private static BalancedParentheses balancedParentheses = new BalancedParentheses();

    @DataProvider(name = "anagram")
    private Object[][] dataProviderIsPresent() {
        return new Object[][] {
                {"[()]{}{[()()]()}", true},
                {"[][][]", true},
                {"[]][]", false},
                {"[]][]", false},
                {"[{()}]", true},
                {"[{(()}]", false},
                {"", false},
        };
    }

    @Test(dataProvider = "anagram")
    public static void isAnagram(String str, boolean expectedResult) {
        System.out.println(String.format("Check string - <%s>", str));
        System.out.println(String.format("Expected result - <%s>", expectedResult));
        assertEquals(balancedParentheses.isBalanced(str), expectedResult);
    }
}
