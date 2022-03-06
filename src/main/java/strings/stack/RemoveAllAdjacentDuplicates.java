package strings.stack;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {

    Solution solution = new Solution();

    @Test
    private void tests() {
        Assert.assertEquals(solution.removeDuplicates("abbaca"), "ca");
        Assert.assertEquals(solution.removeDuplicates("azxxzy"), "ay");
    }

    /**
     * Remove All Adjacent Duplicates In String
     * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
     *
     * tine O(n)
     * space O(1)
    * */
    class Solution {
        public String removeDuplicates(String s) {
            Stack<Character> stack = new Stack();
            for (Character character: s.toCharArray()) {
                if (stack.isEmpty()) {
                    stack.add(character);
                } else {
                    // Check last character in the stack
                    if (stack.get(stack.size() -1) == character) {
                        stack.pop();
                    } else {
                        stack.add(character);
                    }
                }
            }
            return getReversedString(stack);
        }

        private String getReversedString(Stack<Character> stack) {
            StringBuilder stringBuilder = new StringBuilder();
            while (!stack.isEmpty()) {
                stringBuilder.append(stack.pop());
            }
            return stringBuilder.reverse().toString();
        }
    }
}
