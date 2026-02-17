package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static void main(String[] args) {
        // int []value={60,100,120};
        // int []weight={10,20,30};
        // int W=50;

        int[] value  = {30, 40, 45, 77, 90};
        int[] weight = {5, 10, 15, 22, 25};
        int W = 40;

        double [][]knapsack=new double[weight.length][4];

        ArrayList<Integer> list=new ArrayList<>();
        // as we have to sort the array , meanwhile we have to also keep track of the weight and values

        for (int i = 0; i < knapsack.length; i++) {
            knapsack[i][0]=i;
            knapsack[i][1]=weight[i];
            knapsack[i][2]=value[i];
            knapsack[i][3]=(double) value[i]/weight[i];
        }

        Arrays.sort(knapsack,Comparator.comparingDouble(o->o[3]));

        double currValue=0;

        for(int i=knapsack.length-1;i>=0;i--){
            if(knapsack[i][1]<=W){
                list.add((int)knapsack[i][0]);
                currValue+=knapsack[i][2];
                W-=knapsack[i][1];
            }else{
                list.add((int)knapsack[i][0]);
                currValue+=knapsack[i][3]*W;
                break;
            }
        }
        
        System.out.println("Value: "+currValue);
        for (int i : list) {
            System.out.print("Item" + i + " ");
        }
    }
}
