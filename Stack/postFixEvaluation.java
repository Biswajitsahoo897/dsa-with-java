import java.util.Stack;
public class postFixEvaluation{
    static int evalution(String s){
        String []str=s.split("\\s+");
        Stack<Integer> stack=new Stack<>();
        for(String x:str){
            if(x.equals("-")||x.equals("+")||x.equals("/")||x.equals("*")){
                int b=stack.pop();
                int a=stack.pop();

                if(x.equals("-")) stack.push(a-b);
                else if(x.equals("+")) stack.push(b+a);
                else if(x.equals("*")) stack.push(b*a);
                else if(x.equals("/")) stack.push(a/b);
            }else{
                stack.push(Integer.parseInt(x));
            }
        }
        return stack.peek();
        // return result which is the peek element
    }
    public static void main(String[] args) {
        String s="10 6 9 3 + -11 * / * 17 + 5 +";
        System.out.println(evalution(s));
    }
}