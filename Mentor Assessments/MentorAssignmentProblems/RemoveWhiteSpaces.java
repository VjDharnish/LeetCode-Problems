
public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hi Hello Welcome";
		//using Replace methods
		System.out.println(s.replace(" ",""));
		//without replace method
		String newS ="";
		int i =0;
		while(s.indexOf(" ",i)!=-1) {
			int j =s.indexOf(" ",i);
			newS+=s.substring(i,j);
			i= j+1;
		}
		newS+=s.substring(i);
		System.out.println(newS);
	}

}
