
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world";
		char[] arr =s.toCharArray();	
		int len =s.length();
		for(int i=0;i<len/2;i++) {
			char temp = arr[i];
			arr[i] = arr[len-1-i];
			arr[len-1-i] = temp;
		}
		String reverse = String.copyValueOf(arr);
		System.out.println(reverse);

	}

}
