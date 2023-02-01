/*
Given an m x n matrix board where each cell is a battleship 'X' or empty '.', return the number of the battleships on board.

Battleships can only be placed horizontally or vertically on board. In other words, they can only be made of the shape 1 x k (1 row, k columns) or k x 1 (k rows, 1 column), where k can be of any size. At least one horizontal or vertical cell separates between two battleships (i.e., there are no adjacent battleships).
*/

class Solution {
    public int trace(char[][] board,int i,int j,int m,int n){
    
        if(j==n || i==m|| board[i][j] == '.')  return 1;
        board[i][j] = '.';
        if(i+1< m && board[i+1][j] == 'X') return trace(board,i+1,j,m,n);
        else return trace(board,i,j+1,m,n);

    }
    public int countBattleships(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int count =0;
        for(int i =0;i< m;i++){
            for(int j =0;j<n;j++){
                if(board[i][j] =='X'){
                    count+= trace(board,i,j,m,n);                   
                }
            }
        }
        return count;
    }
}
