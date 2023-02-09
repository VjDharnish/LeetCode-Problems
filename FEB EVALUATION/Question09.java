
public class Question09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =7;
		int[][] matrix  = new int[n][n];
		int left =0,right = n;
		int top = 0,bottom = n;
		int flag =1;
		while(left<right && top<bottom) {
			
			for(int i =left;i<right;i++) {
				matrix[left][i] = (flag%2!=0)? 1:0;
			}
			top++;
			right--;
			for(int i =top;i<bottom;i++) {
				matrix[i][right]=(flag%2!=0)? 1:0;
			}
			
			bottom--;
			if(!(top<bottom && left<right))
				break;
			for(int i =right-1;i>=left;i--) {
				matrix[bottom][i]=(flag%2!=0)? 1:0;
			}
			for(int i =bottom-1;i>=top;i--) {
				matrix[i][left]=(flag%2!=0)? 1:0;
			}
			left++;
			flag++;
		}
		for(int[] row:matrix) {
			for(int col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}

}
