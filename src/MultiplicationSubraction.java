
public class MultiplicationSubraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =5;
		System.out.println("Multiplication Table for "+num );
		for(int i=1;i<=10;i++) {
			System.out.format("%d X %d = %d\n",num,i,num*i);
		}
		System.out.println("Subraction Table for "+num);
		for(int i=1;i<=10;i++) {
			System.out.format("%d - %d = %d\n",num,i,num-i);
		}

	}

}
