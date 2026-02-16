// import java.util.Arrays;
// import java.util.Collections;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            long num=sc.nextLong();
            if(num==0){
                System.out.println(1);
                continue;
            }
            long power=1;
            int i=0;
            while(power<num){
                power=(long)Math.pow(2, i);
                i++;
            }
            if(power==num){
                System.out.println("True");
                continue;
            }
            else{
                System.out.println("False");
            }
        }
        sc.close();
    }
}

/*
Note:
u can only use Collections.reverseOrder() in an Integer array not int array

*/