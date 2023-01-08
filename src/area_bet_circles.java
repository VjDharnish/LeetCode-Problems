import java.util.Scanner;

public class area_bet_circles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI= 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter RAdius 1:");
		double r1= sc.nextDouble();
		System.out.print("Enter radius 2:");
		double r2 = sc.nextDouble();
		sc.close();
		if(r1 >= 0 && r2>=0) {
		double area = PI*(Math.pow(Math.max(r1,r2), 2)-Math.pow(Math.min(r1, r2),2));
		System.out.format("Area= %.2f",area);

	}
		else
			System.out.println("Invalid Input");
	}

}
