package collections;

import java.util.HashSet;

public class HappyNumber {
    static boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            int temp=0;
            while(n>0){
                int rem=n%10;
                temp+=Math.pow(rem,2);
                n/=10;
            }
            n=temp;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));
    }
}
