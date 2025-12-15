package Array;

public class trappedWaterProblem {
    public static int trappedWater(int[] height){
        // calculate left max boundary array
        int n=height.length,area=0;
        int waterLevel[]=new int[n];
        int leftMax[]=new int[n];
        leftMax[0]=height[0];

        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        
        // calculate right max boundary array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for (int i = n-2; i >= 0; i--) { //started from n-2 bcz n-1 is initialized already 
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        // loop
        // calculate the waterlevel=min(leftmax boundary ,rightmax boundary)
        // trapped water
        int tw[]=new int[n];
        for (int i = 1; i < n-1; i++) {
            waterLevel[i]=Math.min(rightMax[i],leftMax[i]);
            int a=waterLevel[i]-height[i];
            tw[i]=(a>0)?a:0;
        }
        System.out.println("Trapped water array");
        
        for (int i : tw) {
            System.out.print(i+" ");
            area+=i;
        }
        System.out.println();
        return area;
    }


    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.err.println("The area of the trapped water is :"+trappedWater(height));
    }
}
