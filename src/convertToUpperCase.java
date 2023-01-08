
public class convertToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method 1
		String str= "Hello JaVa";
		String upper="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
				upper+=(char)(str.charAt(i)-32);
			else
				upper+=str.charAt(i);
		}
		System.out.println(upper);
		
		
		//Method 2
		String str2="HelLo coders";
		String str3="";
		char[] result = str2.toCharArray();
		for(int i=0;i<str2.length();i++) {
			if(result[i] >='a' && result[i] <= 'z')
				result[i] = (char) (result[i]-'a'+'A');
			str3+=result[i];
		}
		System.out.println(str3);
	
			
	}
}

