
public class question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] X= {"ceo","alco","caaeio","ceai"};
		String[] Y = {"ec","oc","ceo"};
		int count =0;
		String newY = "";
		for(String s: Y) {
			newY+=s;
		}
		String newString = ""+newY.charAt(0);
		for(int i =1 ;i< newY.length();i++) {
			char c = newY.charAt(i);
			int k =0;
			for( k =0;k<newString.length();k++) {
				if(c==newString.charAt(k))
					break;
			}
			if(k==newString.length())
				newString+=c;
		}
		
		for(int i =0;i<X.length;i++) {
			String s = X[i];
			int j=0;
			int l =0;
			int m=0;
			while(l<s.length()&&j!=newString.length() && m<newString.length()) {
				if(newString.charAt(j) == s.charAt(l)) {
					j++;l=0;m++;
				}
				else if(newString.charAt(j) != s.charAt(l)) {
					l++;
				}
		}
			
			if(m==newString.length()) {
				count++;	
			}
		}
		System.out.println(count);
	}

}
