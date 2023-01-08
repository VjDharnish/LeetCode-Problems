import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RecursionSortingUsingRecursion {
	
	public static void sort(String[]str,int n) {
		if(n==1)
			return;
		for (int i=0; i<n-1; i++)
			if (str[i].compareTo( str[i+1])>0) {
				 String temp = str[i];
	                str[i] = str[i+1];
	                str[i+1] = temp;
			}
		sort(str, n-1);
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] str_arr= {};
		Pattern pat=Pattern.compile(" ");
		str_arr=pat.split(str);
		sort(str_arr, str_arr.length);
		System.out.println(Arrays.toString(str_arr));
		sc.close();
	}

}