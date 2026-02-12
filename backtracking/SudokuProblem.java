package backtracking;

public class SudokuProblem {
    static boolean isSafe(int [][]b,int row ,int col,int digit){
        // for col
        for(int r=0;r<9;r++){
            if(b[r][col]==digit){
                return false;
            }
        }
        // for row
        for(int c=0;c<9;c++){
            if(b[row][c]==digit){
                return false;
            }
        }
        // for grid
        //starting row and col of the grid
        int sr=(row/3)*3; 
        int sc=(col/3)*3;
        for(int r=sr;r<sr+3;r++){
            for(int c=sc;c<sc+3;c++){
                if(b[r][c]==digit){
                    return false;
                }
            }
        }
        return true;
        
    }
    
    static boolean sudokuSolver(int [][]b,int row,int col){
        // base case
        if(row==9){
            return true;
        }
        // recursion case
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0; 
        }

        if(b[row][col]!=0){
            return sudokuSolver(b, nextRow, nextCol);
        }else{
            for (int digit = 1; digit <=9; digit++) {
                if(isSafe(b, row, col, digit)){
                    b[row][col]=digit;
                    if(sudokuSolver(b, nextRow, nextCol)){
                        return true;
                    }
                }
                b[row][col]=0; //This is the backtrack step, if digit didnt lead to solution then remove it
            }
        }
        return false;
    }

    static void displaySudoku(int [][]sudoku){
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] board = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };
        if(sudokuSolver(board, 0, 0)){
            System.out.println("Solution exists");
            displaySudoku(board);
            return;
        }else{
            System.out.println("Solution doesnt exist");
            return;
        }
        
    }
}
