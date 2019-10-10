package string_manipulation.balanced_parentheses;

import java.util.Stack;

public class BalancedParentheses {

    public boolean isBalanced(String str) {
        if (!dataCheck(str)) return false;

        Stack<Character> stack = new Stack<Character>();
        for (char c: str.toCharArray()) {
            if (isOpen(c)) {
                stack.push(c);
            } else if (isClose(c)) {
                if (stack.size() > 0 && isOpen(stack.peek())) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return !(stack.size() > 0);
    }

    private boolean isOpen(char c) {
        return (c == '{' || c == '(' || c == '[');
    }

    private boolean isClose(char c) {
        return (c == '}' || c == ')' || c == ']');
    }

    private boolean dataCheck(String str) {
        return str.length() >= 2;
    }
}
