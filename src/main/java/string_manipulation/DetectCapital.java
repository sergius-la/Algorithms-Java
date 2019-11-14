package string_manipulation;

public class DetectCapital {

    /**
     * Given a word, you need to judge whether the usage of capitals in it is right or not.
     *
     * We define the usage of capitals in a word to be right when one of the following cases holds:
     *
     * All letters in this word are capitals, like "USA".
     * All letters in this word are not capitals, like "leetcode".
     * Only the first letter in this word is capital, like "Google".
     * Otherwise, we define that this word doesn't use capitals in a right way.
     *
     *
     * Example 1:
     * Input: "USA"
     * Output: True
     *
     *
     * Example 2:
     * Input: "FlaG"
     * Output: False
     *
     * Challenge - https://leetcode.com/problems/detect-capital/
    * */
    public boolean detectCapitalUse(String word) {
        int numUpperCase = 0;
        for (Character current: word.toCharArray()) {
            if (isUpperCase(current)) {
                numUpperCase++;
            }
        }
        boolean firstCapital = (word.length() > 0 && isUpperCase(word.charAt(0)) && numUpperCase == 1);
        if (numUpperCase == word.length() && word.length() > 0) {
            return true;
        } else if (firstCapital) {
            return true;
        } else if (numUpperCase == 0 && word.length() > 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isUpperCase(Character character) {
        String upper = character.toString().toUpperCase();
        return upper.equals(character.toString());
    }
}
