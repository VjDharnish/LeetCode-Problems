import java.util.Arrays;

public class CountStringLengthGreater5 {
// Copunt number of STring Which have length >5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"Dharun","Kamalesh","Aadhirai","Mathiii","Gokul","Deepak","Deva"};
		int count =(int) Arrays.stream(str).filter(n-> n.length()>5).count();
		System.out.println(count);
		//Another way using Map
		int cnt = (int) Arrays.stream(str).mapToInt(String::length).filter(n->n>5).count();
		System.out.println(cnt);

	}

}
