
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class unionOf2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {-5,6,7,-9,10,13,15,17};
		int arr2[]= {2,-3,4,5,6,7,8,11,15,17};
		Set<Integer> arr = new HashSet<>();
		for(int i:arr1) {
			arr.add(i);
		}
		for(int i:arr2) {
			arr.add(i);
		}
		List<Integer> new_arr = new ArrayList<>(arr);
		Collections.sort(new_arr);
		for(int i:new_arr)
			System.out.print(i+" ");

	}
	

}
