import java.util.ArrayList;
import java.util.List;

public class SentenceToStringWithoutStringFunction{
	public static void main(String[]args) {		
		String s="HI I am Dharun";
		List<String> str_arr=new ArrayList<>();
		char space= ' ';
		int m=0;
		for(int i=0;i<s.length();i++) {
			String new_str ="";
			if(s.charAt(i) == space) {
				for(int j=m;j<i;j++)
					new_str+=s.charAt(j);
				str_arr.add(new_str);
			    m=i;
			}
			
			else if(i==s.length()-1) {
				for(int j=m;j<=i;j++)
					new_str+=s.charAt(j);
				str_arr.add(new_str);
				}	
			}
				
	 System.out.println(str_arr);
		
	}
}