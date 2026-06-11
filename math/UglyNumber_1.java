package math;

public class UglyNumber_1 {
    public static void main(String[] args) {
        int n=14;// n=6 (2 and 3)true , n=70 (7*5*2) it should not have the prime factors except 2,3&5
        // boolean ans=false;
        if(n==0){ // 0 is no valid factorization
            System.out.println(false);
            return;
        }   

        // int []prime={2,3,5};


        for(int prime:new int[]{2,3,5}){
            while(n%prime==0){
                n/=prime;
            }
        }

        System.out.println(n==1); // if n is other than 1 then it is false 
        // not a ugly number

    }
}
