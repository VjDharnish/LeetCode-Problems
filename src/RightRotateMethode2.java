import java.util.Arrays;

public class RightRotateMethode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int n=arr.length;
		int d=4;
		int result[]= new int[n];
		System.arraycopy(arr, n-d, result, 0, d);
		System.arraycopy(arr, 0, result, d, n-d);
		System.out.println(Arrays.toString(result));
				

	}

}
