import java.util.Arrays;
import java.util.HashSet;

public class FillDeuyplicateByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 2, 4, 1, 5, 6, 5};
		HashSet<Integer> set = new HashSet<>();
		for(int i =0;i<arr.length;i++) {
			if(set.contains(arr[i])) {
				arr[i]=0;
				continue;
			}
			set.add(arr[i]);
		}
		System.out.println(Arrays.toString(arr));

	}

}
