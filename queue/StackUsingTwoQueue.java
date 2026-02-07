package queue;

import java.util.LinkedList;
import java.util.Queue;
public class StackUsingTwoQueue {
    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2=new LinkedList<>();
    
    static boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
    }
    
    static void push(int data){
        if(!q1.isEmpty()) {
            q1.add(data);
        }else{
            q2.add(data);
        }
        
    }
    
    static int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int top=-1;
    
        //case 1
        if(!q1.isEmpty()){
            while (!q1.isEmpty()) {
                top=q1.remove();
                if(q1.isEmpty()){
                    break;
                }
                q2.offer(top);
            }
        }
        //case 2 
        else{
            while (!q2.isEmpty()) {
                top=q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.offer(top);
            }
        }
        return top;  
    }
    static int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int top=-1;
    
        //case 1
        if(!q1.isEmpty()){
            while (!q1.isEmpty()) {
                top=q1.remove();
                q2.offer(top);
            }
            //case 2 
        }else{
            while (!q2.isEmpty()) {
                top=q2.remove();
                q1.offer(top);
            }
        }
        return top; 
    }
    public static void main(String[] args) {
        StackUsingTwoQueue.push(10);
        StackUsingTwoQueue.push(11);
        StackUsingTwoQueue.push(12);
        StackUsingTwoQueue.push(13);
        StackUsingTwoQueue.push(14);

        // display
        while(!StackUsingTwoQueue.isEmpty()){
            System.out.println(StackUsingTwoQueue.peek());
            StackUsingTwoQueue.pop();
        }
        // StackUsingTwoQueue.push(13);
        // StackUsingTwoQueue.push(14);
        // System.out.println(StackUsingTwoQueue.peek());
        // System.out.println(q1);
        // StackUsingTwoQueue.push(15);
        // System.out.println(q2);
        // System.out.println(StackUsingTwoQueue.peek());
    }
}
