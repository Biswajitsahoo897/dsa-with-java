// package Stack;

import java.util.Stack;

public class stackUsingCollections {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();

        s.push(12);
        s.push(34);
        s.push(15);
        s.push(82);
        System.out.println(s.peek());
        s.pop();
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        
        System.out.println(s.size());

    }
}
