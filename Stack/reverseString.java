import java.util.Stack;
public class reverseString {
    static String reverse(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        StringBuilder newStr=new StringBuilder();

        while(!st.empty()){
            char top=st.peek();
            newStr.append(top);
            st.pop();
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        String s="BhubaneswaR";
        System.out.println(reverse(s));
    }
}
