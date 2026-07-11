import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxNumberOfString {
    static String removeDigit(String number, char digit) {
        List<String> list=new ArrayList<>();

        for(int i=0;i<number.length();i++){
            char curr=number.charAt(i);
            if(curr==digit){
                String temp=number.substring(0,i)+number.substring(i+1);
                list.add(temp);
            }
            Collections.sort(list);
        }
        return list.get(list.size()-1);
    }
    public static void main(String[] args) {
        String s="1231";
        char digit='1';

        // s contains two '1's 0th index and last index removing 0th index it becomes =>231 and from last it becomes=>123
        // max(231,123)=231
        System.out.println(removeDigit(s, digit));

    }
}
