package Array.TwoDArrays;

public class bothDiagonalSum {
    public static void main(String[] args) {
        int [][]matrix={{1,2,3,4},{5,6,7,8},{9,19,11,12},{13,14,15,16}};
        int sumP=0;
        int sumS=0;
        int n=matrix.length-1;
        for(int i=0;i<matrix.length;i++){
            sumP+=matrix[i][i];
            sumS+=matrix[i][n-i];
        }
        System.out.println(sumP);
        System.out.println(sumS);
    }
}
