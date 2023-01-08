
public class LinearSearchOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello world";
		char c= 'd';
		for(int i=0;i<str.length();i++) {
			if(c==str.charAt(i)) {
				System.out.println("Found at "+i);
				break;
			}				
		}
	}
}
