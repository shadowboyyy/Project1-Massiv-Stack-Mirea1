import java.util.Stack;

public class Main {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                return false;
            } else if (c == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                return false;
            } else if (c == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                return false;
            }
        }
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        String[] tests = {"()", "()[]{}", "(]", "([)]", "{[]}", ""};
        for (String test : tests) {
            System.out.println("'" + test + "': " + isBalanced(test));
        }
    }
}