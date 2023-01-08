
public class SparseMatrix {
	static boolean checkSparse(int[][] matrix) {
		int size =matrix.length *matrix[0].length;
		int count =0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				if(matrix[i][j]==0)
					count+=1;
			}
		}
		if(count>size/2)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {{1,0,0},{1,1,1},{0,1,0}};
		boolean result =checkSparse(matrix);
		if(result)
			System.out.println("Sparse Matrix");
		else
			System.out.println("Not a Sparse Matrix");

	}

}
