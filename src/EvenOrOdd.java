import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		System.out.println((x%2==0)?"Even":"Odd");
		

	}

}
