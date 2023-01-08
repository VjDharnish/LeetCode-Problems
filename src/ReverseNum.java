
public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123456789;
		int result=0;
		while(num>0) {
			int x=num%10;
			result= result*10 +x;
			num/=10;
		}
		System.out.println(result);

	}

}
