
public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str = "abcefdefgh";
    String pat ="def";
    
    int m = str.length(),n=pat.length(),i,j;
    
    for(i=0;i<=m-n;i++) {
    	for(j=0;j<n;j++) {
    		if(str.charAt(i+j)!=pat.charAt(j)) {
    			break;
    		}
    	}
        if(j==n) {
        	System.out.print("pattern found at "+i);
        }
    }
	}

}
