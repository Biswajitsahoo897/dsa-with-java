// package Stack;
import java.util.*;

class MyStack{
    static ArrayList<Integer> list=new ArrayList<>();
    static boolean isEmpty(){
        return list.size()==0;
    }

    // push 
    void push(int data){
        list.add(data);
    }

    // pop
    int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top; 
    }

    // peek
    int peek(){
        if(isEmpty()) return -1;
        return list.get(list.size()-1);
    }
    void display(){
        if(isEmpty()) System.out.println("Stack is Empty!!!");
        int i=list.size()-1;
        while(i>=0){
            System.out.println(list.get(i));
            i--;
            System.out.println("--");
        }
    }
}
public class stackUsingArrayList {
    
    
    public static void main(String[] args) {
        MyStack s=new MyStack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println("Top element of stack :"+s.peek());
        s.pop();
        s.pop();
        // s.pop();
        // s.pop();
        // s.pop();
        System.out.println("Top element of stack :"+s.peek());
        s.display();
        

    }
}
