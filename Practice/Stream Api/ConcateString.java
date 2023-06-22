import java.util.Arrays;
import java.util.stream.Collectors;

public class ConcateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"Dharun","Kamalesh","Aadhirai","Mathiii","Gokul","Deepak","Deva"};
		String concat = Arrays.stream(str).reduce("",(a,b)->a+b);
		System.out.println(concat);
		//With space Using Collectior class JOining
		String concatSpace = Arrays.stream(str).collect(Collectors.joining(" "));
		System.out.println(concatSpace);

	}

}
