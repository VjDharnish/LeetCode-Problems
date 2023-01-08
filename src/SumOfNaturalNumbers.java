import java.util.Scanner;
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = num*(num+1)/2;
		System.out.println("Sum of Natural numbers:"+sum);
		int max=0;
		while(sum>0) {
			int x=sum%10;
			if(max<x)
				max=x;
			sum/=10;
		}
		System.out.println("Maximum of NAtural number Sum:"+max);
		sc.close();

	}

}
