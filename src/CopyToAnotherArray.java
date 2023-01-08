import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyToAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int old_arr[]= {1,2,3,4,5};
		//Method 1
		int new_arr[]= new int[old_arr.length];
		for(int i=0;i<old_arr.length;i++) {
			new_arr[i]=old_arr[i];
		}
		System.out.println(Arrays.toString(new_arr));
		//Method 2
		List<Integer> list = new ArrayList<>();
		for(int element:old_arr)
			list.add(element);
		System.out.println(list);

	}

}
