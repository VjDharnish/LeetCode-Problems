
public class SubtractFromReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =123;
		int reverse=0,rem;
		int reserve = num;
		while(num!=0) {
			rem=num%10;
			num/=10;
			reverse=reverse*10+rem;
		}
		int result = reserve - reverse;
		System.out.println(result);


	}

}
