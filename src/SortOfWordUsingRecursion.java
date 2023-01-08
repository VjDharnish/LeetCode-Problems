import java.util.Scanner;

public class SortOfWordUsingRecursion{
	
	public static void sort(char[]str,int n) {
		if(n==1)
			return;
		for (int i=0; i<n-1; i++)
			if (str[i] < str[i+1])
				str[i]=(char) (str[i]+str[i+1]-(str[i+1]=str[i]));
		sort(str, n-1);
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		char str[]=s.toCharArray();
		sort(str, str.length);
		System.out.println(String.valueOf(str));
		sc.close();
	}

}
