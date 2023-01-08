
public class pyramid_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int count =1,row=0;
		for(int i=1;i<=n/2;i++) {
			row+=i;
			if(row>=n) {
				row=i;
				break;
			}
		}
		for(int i=1;i<=row;i++) {
			
			for(int j=i;j<=row;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++) {
				System.out.print(count++ +" ");
			}
			System.out.println();
		}

	}

}
