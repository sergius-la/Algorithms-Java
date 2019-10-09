package string_manipulation.anagram;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AnagramTest {

    private static Anagram anagram = new Anagram();

    @DataProvider(name = "anagram")
    private Object[][] dataProviderIsPresent() {
        return new Object[][] {
                {"listen", "silent", true},
                {"12345", "54123", true},
                {"listen", "silent1", false},
                {"listen", "", false},
                {"", "", false},
        };
    }

    @Test(dataProvider = "anagram")
    public static void isAnagram(String word, String target, boolean expectedResult) {
        System.out.println(String.format("Check word - <%s>", word));
        System.out.println(String.format("Target - <%s>", target));
        assertEquals(anagram.isAnagram(word, target), expectedResult);
    }
}
