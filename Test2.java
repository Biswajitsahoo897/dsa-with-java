import java.util.*;
public class Test2 {

    static void subsets(String s, int index, String ans){

        if(index == s.length()){
            if(ans.length() > 0)
                System.out.println(ans);
            return;
        }
        // include
        subsets(s, index+1, ans + s.charAt(index));

        // exclude
        subsets(s, index+1, ans);
    }

    public static void main(String[] args){
        subsets("ABC",0,"");
    }
}

