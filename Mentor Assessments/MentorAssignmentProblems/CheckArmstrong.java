import java.util.ArrayList;

public class CheckArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1634;
		int n=num;
		int numSize= 0;
		ArrayList<Integer> arr = new ArrayList<>();
		while(n>0) {
			int x = n%10;
			arr.add(x);
			numSize++;
			n/=10;
		}
		int sum =0;
	
		for(int i: arr) {
			sum+= Math.pow(i, numSize);
		}
		System.out.println(sum);
		System.out.println(num==sum);
		

	}

}
