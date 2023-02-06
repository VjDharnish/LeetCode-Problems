// Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
// Note: You can only move either down or right at any point in time.
public class MInimumPathSum {
	public static int minPathSum(int[][] grid) {
        int m =grid.length;
        int n = grid[0].length;
        for(int row  = m-1;row>=0;row--){
            for(int col = n-1;col>=0;col--){
                if(row == m-1 && col==n-1)
                    continue;
                if(row == m-1){
                    grid[row][col]+= grid[row][col+1];
                }
                else if(col == n-1){
                    grid[row][col]+=grid[row+1][col];
                }
                else{
                    grid[row][col]+= Math.min(grid[row+1][col],grid[row][col+1]);
                }
            }
        }
        return grid[0][0];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
		System.out.println(minPathSum(grid));
	}
}
