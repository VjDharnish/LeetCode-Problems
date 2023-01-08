
public class ProductOfMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat1= {{1,1,1},{1,1,1},{1,1,1}};
		int[][] mat2= {{2,2,2},{2,2,2},{2,2,2}};
		int m1=mat1.length;
		int n1=mat1.length;
		int m2=mat2.length;
		int n2=mat2[0].length;
		int[][] out =new int[m1][n2];
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n2;j++) {
				for(int k=0;k<m2;k++)
				out[i][j]+= mat1[i][k]*mat2[k][j];
 			}
		}
		for(int[] i:out) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
