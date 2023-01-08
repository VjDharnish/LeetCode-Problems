
public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {{1,2,3,7},{4,5,6,8},{7,8,9,9},{2,3,5,6}};
		int[][] transpose=new int[matrix.length][matrix[0].length];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++){
				transpose[i][j]=matrix[j][i];
			}
		}
		for(int[] i:transpose) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//Method 2
		System.out.println("Method 2");
		int n=matrix.length;
		  for(int k=0;k<matrix.length;k++) {
			for(int j=0;j<n;j++){
				if(k!=j) {
					int temp = matrix[k][j];
					matrix[k][j]=matrix[j][k];
					matrix[j][k]=temp;				}
			}
			for(int j=k;j>=0;j--) {
				int temp = matrix[j][k];
				matrix[j][k]=matrix[k][j];
				matrix[k][j]=temp;
				
			}
		  }

		
		for(int[] i:matrix) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
