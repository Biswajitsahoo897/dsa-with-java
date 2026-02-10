package backtracking;

import java.util.Scanner;

public class N_QueenProblem {
    public static boolean isSafe(char board[][],int row,int col){
        //vertically up
        for (int i = row-1; i >=0 ; i--) {
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // left diagonal 
        for (int i = row-1,j=col-1; i >=0&&j>=0 ; i--,j--) {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        
        // right diagonal 
        for (int i = row-1,j=col+1; i >=0&&j<board.length ; i--,j++) {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueen(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            return;
            // u can track of the number of solution by adding one variable & increment it
        }
        for (int j = 0; j < board.length; j++) {  
            if(isSafe(board, row,j)){
                board[row][j]='Q';
                nQueen(board, row+1);
                board[row][j]='X'; //backtracking step - means unplaced the previously explored ,so that i can explore other probable solutions
                
            }
        }
    }
    
    public static void printBoard(char b[][]){
        System.out.println("-------N-Queen Board-------");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int n=4;
        char [][]board=new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='X';
            }
        }
        nQueen(board, 0);

        sc.close();
    }
}
