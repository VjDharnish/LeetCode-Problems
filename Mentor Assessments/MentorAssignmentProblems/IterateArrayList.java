import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class IterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.addAll(Arrays.asList(1,2,3,4,5));
		//Using For Loop
		for(int i=0;i<arr.size();i++) {
			arr.get(i);
		}
		//Using While Loop
		Iterator<Integer> itr =arr.iterator();
		while(itr.hasNext()) {
			itr.next();
		}
		//Using Advanced For Loop
		for(Integer i:arr) {
			System.out.println(i);
		}
		

	}

}
