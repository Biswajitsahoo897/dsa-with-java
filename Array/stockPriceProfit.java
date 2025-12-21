package Array;

public class stockPriceProfit {
    // same logic using Math.min and max (METHOD -1)
    static int maxProfit(int[] prices) {
        int n=prices.length;
        int maxProfit=0;
        int minValue=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            minValue=Math.min(prices[i],minValue);
            maxProfit=Math.max(prices[i]-minValue,maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        // same logic using if-else (METHOD -2)
        int prices[]={7,1,5,3,6,4};
        int n=prices.length;
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < n; i++) {
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            else if(prices[i]-minPrice>maxProfit){
                maxProfit=prices[i]-minPrice;
            }
        }
        System.out.println("Maximum profit is(using if-else) :"+maxProfit);
        System.out.println("Maximum profit is(using Math.min and max) :"+maxProfit(prices));
    }
}
