
public class Question06 {
	public static int[][] rotate3(int[][] matrix) {
		int row  = matrix.length;
		int col = matrix[0].length;
		int[][] rotateMatrix  = new int[row][col];
		for(int i =0;i<row;i++) {
			for(int j=0;j<col;j++) {
				rotateMatrix[i][j] =matrix[j][i]; 
			}
		}
		for(int i=0;i<row/2;i++) {
			for(int j =0;j<col;j++) {
				int temp = rotateMatrix[i][j];
				rotateMatrix[i][j] = rotateMatrix[row-1-i][j];
				rotateMatrix[row-1-i][j]= temp;
			}
		}
		return rotateMatrix;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] result = rotate3(matrix);
		for(int[] row:result) {
			for(int col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}

}
