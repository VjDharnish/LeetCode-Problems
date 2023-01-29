
public class swap2NumWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=10;
		System.out.println(a+" "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);

	}

}
