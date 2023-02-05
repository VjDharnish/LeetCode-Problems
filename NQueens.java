import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class NQueens {
	public static List<String> arrToString(char[][] board){
        List<String> arr = new ArrayList<>();
        for(int i =0;i< board.length;i++){
            String s = new String(board[i]);
            arr.add(s);
        }
        return arr;
    }  
    public static void placeQueen(int row,char[][] board,int n,List<List<String>> result,int[] colCheck,int[] rightDiag,int[] leftDiag){
        if(row == n){
            result.add(new ArrayList(arrToString(board)));
            return ;
        }
        for(int i=0;i<n;i++){
            if(board[row][i]!='Q' && colCheck[i]!=1 && rightDiag[row+i]!=1 && leftDiag[(n-1)+(i-row)]!=1){
                board[row][i] ='Q';
                colCheck[i] =1;
                rightDiag[row+i] =1;
                leftDiag[(n-1)+(i-row)] = 1;
                placeQueen(row+1,board,n,result,colCheck,rightDiag,leftDiag);
                board[row][i] ='.';
                colCheck[i] =0;
                rightDiag[row+i] =0;
                leftDiag[(n-1)+(i-row)] = 0;
            }
        }

    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        int[] colCheck = new int[n];
        int[] rightDiag = new int[2*n -1];
        int[] leftDiag = new int[2*n-1]; 
        for(int i=0;i<board.length;i++){
            Arrays.fill(board[i],'.');
        }
        placeQueen(0,board,n,result,colCheck,rightDiag,leftDiag);
        return result;
 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		List<List<String>> res = solveNQueens(n);
		System.out.println(res);

	}

}
