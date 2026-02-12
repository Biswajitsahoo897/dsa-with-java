package backtracking;

public class GridWays {
    static int fact(int n){
        if(n==1||n==1) return 1;
        else return n*fact(n-1);
    }
    static int gridWaysUsingPermutation(int m,int n){
        int num=fact(n-1+m-1);
        int den=fact(n-1)*fact(m-1);
        return num/den;
    }
    // Time complexity is O(2^(n+m)) , worst TC
    static int gridWays(int i,int j,int m,int n){
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        } // last cell 
        if(i==n||j==n){
            return 0;
        } //boundary cond

        int w1=gridWays(i+1, j, m, n); //down
        int w2=gridWays(i, j+1, m, n); //right

        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3,m=3; //3*3 grid
        System.out.println(gridWays(0, 0, m, n));
        System.out.println(gridWaysUsingPermutation(4, 4));
    }
}
