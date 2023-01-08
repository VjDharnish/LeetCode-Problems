import java.util.ArrayList;
import java.util.List;

public class RightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int n=arr.length;
		List<Integer> rotated_arr =new ArrayList<>();
		int d=3;
		for(int i=n-d;i<n;i++) {
			rotated_arr.add(arr[i]);	
		}
		for(int i=0;i<n-d;i++)
			rotated_arr.add(arr[i]);
				
		System.out.println(rotated_arr);

	}

}
