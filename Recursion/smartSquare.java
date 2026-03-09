package Recursion;
import java.util.*;

public class smartSquare {
    static int minCost;
    static ArrayList<int[]> list=new ArrayList<>();

    static boolean checkColRowDiagonal(int []arr){
        return ((arr[0]+arr[1]+arr[2])%5==0&&(arr[3]+arr[4]+arr[5])%5==0&& 
        (arr[6]+arr[7]+arr[8])%5==0 && (arr[0]+arr[3]+arr[6])%5==0 && 
        (arr[1]+arr[4]+arr[7])%5==0 && (arr[2]+arr[5]+arr[8])%5==0 &&
        (arr[0]+arr[4]+arr[8])%5==0 && (arr[2]+arr[4]+arr[6])%5==0);
    }

    static int cost(int []arr,int [][]mat){
        int minCost=Integer.MAX_VALUE;
        minCost=Math.abs(mat[0][0]-arr[0])+Math.abs(mat[0][1]-arr[1])+Math.abs(mat[0][2]-arr[2])+
        Math.abs(mat[1][0]-arr[3])+Math.abs(mat[1][1]-arr[4])+Math.abs(mat[1][2]-arr[5])+
        Math.abs(mat[2][0]-arr[6])+Math.abs(mat[2][1]-arr[7])+Math.abs(mat[2][2]-arr[8]);
        return minCost;
    }
    static void generate(int []arr,int idx,boolean []check){
        if(idx==9){
            if(checkColRowDiagonal(arr)){
                list.add(arr.clone());
                // add the list here
            }
            return;
        }
        for(int i=1;i<=9;i++){
            if(!check[i]){
                arr[idx]=i;
                check[i]=true;
                generate(arr,idx+1,check);
                check[i]=false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean []check=new boolean[10];
        int []arr=new int[9];
        generate(arr,0,check);
        // also to check here for the generated one and is it valid or not
        int t=sc.nextInt();
        while(t-->0){
            int [][]mat=new int[3][3]; 
            minCost=Integer.MAX_VALUE;


            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    mat[i][j]=sc.nextInt();
                    
                }
            }
            for(int []x:list){
                minCost=Math.min(minCost,cost(x,mat));
            }
            
            System.out.println(minCost);
        }       
        sc.close();
    }
}