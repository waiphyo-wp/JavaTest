package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckCharByDequeStack {
    public static void main(String[] args) {
        System.out.println(CheckCharByDequeStack.check("{()[]}[]"));
    }

    public static boolean check(String str) {
        char[] array = str.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : array) {

            // open char
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
                continue;
            }
            System.out.println("hello");

            if (stack.isEmpty()) {
                return false;
            }

            char open = stack.pop();
            if ((open == '(' && c != ')' )
                ||
                (open == '[' && c != ']')
                ||
                (open == '{' && c != '}'))
            {
                System.out.println("not equal open close");
                return false;
            }
        }

        return stack.isEmpty(); // always true
    }
}
