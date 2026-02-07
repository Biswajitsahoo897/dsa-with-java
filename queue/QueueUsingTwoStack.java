package queue;

import java.util.Stack;

public class QueueUsingTwoStack {
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();

    static boolean isEmpty(){
        return s1.isEmpty();
    }
    static void add(int data){
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        
        s1.push(data);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

    }
    static int remove(){
        if(s1.isEmpty()){
            System.out.println("ueue is Empty");
            return -1;
        }
        return s1.pop();
    }
    static int peek(){
        if(s1.isEmpty()) return -1;
        else return s1.peek();
    }
    public static void main(String[] args) {
        QueueUsingTwoStack.add(1);
        QueueUsingTwoStack.add(2);
        QueueUsingTwoStack.add(40);
        QueueUsingTwoStack.add(28);
        QueueUsingTwoStack.add(45);
        QueueUsingTwoStack.add(21);
        QueueUsingTwoStack.add(54);
        QueueUsingTwoStack.add(29);
        QueueUsingTwoStack.add(34);

        QueueUsingTwoStack.remove();
        QueueUsingTwoStack.remove();
        QueueUsingTwoStack.remove();
        while(!isEmpty()){
            System.out.println(QueueUsingTwoStack.peek());
            QueueUsingTwoStack.remove();
        }
    }
}
