package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    static boolean ParenthesesChecker(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

            if (curr == '(' || curr == '{' || curr == '[')
                stack.push(curr);

            else {
                if (stack.isEmpty())
                    return false;
                else {
                    if ((stack.peek() == '{' && curr == '}') ||
                            (stack.peek() == '[' && curr == ']') ||
                            (stack.peek() == '(' && curr == ')'))
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Stack<Integer> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        // String s = "{{}}[]";
        System.out.println(ParenthesesChecker(s));
        sc.close();

    }
}
