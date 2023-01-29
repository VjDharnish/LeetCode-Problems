
public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =123;
		int reverse=0;
		while(n!=0) {
			int x=n%10;
			reverse =reverse*10 +x;
			n/=10;
		}
		System.out.println(reverse);

	}

}
