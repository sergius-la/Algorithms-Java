package strings.stack;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Stack;

public class ValidParentheses {

    Solution solution = new Solution();

    @Test
    private void unitTests() {
        Assert.assertTrue(solution.isValid("()"));
        Assert.assertTrue(solution.isValid("()[]{}"));
        Assert.assertFalse(solution.isValid("(]"));
        Assert.assertFalse(solution.isValid("("));
    }

    /**
     * Valid Parentheses
     * https://leetcode.com/problems/valid-parentheses
     *
     * time O(n)
     * space O(1)
    * */
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack();
            for (Character character : s.toCharArray()) {
                if (isOpen(character)) {
                    stack.add(character);
                } else if (isClose(character)) {
                    if (stack.size() > 0 && isPair(stack.peek(), character)) {
                        stack.pop();
                    } else {
                        stack.add(character);
                    }
                }
            }
            return !(stack.size() >= 1);
        }

        private boolean isOpen(Character character) {
            return character == '[' || character == '{' || character == '(';
        }

        private boolean isClose(Character character) {
            return character == ']' || character == '}' || character == ')';
        }

        private boolean isPair(Character stack, Character current) {
            switch (current) {
                case ']':
                    return stack == '[';
                case ')':
                    return stack == '(';
                case '}':
                    return stack == '{';
                default:
                    return false;
            }
        }
    }
}
