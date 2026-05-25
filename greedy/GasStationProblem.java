package greedy;

import java.util.Arrays;

public class GasStationProblem {
    static int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum=Arrays.stream(gas).sum();
        int costSum=Arrays.stream(cost).sum();

        if(gasSum<costSum){
            return -1;
        }
        int pos=0;
        int sum=0;
        for(int i=0;i<gas.length;i++){
            sum+=gas[i]-cost[i];
            if(sum<0){
                sum=0;
                pos=i+1;
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        int []gas = {1,2,3,4,5}; 
        int []cost = {3,4,5,1,2};

        System.out.println(canCompleteCircuit(gas, cost));
    }
}
