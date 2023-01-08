
public class SumOfEachRowandColInMAtrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {{1,2,3,4},
				         {5,6,7,8},
				         {9,10,11,14}};
		int row_sum=0,col_sum=0;
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				row_sum+=matrix[i][j];		
				}
			System.out.format("Sum of Row %d: %d\n",i+1,row_sum);
			row_sum=0;
		}
		for(int i=0;i<matrix[0].length;i++) {
			for(int j=0;j<matrix.length;j++)
				col_sum+=matrix[j][i];	
			System.out.format("Sum of Column %d: %d\n",i+1,col_sum);
			col_sum=0;
		}

	}

}
