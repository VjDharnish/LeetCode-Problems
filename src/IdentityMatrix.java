
public class IdentityMatrix {
	static boolean checkIdentity(int[][] matrix,int row,int col){
		if(row != col)
			return false;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if((i==j && matrix[i][j]!=1) || (i!=j && matrix[i][j]!=0))
					return false;							
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,0,0},{0,1,0},{0,0,1}};
		int row= matrix.length;
		int col=matrix[0].length;
		boolean result =checkIdentity(matrix,row,col);
		if(result)
			System.out.println("Given is a Identity Matrix");
		else
			System.out.println("Given is a Not Identity Matrix");

	}

}
