
public class ReverseString {
	static String reverse(String str) {
		int idx= str.indexOf(" ");
		if(idx ==-1)
			return str;
		else
			return reverse(str.substring(idx+1,str.length()))+" "+ str.substring(0, idx);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I LOVE INDIA";
		String rev_str = reverse(str);
		System.out.println(rev_str);		
	}

}
