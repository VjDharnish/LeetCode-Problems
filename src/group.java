
public class group {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int n = 24;
	  for(int i=101;i<105;i++) {
		  for(int j=0;j<n;j+=4) {
			  if(i+j > 100+n)
				  break;
			  System.out.print(i+j +" ");
		  }
		  System.out.println();
	  }

	}

}
