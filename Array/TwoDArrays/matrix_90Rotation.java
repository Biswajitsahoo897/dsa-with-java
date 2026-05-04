package Array.TwoDArrays;

public class matrix_90Rotation {
    static void rotate(int[][] matrix) {
        int n=matrix.length;
        // transpose step
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){    
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // reverse the matrix row-wise
        for(int i=0;i<matrix.length;i++){
            
            int left=0,right=n-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }

        }
    }
    public static void main(String[] args) {
        int [][]mat={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(mat);
    }
}
