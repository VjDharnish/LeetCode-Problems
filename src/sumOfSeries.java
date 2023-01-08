
public class sumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9,sum=0;
		int x=1;
		for(int i=1;i<=n;i++) {
			sum+=x;
			x=x*10+1;
		}
		System.out.println(sum);
	}

}
