package string_manipulation.first_character;

import java.util.HashMap;

public class FirstUnique {

    /**
     * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
     *
     * Examples:
     * s = "leetcode"
     * return 0.
     *
     * s = "loveleetcode",
     * return 2.
     *
     * Challenge - https://leetcode.com/problems/first-unique-character-in-a-string/
    * */
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> charIndex = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (!charIndex.containsKey(s.charAt(i))) {
                charIndex.put(character, i);
            } else {
                charIndex.put(character, -1);
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i: charIndex.values()) {
            if (i != -1 && i < res) {
                res = i;
            }
        }
        if (res != Integer.MAX_VALUE) {
            return res;
        } else {
            return -1;
        }
    }
}
