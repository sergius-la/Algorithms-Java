package string_manipulation.anagram;

import java.util.HashMap;

/**
 * Two strings are said to be anagrams of one another if you can turn the first string into
 * the second by rearranging its letters. For example, “table” and “bleat” are anagrams, as
 * are “tear” and “rate.” Your job is to write a function that takes in two strings as input and
 * determines whether they're anagrams of one another.
 * */
public class Anagram {

    /**
     * Count letters method will work for O(n) depends on string size.
     * HashMap compare will depends on Java version.
     * */
    public boolean isAnagram(String strOne, String strTwo) {
        if (dataCheck(strOne, strTwo)) return false;

        HashMap<String, Integer> lettersOne = countLetters(strOne);
        HashMap<String, Integer> lettersTwo = countLetters(strTwo);
        return lettersOne.equals(lettersTwo);
    }

    private HashMap<String, Integer> countLetters(String word) {
        HashMap<String, Integer> letters = new HashMap<String, Integer>();
        for (String character: word.split("")) {
            if (letters.get(character) == null) {
                letters.put(character, 1);
            } else {
                letters.put(character, letters.get(character) + 1);
            }
        }
        return letters;
    }

    private boolean dataCheck(String strOne, String strTwo) {
        return !(strOne.length() > 0 && strTwo.length() > 0);
    }
}
