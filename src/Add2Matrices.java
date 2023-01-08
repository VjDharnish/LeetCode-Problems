
public class Add2Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix1= {{1,1,1},{1,1,1},{1,1,1}};
		int[][] matrix2= {{2,2,2},{2,2,2},{2,2,2}};
		int m=matrix1.length;
		int n=matrix1[0].length;
		int[][] matrix = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		for(int[] i:matrix) {
			for(int j:i)
				System.out.print(j+" ");
		    System.out.println();
		}
	}

}
