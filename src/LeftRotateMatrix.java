
public class LeftRotateMatrix {
	static int[][] rotate(int arr[][],int row,int col){
		int top =0,bottom=row;
		int left = 0,right=col;
		int prev_val,curr_val;
		// k=top, l=left m=bootom n=right
		while(left<right && top<bottom) {
			if(top+1==bottom || left+1==right)
				break;
			prev_val=arr[top][left+1];
			for(int i=top;i<bottom;i++) {
				curr_val=arr[i][left];
				arr[i][left]=prev_val;
				prev_val=curr_val;
			}
			left++;
			for(int i=left;i<right;i++) {
				curr_val=arr[bottom-1][i];
				arr[bottom-1][i]=prev_val;
				prev_val=curr_val;
			}
			bottom--;
			for(int i=bottom-1;i>=top;i--) {
				curr_val= arr[i][right-1];
				arr[i][right-1]= prev_val;
				prev_val=curr_val;
			}
			right--;
			for(int i=right-1;i>=left;i--) {
				curr_val=arr[top][i];
				arr[top][i]=prev_val;
				prev_val=curr_val;
			}
			top++;
					
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int arr[][]= {{1,2,3,4},
			      {4,5,6,7},
			      {7,8,9,8},
			      {5,7,8,9}
			     };
	int k=2;
	int row=arr.length;
	int col= arr[0].length;

	for(int i=0;i<k;i++) {
	arr=rotate(arr,row,col);
	}
	for(int i[]:arr) {
		for(int j:i) {
			System.out.print(j+" ");
	}
	System.out.println();
	}
	}

}
