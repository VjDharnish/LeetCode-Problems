
public class First5PrimeFibonacciSEries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int a = -1,b=1;
		
		for(int i=0;i<n;i++){
			int c =a+b;
			if(c>1) {	
			boolean flag = true;
			for(int j=2;j<=c/2;j++) {
				if(c%j==0) {
					flag = false;
					break;
					}
			}
			if(flag) 
			System.out.println(c);	
			}
			a=b;
			b=c;
		}
		

	}

}
