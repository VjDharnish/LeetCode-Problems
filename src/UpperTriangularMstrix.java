
public class UpperTriangularMstrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3,4},{4,5,6,6},{7,8,9,9},{2,3,4,5}};
		int row= matrix.length;
		int col=matrix[0].length;
		if(row!=col)
			System.out.println("Not valid to print Upper Triangle");
		else {
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(i>j)
						matrix[i][j]=0;
				}
			}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		}
		
	}

}
