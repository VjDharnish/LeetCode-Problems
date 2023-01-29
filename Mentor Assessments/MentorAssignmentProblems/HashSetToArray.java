import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		int[] arr =set.stream().mapToInt(i->i).toArray();
		System.out.println(Arrays.toString(arr));
		
		

	}

}
