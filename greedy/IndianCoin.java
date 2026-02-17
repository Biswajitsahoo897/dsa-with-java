package greedy;

import java.util.ArrayList;

public class IndianCoin {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 200, 500};

        ArrayList<Integer> list=new ArrayList<>();
        int amt=590;
        for(int i=coins.length-1;i>=0;i--){
            while(amt>=coins[i]){
                list.add(coins[i]);
                amt-=coins[i];
            }
        }
        System.out.println(list);
    }
}
