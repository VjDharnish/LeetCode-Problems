
public class BinearSearchofCharacteer {
	static int binarySearch(String str,char c) {
		int low = 0,high=str.length();
		while(low!=high) {
		int mid = (low + high)/2;
		if(c== str.charAt(mid))
			return mid;
		else if(c<str.charAt(mid))
			high =mid;
		else if(c>str.charAt(mid))
			low=mid;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdddedeefgh";
		char c= 'f';
		int idx = binarySearch(str,c);
		System.out.println("Character found at "+idx);
		
		
		

	}

}
