import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		int n=arr.length;
		
		List<Integer> rotated_arr =new ArrayList<>();
		int d=4;
		for(int i=d;i<n;i++) {
			rotated_arr.add(arr[i]);	
		}
		for(int i=0;i<d;i++)
			rotated_arr.add(arr[i]);
				
		System.out.println(rotated_arr);


	}

}
