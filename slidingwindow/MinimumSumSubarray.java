package slidingwindow;
import java.util.*;

public class MinimumSumSubarray {
    static int minimumSumSubarray(List<Integer> nums,int l,int r){

        int sum=0;
        int ans=Integer.MAX_VALUE;
        // start with the window size l to r
        for(int i=l;i<r;i++){

            // from 0 to the sliding window sum
            for(int j=0;j<i;j++){
                sum+=nums.get(j);
            }
            
            //check whether sum>0 or not 
            if(sum>0){
                ans=Math.min(ans,sum);
            }

            // current sliding widnow 
            for(int k=i;k<nums.size();k++){
                sum+=nums.get(k)-nums.get(k-i);
                // check condition if true then update
                if(sum>0){
                    ans=Math.min(sum,ans);
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(-2);
        list.add(1);
        list.add(4);

        // window size from l to r , variable window size
        int l=2,r=3;
        int ans=minimumSumSubarray(list, l, r);
        System.out.println(ans);
    }
}
