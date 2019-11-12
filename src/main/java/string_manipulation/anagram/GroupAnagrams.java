package string_manipulation.anagram;

import java.util.*;

public class GroupAnagrams {

    /**
     * Given an array of strings, group anagrams together.
     *
     * Example:
     * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
     * Output:
     * [
     *   ["ate","eat","tea"],
     *   ["nat","tan"],
     *   ["bat"]
     * ]
     *
     * Challenge - https://leetcode.com/problems/group-anagrams/
    * */
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap, List<String>> groups = new HashMap<>();
        for (String str: strs) {
            HashMap<String, Integer> letNum = getLetNum(str);
            if (groups.containsKey(letNum)) {
                List<String> list = groups.get(letNum);
                list.add(str);
                groups.put(letNum, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                groups.put(letNum, list);
            }
        }
        return new ArrayList<>(groups.values());
    }

    private HashMap<String, Integer> getLetNum(String str) {
        HashMap<String, Integer> result = new HashMap<>();
        for (Character character: str.toCharArray()) {
            String letter = character.toString();
            if (result.containsKey(letter)) {
                result.put(letter, result.get(letter) + 1);
            } else {
                result.put(letter, 1);
            }
        }
        return result;
    }
}
