public class PalindromeString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="mom";
		boolean flag = false;
		int left = 0,right = s.length()-1;
		while(left<right) {
			if(s.charAt(left)!= s.charAt(right)) {
				flag = true;
				break;
			}
			left++;right--;
			}
		if(flag) System.out.println("Not a Palindrome String");
		else System.out.println("Palindrome String");
	}

}
