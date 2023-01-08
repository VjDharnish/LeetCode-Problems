import java.util.Scanner;
public class FindSubstring {
	static int subString(String str1,String str2,int m,int n) {
		
		for(int i=0;i<=m-n;i++) {
			int j;
			for(j=0;j<n;j++)
	            if(str1.charAt(i+j) !=str2.charAt(j))
				break;
			if(j==n)
				return i;	
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("String 1:");
		String str1 = sc.next();
		System.out.println("String 2:");
		String str2=sc.next();
		int m = str1.length();
		int n = str2.length();
		int idx = subString(str1,str2,m,n);
		System.out.println("Output:"+idx);
		sc.close();

	}
}
