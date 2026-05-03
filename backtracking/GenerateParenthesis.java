package backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    static List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        validParenthese(n,0,"",list);
        return list;

    }
    static void validParenthese(int len,int open,String curr,List<String> list){
        if(curr.length()==2*len){
            list.add(curr);
            return;
        }

        if(open<len){
            validParenthese(len,open+1,curr+"(",list);
        }

        if(curr.length()-open<open){
            validParenthese(len,open,curr+")",list);
        }
    }
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}


/*
          ""
        /    
      "("     
     /   \    
   "(("  "()"  
    |      |
 "(())"  "()()"

*/