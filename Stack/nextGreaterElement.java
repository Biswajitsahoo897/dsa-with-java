// package Stack;
// import java.util.*;
import java.util.Stack;
public class nextGreaterElement {
    static void nextGreater(String s){
        String []parts=s.split("\\s+");
        int n=parts.length;
        
        int []res=new int[n];
        int []ans=new int[n];
        
        for(int i=0;i<n;i++){
            res[i]=-1;
            ans[i]=Integer.parseInt(parts[i]);
        }
        //Using simple for loop method -1
        // for(int i=0;i<n;i++){
            //     res[i]=-1;
        //     for(int j=i+1;j<n;j++){
        //         if(ans[i]<ans[j]){
        //             res[i]=ans[j];
        //             break;
        //         }
        //     }
        // }
        // for(int x:res){
        //     System.out.print(x+" ");
        // }

        // using stack collection method-2

        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && st.peek()<=ans[i]){
                st.pop();
            }
            if(!st.empty()){
                res[i]=st.peek();
            }
            st.push(ans[i]);
        }
        // initializing with -1
        for(int x:res) System.out.print(x+" ");
    }
    public static void main(String[] args) {
        String s="6 8 0 1 3";
        nextGreater(s);

    }
}
