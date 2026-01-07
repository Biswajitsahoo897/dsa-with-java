package Array.TwoDArrays;

public class searchInSortedArray {
    static int searchArr(int [][]mat,int key){
        int row=0,col=mat[0].length-1;
        while(row<mat.length && col>=0){
            if(mat[row][col]==key){
                System.out.println("Found at index "+"("+row+","+col+")");
            }
            else if(key<mat[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int [][]matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key=90;
        System.out.println(searchArr(matrix,key));

    }
}
