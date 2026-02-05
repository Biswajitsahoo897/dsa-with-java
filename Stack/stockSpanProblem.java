import java.util.Stack;
public class stockSpanProblem {
    static void stockSpanCalculation(int []stock){
        Stack<Integer> st=new Stack<>();
        int []span=new int[stock.length];
        for(int i=0;i<stock.length;i++){
            while(!st.empty()&&stock[st.peek()]<=stock[i]){
                st.pop();
            }
            if(!st.empty()){
                span[i]=i-st.peek();
            }else{
                span[i]=i+1; 
                //if it is empty
            }
            st.push(i);
        }
        System.out.println(st);
        for(int x:span){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int []stock={100,80,60,70,60,85,100};
        stockSpanCalculation(stock);
    }
}
