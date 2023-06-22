import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class COnvertStribngToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"Dharun","Kamalesh","Aadhirai","Mathiii","Gokul","Deepak","Deva"};
		List<String>upperCaseArr=Arrays.stream(str).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseArr);

	}

}
