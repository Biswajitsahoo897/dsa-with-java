import java.util.ArrayList;
import java.util.List;

public class PrintTheStringVertically {
    static List<String> printVertically(String s){
        List<String> res=new ArrayList<>();
        String []words=s.split(" ");

        int maxWordLen=0;
        for(String t:words){
            maxWordLen=Math.max(maxWordLen,t.length());
        }

        for(int i=0;i<maxWordLen;i++){
            StringBuilder sb=new StringBuilder();

            for(String word:words){
                if(i<word.length()){
                    sb.append(word.charAt(i));
                }else{
                    sb.append(' ');
                }
            }
            res.add(sb.toString().stripTrailing());
        }
        return res;
    } 
    public static void main(String[] args) {
        String s="how are you";
        System.out.println(printVertically(s));
        
    }
}
