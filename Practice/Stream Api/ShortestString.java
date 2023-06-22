import java.util.Arrays;
import java.util.Comparator;

public class ShortestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"Dharun","Kamalesh","Aadhirai","Mathiii","Gokul","Deepak","Deva"};
		String  shortest = Arrays.stream(str).reduce((a,b)->a.length()<b.length()?a:b).get();
		System.out.println(shortest);
		//Anothetr way
		String  shortes = Arrays.stream(str).min(Comparator.comparingInt(String::length)).get();
		System.out.println(shortes);

	}

}
