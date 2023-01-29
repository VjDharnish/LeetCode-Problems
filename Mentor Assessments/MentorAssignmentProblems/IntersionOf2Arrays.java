import java.util.Arrays;
import java.util.HashSet;

public class IntersionOf2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,40};
		HashSet<Integer> set = new HashSet<>();
		for(int val:arr1) {
			set.add(val);
		}
		for(int val:arr2) {
			if(set.contains(val))
				System.out.print(val+" ");
		}
		
	}

}
