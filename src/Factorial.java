
public class Factorial {
	static int fact(int n) {
		return (n==1||n==0)?1:n*fact(n-1); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int fact = fact(n);
		System.out.println("Factorial of "+n+" is "+fact);
		int sum=0;
		while(fact>0) {
			int x= fact%10;
			sum+=x;
			fact/=10;
		}
		System.out.println("Sum nof Digits:"+sum);

	}

}
