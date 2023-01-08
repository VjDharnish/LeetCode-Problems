
public class pattern50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int j=i;j<=n;j++)
				System.out.print(n-i+1+" ");	
			System.out.println();
		}	

	}

}
