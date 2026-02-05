import java.util.Stack;
public class reverseStackUsingRecursion {
    static void reverse(Stack<Integer> st){
        // base condition 
        if(st.empty()){
            return;
        }
        int top=st.pop();
        reverse(st);
        PushAtBottom(st,top);

    }
    static void PushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        PushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("The original stack:");
        System.out.println(st);
        reverse(st);
        System.out.println("reversed stack:");
        System.out.println(st);
    }
}
