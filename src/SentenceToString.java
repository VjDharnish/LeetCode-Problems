
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SentenceToString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] str_arr= {};
		// method 1
		Pattern pat=Pattern.compile(" ");
		str_arr=pat.split(str);
		System.out.println(Arrays.toString(str_arr));
		
		// Method 2
		String[] new_arr=str.split(" ");
		System.out.println(Arrays.toString(new_arr));
		sc.close();
	}

}