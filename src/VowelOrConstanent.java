import java.util.Scanner;

public class VowelOrConstanent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc =new Scanner(System.in);
      char C= sc.next().charAt(0);
      switch(C) {
      case 'a':case 'e':case 'i':case 'o':case 'u':
    	  System.out.println("Vowel");
    	  break;
      default:
    	  System.out.println("Consanant");
    	  
      }
      sc.close();
	}

}
