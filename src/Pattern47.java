
public class Pattern47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++) {
			int num =1;
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int j=1;j<i;j++)
				System.out.print(num++ );
			for(int j=1;j<=i;j++)
				System.out.print(num-- );
			System.out.println();
		}

	}

}
