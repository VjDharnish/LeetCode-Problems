
public class Check2Matrices {
	static boolean checkMatrices(int[][] mat1,int[][] mat2) {
		int row1=mat1.length;
		int col1=mat1.length;
		int row2=mat1.length;
		int col2=mat2.length;
		if(row1 !=row2 || col1 != col2) {
			return false;
		}
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				if(mat1[i][j] !=mat2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat1= {{1,1,1},{0,1,1},{1,1,1}};
		int[][] mat2= {{1,1,1},{1,1,1},{1,1,1}};
		
		boolean result=checkMatrices(mat1,mat2);
		if(result)
			System.out.println("Two Matrices are Identical");
		else
			System.out.println("Two Matrices are not Identical");
				

	}

}
