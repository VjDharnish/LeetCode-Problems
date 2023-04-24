import java.util.Arrays;
import java.util.Scanner;
//. Return the Array of product of All the elements except itself.

public class arrayProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n =scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		
		int product =1;
		int[]res =new int[arr.length];
		for(int i:arr)
			product*=i;
		for(int i =0;i<arr.length;i++)
			res[i]=product/arr[i];
		System.out.println(Arrays.toString(res));
	}

}
