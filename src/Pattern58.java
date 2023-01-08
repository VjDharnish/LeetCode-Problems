
public class Pattern58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n;j++) {
				if(j<=i)
					System.out.print("*");
				else
					System.out.print("_");
			}
			for(int j=n;j>=1;j--) {
				if(j<=i)
					System.out.print("*");
				else
					System.out.print("_");
			}
			System.out.println();
			
		}
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=i)
					System.out.print("*");
				else
					System.out.print("_");
			}
			for(int j=n;j>=1;j--) {
				if(j<=i)
					System.out.print("*");
				else
					System.out.print("_");
			}
			
			System.out.println();
		}

	}

}
