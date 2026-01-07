package Array.TwoDArrays;

public class TwoDSpiralMatrixPrint {
    public static void printSpiralMatrix(int [][]matrix){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while (startRow<=endCol && startCol<=endCol) {
            // Top
            for(int i=startCol;i<=endCol;i++){
                System.out.print(matrix[startCol][i]+" ");
            }
            // right
            for(int j=startRow+1;j<=endRow;j++){
                System.out.print(matrix[j][endCol]+" ");
            }
            // down
            for(int j=endCol-1;j>=startCol;j--){
                System.out.print(matrix[endRow][j]+" ");
            }
            // Left
            for(int j=endRow-1;j>=startRow+1;j--){
                System.out.print(matrix[j][startRow]+" ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
    public static void main(String[] args) {
        int [][]matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiralMatrix(matrix);
    }
}
