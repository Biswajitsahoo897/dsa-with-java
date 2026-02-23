package Array;

class maxPoductSubarrayProblem {
    static int maxProduct(int []arr){
        int maxRes=Integer.MIN_VALUE;

        int maxLeftToRight=1;
        int maxRightToLeft=1;

        for (int i = 0; i < arr.length; i++) {
            if(maxLeftToRight==0){
                maxLeftToRight=1;
            }
            if(maxRightToLeft==0){
                maxRightToLeft=1;
            }
            maxLeftToRight*=arr[i];

            int j=arr.length-i-1;
            maxRightToLeft*=arr[j];

            maxRes=Math.max(maxLeftToRight,Math.max(maxRightToLeft,maxRes));
        }
        return maxRes;
    }
    public static void main(String[] args) {
        int []arr={-1,-2,-3,4,-2};
        System.out.println(maxProduct(arr));

    }
}
