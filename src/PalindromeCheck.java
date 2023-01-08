import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		//Method 1
		String str = "madam";
		char[] temp =str.toCharArray();
	    String reverse="";
	    for(int i=temp.length-1;i>=0;i--) {
	    	reverse+=temp[i];
	    }
	    if(str.equals(reverse))
	    	System.out.println("Given String is Palindrome");
	    else
	    	System.out.println("Given String is not Palindrome");
	    
	    
	    //Method 2
	    int n =str.length(),j;
	    for(j=0;j<n;j++) {
	    	if(str.charAt(j) != str.charAt(n-1-j))
	    		break;			
	    }
	    if(j==n)
	    	System.out.println("Given String is Palindrome");
	    else
	    	System.out.println("Given String is not Palindrome");
	    

	}

}
