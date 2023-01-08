
public class FrequencyOfOddEvenElementsInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int row= matrix.length;
		int col=matrix[0].length;
		int even=0,odd=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(matrix[i][j]%2 ==0)
					even++;
				else
					odd++;
			}	
		}
		System.out.println("Even="+even);
		System.out.println("Odd="+odd);

	}

}
