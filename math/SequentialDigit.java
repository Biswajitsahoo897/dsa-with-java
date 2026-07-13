package math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialDigit {
    static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=9;i++){
            int num=i;
            for(int j=i+1;j<=9;j++){
                num=num*10+j;
                if(num>=low && num<=high){
                    list.add(num);
                }
                if(num>high){
                    break;
                }
            }
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        int low=100,high=400;
        System.out.println(sequentialDigits(low, high));
    }
}
