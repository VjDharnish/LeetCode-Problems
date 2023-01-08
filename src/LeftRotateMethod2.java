import java.util.Arrays;

public class LeftRotateMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		
		int n =arr.length;
		
		int result[]=new int[n];
		System.out.println(result.length);
		int d =3;
	    System.arraycopy(arr, d, result, 0, n-d);
		System.arraycopy(arr,0,result, n-d, d);
		System.out.println(Arrays.toString(result));

	}

}
