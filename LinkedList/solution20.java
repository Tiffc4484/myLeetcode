import java.util.*;
public class solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        ArrayList<Character> left = new ArrayList<>();
        ArrayList<Character> right = new ArrayList<>();
        left.add('{');
        left.add('(');
        left.add('[');
        right.add('}');
        right.add(')');
        right.add(']');
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (left.contains(currentChar)) {
                stack.push(currentChar);
            } else if (right.contains(currentChar) && stack.isEmpty()) {
                return false;
            } else {
                if (currentChar == '}' && stack.peek() != '{'){
                    return false;
                } else if (currentChar == ']' && stack.peek() != '[') {
                    return false;
                } else if (currentChar == ')' && stack.peek() != '(') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
