// package Stack;
import java.util.Stack;

public class pushAtBottomOfStack {
    
    static void PushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        PushAtBottom(s, data);
        s.push(top);
    }

    // display
    static void display(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        } 
        int top=s.pop();
        display(s); //as it updates the s , so basically top--
        System.out.println(top);
        s.push(top); //restore the stack by pushing

    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(12);
        s.push(10);
        s.push(18);
        s.push(16);

        PushAtBottom(s, 78);

        display(s);

    }
}
