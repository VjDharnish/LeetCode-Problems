import java.util.Arrays;
import java.util.List;

public class FindAverage {
// =Fiond Average for lisr of Intgers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr =Arrays.asList(1,2,3,4,5);
		double avg  = arr.stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println(avg);
	}

}
