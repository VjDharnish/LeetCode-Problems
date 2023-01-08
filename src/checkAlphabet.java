
public class checkAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x='a';
		int y =x;
		// Using Condition statement
		if(y>=97 && y<123 || y>=65 && y<91)
			System.out.println("Alphabet");
		else
			System.out.println("Not an Alphabet");
		// Using ternary operator
 System.out.println((y>=97 && y<123 || y>=65 && y<91)?"Alphabet":"Not an Alphabet");

	}

}
